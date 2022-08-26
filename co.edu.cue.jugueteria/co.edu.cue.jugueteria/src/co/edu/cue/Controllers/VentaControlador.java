package co.edu.cue.Controllers;

import co.edu.cue.Services.ServicesImpl.JugueteServiceImpl;
import co.edu.cue.Services.ServicesImpl.UsuarioServiceImpl;
import co.edu.cue.Services.ServicesImpl.VentaServiceImpl;

import javax.swing.*;

public class VentaControlador {

    private VentaServiceImpl ventaService = new VentaServiceImpl();

    public void crearVenta(JugueteServiceImpl jugueteService, UsuarioServiceImpl usuarioService) {
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la venta");
        String documentoCliente = JOptionPane.showInputDialog("Ingrese el documento del cliente");
        String documentoEmpleado = JOptionPane.showInputDialog("Ingrese el documento del empleado:");
        ventaService.crearVenta(fecha,documentoCliente,documentoEmpleado, jugueteService, usuarioService);
    }
}
