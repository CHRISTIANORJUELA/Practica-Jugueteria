package co.edu.cue.Services;

import co.edu.cue.Model.Cliente;
import co.edu.cue.Model.Empleado;

public interface UsuarioService {

    void agregarCliente(String nombre, String documento, String telefono, String direccion, String fechaNacimiento, String correo);

    void agregarEmpleado(String nombre, String documento, String telefono, String direccion, Double salario, String fechaDeIngreso);

    Empleado buscarEmpleado(String documento);

    Cliente buscarCliente(String documento);
}
