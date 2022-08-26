package co.edu.cue.Application;

import co.edu.cue.Controllers.JugueteControlador;
import co.edu.cue.Controllers.UsuarioControlador;
import co.edu.cue.Controllers.VentaControlador;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        final JugueteControlador jugueteControlador = new JugueteControlador();
        final UsuarioControlador usuarioControlador = new UsuarioControlador();
        final VentaControlador ventaControlador = new VentaControlador();

        while(true){
            String opcion = JOptionPane.showInputDialog("Ingrese la opcion que desea: \n 1.Juguetes \n 2.Agregar Cliente\n 3.Agregar empleado\n 4.Vender Juguetes");

            switch (opcion){
                case "1":
                    String opcion2 = JOptionPane.showInputDialog("Ingrese la opcion que desea \n1.Agregar Juguete \n2.Disminuir existencias \n3.Aumentar existencias\n4.Informar juguete por tipo\n5.Informar cantidad total de juguetes\n6.Informar valor total de todos los juguetes\n7.Informar tipo con mas juguetes\n8.Informar tipo con menos juguetes\n9.Juguetes con valor mayor al indicado");
                    switch (opcion2){
                        case "1":
                            jugueteControlador.agregarJuguete();
                            break;
                        case "2":
                            jugueteControlador.disminuirExistencias();
                            break;
                        case "3":
                            jugueteControlador.aumentarExistencias();
                            break;
                        case "4":
                            jugueteControlador.informarJuguetesPorTipo();
                            break;
                        case "5":
                            jugueteControlador.informarCantidadTotal();
                            break;
                        case "6":
                            jugueteControlador.informarValorTotal();
                            break;
                        case "7":
                            jugueteControlador.informarTipoConMasJuguetes();
                            break;
                        case "8":
                            jugueteControlador.informarTipoConMenosJuguetes();
                            break;
                        case "9":
                            jugueteControlador.informarJuguetesConValorMayorAlIndicado();
                            break;

                    }
                    break;
                case "2":
                    usuarioControlador.agregarCliente();
                    break;
                case "3":
                    usuarioControlador.agregarEmpleado();
                    break;
                case "4":
                    ventaControlador.crearVenta(jugueteControlador.getJugueteService(), usuarioControlador.getUsuarioService());
                    break;


            }
        }

    }


}
