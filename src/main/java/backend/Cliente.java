package backend;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cedula; 
    private String nombre;
    private String direccion;
    private String telefono; 
    private String correo;
    private List<Pedido> pedidos;

    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pedidos = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    // METHODS
    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public void consultarPedido(Pedido pedido) {
        System.out.println("Consulta del cliente al pedido:");
        System.out.println("ID del pedido: " + pedido.getIdPedido());
    }

     public void PagarPedido(Pedido pedido) {
        System.out.println("El cliente " + nombre + " realiza el pago del pedido.");
        pedido.pagarPedido();
    }
}

