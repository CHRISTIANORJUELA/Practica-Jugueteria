package co.edu.cue.Services.ServicesImpl;

import co.edu.cue.Model.Cliente;
import co.edu.cue.Model.Empleado;
import co.edu.cue.Services.UsuarioService;
import javax.swing.*;

public class UsuarioServiceImpl implements UsuarioService {

    private Cliente clientes[] = new Cliente[20];
    private Empleado empleados[] = new Empleado[5];

    @Override
    public void agregarCliente(String nombre, String documento, String telefono, String direccion, String fechaNacimiento, String correo) {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] == null){
                clientes[i] = new Cliente(nombre, documento, telefono, direccion, fechaNacimiento, correo);
                JOptionPane.showMessageDialog(null, "El cliente "+nombre+ " ha sido creado");
                break;
            }else if(i == clientes.length-1){
                JOptionPane.showMessageDialog(null, "No se pueden agregar mas clientess");
            }
        }
    }

    @Override
    public void agregarEmpleado(String nombre, String documento, String telefono, String direccion, Double salario, String fechaDeIngreso) {
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i] == null){
                empleados[i] = new Empleado(nombre, documento, telefono, direccion, salario, fechaDeIngreso);
                JOptionPane.showMessageDialog(null, "El empleado "+nombre+ " ha sido creado");
                break;
            }else if(i == empleados.length-1){
                JOptionPane.showMessageDialog(null, "No se pueden agregar mas empleados");
            }
        }
    }

    @Override
    public Empleado buscarEmpleado(String documento) {
        for (int i = 0; i < empleados.length; i++) {
            if(empleados[i].getDocumento().equalsIgnoreCase(documento)){
                System.out.println("empleado"+empleados[i]);
                return empleados[i];
            }
        }
        return null;
    }

    @Override
    public Cliente buscarCliente(String documento) {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i].getDocumento().equalsIgnoreCase(documento)){
                System.out.println("cliente"+clientes[i]);
                return clientes[i];
            }
        }
        return null;
    }
}
