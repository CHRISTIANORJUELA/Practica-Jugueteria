package co.edu.cue.Services.ServicesImpl;

import co.edu.cue.Model.*;
import co.edu.cue.Services.VentaService;

import javax.swing.*;

public class VentaServiceImpl implements VentaService {

    private JugueteServiceImpl jugueteService = new JugueteServiceImpl();
    private Venta ventas[] = new Venta[100];


    @Override
    public void crearVenta(String fechaDeVenta, String documentoCliente, String documentoEmpleado, JugueteServiceImpl jugueteService, UsuarioServiceImpl usuarioService) {
        Cliente cliente = usuarioService.buscarCliente(documentoCliente);
        Empleado empleado = usuarioService.buscarEmpleado(documentoEmpleado);
        DetalleVenta detallesVenta[] = crearDetalleVenta(jugueteService);
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] == null){
                ventas[i] = new Venta(fechaDeVenta, detallesVenta, cliente, empleado);
                JOptionPane.showMessageDialog(null, "La venta ha sido creada");
                System.out.println(ventas[i].getDetalles());
                System.out.println(ventas[i]);
                break;
            }else if(i == ventas.length-1){
                JOptionPane.showMessageDialog(null, "No se pueden hacer mas ventas ");
            }
        }
        System.out.println(ventas);
        String test = "";
        for (int i = 0; i < ventas.length; i++) {
            if(ventas[i] != null){
                test += ventas[i].toString()+"\n";
            }
        }
        System.out.println(test);
    }

    @Override
    public DetalleVenta[] crearDetalleVenta(JugueteServiceImpl jugueteService) {
        Juguete juguetes[] = jugueteService.getJuguetes();
        boolean parar = true;
        int contador = 0;
        DetalleVenta detalleVenta[] = new DetalleVenta[5];
        do{
            if(parar != false && contador <= detalleVenta.length){
                String nombreJuguete = JOptionPane.showInputDialog("Ingrese el nombre del juguete que desea comprar");
                for (int i = 0; i < juguetes.length; i++) {
                    if(juguetes[i] != null){
                        if(juguetes[i].getNombre().equalsIgnoreCase(nombreJuguete)){
                            if(juguetes[i].getMaterial().equalsIgnoreCase("plastico")){
                                JOptionPane.showMessageDialog(null, "El juguete no requiere cuidados especiales");
                            }else if(juguetes[i].getMaterial().equalsIgnoreCase("tela")){
                                JOptionPane.showMessageDialog(null, "El juguete no debe ser mojado");
                            }else if(juguetes[i].getMaterial().equalsIgnoreCase("electronico")){
                                JOptionPane.showMessageDialog(null, "El juguete no debe ser mojado y requiere baterías");
                            }
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades quiere comprar"));
                            if(juguetes[i].getStock() >= cantidad){
                                detalleVenta[contador] = new DetalleVenta(juguetes[i],cantidad);
                                juguetes[i].setStock(juguetes[i].getStock() - cantidad);
                                contador++;
                                String agregarJuguete = JOptionPane.showInputDialog("Ingrese 1 si desea agregar otro juguete y 2 si desea finalizar la venta");
                                if(agregarJuguete.equalsIgnoreCase("2")){
                                    parar = false;
                                }else{
                                    parar = true;
                                }
                            }
                        }
                    }

                }
            }
        }while (parar);
        return detalleVenta;
    }
}
