package co.edu.cue.Model;

public class DetalleVenta {

    private Juguete juguete;
    private int cantidad;
    private Double subtotal;

    public DetalleVenta() {
    }

    public DetalleVenta(Juguete juguete, int cantidad) {
        this.juguete = juguete;
        this.cantidad = cantidad;
        this.subtotal = juguete.getPrecio() + cantidad;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
