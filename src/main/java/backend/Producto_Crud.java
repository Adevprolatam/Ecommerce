/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
// IMPORTS
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.bson.Document;

/**
 *
 * @author dell
 */
public class Producto_Crud {
    private final MongoCollection<Document> coleccionDatos;
    private int indiceDatos;

    private int obtenerUltimoIndice(MongoCollection<Document> coleccion) {
        Document ultimoDocumento = coleccion.find().sort(new Document("indice", -1)).limit(1).first();
        if (ultimoDocumento != null) {
            return ultimoDocumento.getInteger("indice", 0);
        } else {
            return 0;
        }
    }

    // CONSTRUCTOR
    public Producto_Crud(MongoDatabase database) {
        if (database != null) {
            coleccionDatos = database.getCollection("Producto");
            indiceDatos = obtenerUltimoIndice(coleccionDatos) + 1;
        } else {
            throw new IllegalArgumentException("La base de datos no puede ser nula");
        }
    }
 
    
    // CREAR PRODUCTO
    public void crearProductoDB(Producto producto) {
        try {
            Document doc = new Document("codigo", producto.getCodigo())
                    .append("nombre", producto.getNombre())
                    .append("descripcion", producto.getDescripcion())
                    .append("precio", producto.getPrecio())
                    .append("stock", producto.getStock());
            coleccionDatos.insertOne(doc);
            System.out.println("Producto insertado en la base de datos");
        } catch (MongoException e) {
            System.err.println("Error al almacenar el producto en la base de datos: " + e.getMessage());
        }
    }
    
    // Listar Producto
    public List<Producto> buscarProductos(String criterio, String valor) {
    List<Producto> listaProductos = new ArrayList<>();
    try {
        if (coleccionDatos != null) {
            Document filtro = new Document();
            if (criterio.equalsIgnoreCase("Codigo")) {
                filtro.append("codigo", Integer.parseInt(valor));
            } else if (criterio.equalsIgnoreCase("Descripcion")) {
                // Usamos expresión regular para buscar en descripción
                filtro.append("descripcion", Pattern.compile(valor, Pattern.CASE_INSENSITIVE));
            } else if (criterio.equalsIgnoreCase("Nombre")) {
                // Usamos expresión regular para buscar en nombre
                filtro.append("nombre", Pattern.compile(valor, Pattern.CASE_INSENSITIVE));
            }
            
            FindIterable<Document> cursor;
            if (filtro.isEmpty()) {
                cursor = coleccionDatos.find();
            } else {
                cursor = coleccionDatos.find(filtro);
            }
            
            MongoCursor<Document> iterator = cursor.iterator();
            while (iterator.hasNext()) {
                Document documentoProducto = iterator.next();
                
                int codigo = documentoProducto.getInteger("codigo");
                String nombre = documentoProducto.getString("nombre");
                String descripcion = documentoProducto.getString("descripcion");
                double precio = documentoProducto.getDouble("precio");
                int stock = documentoProducto.getInteger("stock");
                
                Producto producto = new Producto(codigo, nombre, descripcion, precio, stock);
                listaProductos.add(producto);
            }
            iterator.close();
        } else {
            System.err.println("La colección de datos es nula");
        }
    } catch (NumberFormatException e) {
        System.err.println("Error al convertir el valor: " + e.getMessage());
    } catch (MongoException e) {
        System.err.println("Error al realizar la búsqueda de productos: " + e.getMessage());
    }
    return listaProductos;
}

  
    
}
