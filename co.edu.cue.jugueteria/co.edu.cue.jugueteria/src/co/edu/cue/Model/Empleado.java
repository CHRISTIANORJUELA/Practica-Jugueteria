package co.edu.cue.Model;

public class Empleado extends Usuario {

    private Double salario;
    private String fechaDeIngresoLaboral;

    public Empleado(){

    }

    public Empleado(String nombre, String documento, String telefono, String direccion, Double salario, String fechaDeIngresoLaboral) {
        super(nombre, documento, telefono, direccion);
        this.salario = salario;
        this.fechaDeIngresoLaboral = fechaDeIngresoLaboral;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFechaDeIngresoLaboral() {
        return fechaDeIngresoLaboral;
    }

    public void setFechaDeIngresoLaboral(String fechaDeIngresoLaboral) {
        this.fechaDeIngresoLaboral = fechaDeIngresoLaboral;
    }
}
