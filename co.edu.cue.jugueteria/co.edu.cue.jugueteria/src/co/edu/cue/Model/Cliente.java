package co.edu.cue.Model;

import java.util.Date;

public class Cliente extends Usuario {
    private String fechaDeNacimiento;
    private String correo;

    public Cliente(){

    }

    public Cliente(String nombre, String documento, String telefono, String direccion, String fechaDeNacimiento, String correo) {
        super(nombre, documento, telefono, direccion);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.correo = correo;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
