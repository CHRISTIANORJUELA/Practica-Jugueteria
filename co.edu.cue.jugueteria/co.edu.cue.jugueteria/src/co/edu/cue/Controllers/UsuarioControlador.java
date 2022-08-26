package co.edu.cue.Controllers;

import co.edu.cue.Services.ServicesImpl.UsuarioServiceImpl;

import javax.swing.*;

public class UsuarioControlador {

    private UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();

    public void agregarCliente(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String documento = JOptionPane.showInputDialog("Ingrese el documento del cliente");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del cliente");
        usuarioService.agregarCliente(nombre, documento, telefono, direccion, fechaNacimiento, correo);
    }

    public void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        String documento = JOptionPane.showInputDialog("Ingrese el documento del empleado");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        Double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
        String fechaDeIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado");
        usuarioService.agregarEmpleado(nombre, documento, telefono, direccion, salario, fechaDeIngreso);
    }

    public UsuarioServiceImpl getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioServiceImpl usuarioService) {
        this.usuarioService = usuarioService;
    }
}
