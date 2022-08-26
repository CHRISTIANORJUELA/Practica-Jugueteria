package co.edu.cue.Services;

import co.edu.cue.Model.Cliente;
import co.edu.cue.Model.DetalleVenta;
import co.edu.cue.Model.Empleado;
import co.edu.cue.Model.Juguete;
import co.edu.cue.Services.ServicesImpl.JugueteServiceImpl;
import co.edu.cue.Services.ServicesImpl.UsuarioServiceImpl;

public interface VentaService {

    void crearVenta(String fechaDeVenta, String nombreCliente, String nombreEmpleado, JugueteServiceImpl jugueteService, UsuarioServiceImpl usuarioService);

    DetalleVenta[] crearDetalleVenta(JugueteServiceImpl jugueteService);

}
