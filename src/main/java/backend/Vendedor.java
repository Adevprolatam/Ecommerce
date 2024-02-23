package backend;

import java.util.List;
public class Vendedor {
    public void consultarPedidoCliente(Pedido pedido) {
        Cliente cliente = pedido.getCliente();
        List<Producto> productos = pedido.getProductos();
        System.out.println("Pedido del cliente:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Correo del cliente: " + cliente.getCorreo());
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + ": " + producto.getPrecio());
        }
    }
    public void aprobarPedidoCliente(Pedido pedido) {
        /////////////////////
        pedido.aprobarPedido();
        System.out.println("Pedido del cliente aprobado por el vendedor.");
    }

}
