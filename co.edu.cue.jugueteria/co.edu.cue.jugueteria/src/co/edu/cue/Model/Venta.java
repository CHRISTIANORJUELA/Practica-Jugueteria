package co.edu.cue.Model;

import java.util.Arrays;

public class Venta{

    private String fechaDeVenta;
    private DetalleVenta detalles[] = new DetalleVenta[5];
    private Cliente cliente;
    private Empleado empleado;

    public Venta() {
    }

    public Venta(String fechaDeVenta, DetalleVenta[] detalles, Cliente cliente, Empleado empleado) {
        this.fechaDeVenta = fechaDeVenta;
        this.detalles = detalles;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(String fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    public DetalleVenta[] getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleVenta[] detalles) {
        this.detalles = detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fechaDeVenta='" + fechaDeVenta + '\'' +
                ", detalles=" + Arrays.toString(detalles) +
                ", cliente=" + cliente.getNombre() +
                ", empleado=" + empleado.getNombre() +
                '}';
    }
}
