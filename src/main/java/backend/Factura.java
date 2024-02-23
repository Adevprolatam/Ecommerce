package backend;

import java.util.Date;

public class Factura {
    private int idFctura; 
    private Pedido pedido;
    private Date fechaEmision;
    private double total;
    
    //impuesto
    private static final double IMPUESTO = 0.15;

    public Factura(int idFctura, Pedido pedido, Date fechaEmision, double total) {
        this.idFctura = idFctura;
        this.pedido = pedido;
        this.fechaEmision = fechaEmision;
        this.total = total;
        calcularTotal();
    }
    
    private void calcularTotal() {
        double totalPedido = pedido.calcularTotalPedido();
        double impuesto = totalPedido * IMPUESTO;
        total = totalPedido + impuesto;
    }
}
