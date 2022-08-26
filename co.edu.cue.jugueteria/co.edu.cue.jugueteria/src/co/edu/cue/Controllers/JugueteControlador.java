package co.edu.cue.Controllers;
import co.edu.cue.Services.ServicesImpl.JugueteServiceImpl;

import javax.swing.*;

public class JugueteControlador {

    private JugueteServiceImpl jugueteService = new JugueteServiceImpl();

    public void agregarJuguete() {
        String nombre = JOptionPane.showInputDialog("Escriba el nombre");
        String material = JOptionPane.showInputDialog("Escriba el nombre del material: Plastico, Tela , Electronico");
        Double precio = Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Escriba cuantos juguetes hay disponibles"));
        jugueteService.agregarJuguete(nombre, material, precio, stock);
    }

    public void disminuirExistencias() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que quiere disminuir "));
        String nombreJuguete = JOptionPane.showInputDialog("Ingrese el nombre del juguete que quiere modificar");
        jugueteService.disminuirCantidadDeJuguetes(nombreJuguete, cantidad);
    }

    public void aumentarExistencias() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que quiere aumentar "));
        String nombreJuguete = JOptionPane.showInputDialog("Ingrese el nombre del juguete que quiere modificar");
        jugueteService.aumentarCantidadDeJuguetes(nombreJuguete, cantidad);
    }

    public void informarJuguetesPorTipo() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de juguete que desea consultar su cantidad (Plastico, Electronico, Tela): ");
        jugueteService.informarJuguetesPorTipo(tipo);
    }


    public void informarCantidadTotal() {
        jugueteService.informarCantidadTotalJuguetes();
    }

    public void informarValorTotal() {
        jugueteService.informarValorTotalJuguetes();
    }

    public void informarTipoConMasJuguetes() {
        jugueteService.informarTipoConMasJuguetes();
    }

    public void informarTipoConMenosJuguetes() {
        jugueteService.informarTipoConMenosJuguetes();
    }

    public void informarJuguetesConValorMayorAlIndicado() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que desea"));
        jugueteService.informarJuguetesMasCarosQueValorIndicado(valor);
    }

    public JugueteServiceImpl getJugueteService() {
        return jugueteService;
    }

    public void setJugueteService(JugueteServiceImpl jugueteService) {
        this.jugueteService = jugueteService;
    }
}
