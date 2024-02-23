package backend;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<Producto> productos;
    private EstadoPedido estado;

    public Pedido(int idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = estado;
    }
    
    public void registrarProducto(Producto producto)
    {
        productos.add(producto);   
    }
    
    public List<Producto> getProducto(){
        return productos;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
        
    public List<Producto> getProductos() {
        return productos;
    }

    public int getIdPedido() {
        return idPedido;
    }
    

    public double calcularTotalPedido() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    
        public void aprobarPedido() {
        estado = EstadoPedido.APROBADO;
    }
        
    public void pagarPedido() {
        estado = EstadoPedido.PAGADO;
    }
   
}
