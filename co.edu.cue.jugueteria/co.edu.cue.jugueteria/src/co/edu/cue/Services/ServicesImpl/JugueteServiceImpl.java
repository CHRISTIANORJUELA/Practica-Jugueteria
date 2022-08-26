package co.edu.cue.Services.ServicesImpl;

import co.edu.cue.Model.Juguete;
import co.edu.cue.Services.JugueteService;
import javax.swing.*;

public class JugueteServiceImpl implements JugueteService {

    private Juguete juguetes[] = new Juguete[100];

    @Override
    public void agregarJuguete(String name, String material, double price, int stock) {
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] == null){
                juguetes[i] = new Juguete(name, material, price, stock);
                JOptionPane.showMessageDialog(null, "El juguete "+name+ " ha sido creado");
                break;
            }else if(i == juguetes.length-1){
                JOptionPane.showMessageDialog(null, "No se pueden agregar mas ");
            }
        }
    }

    @Override
    public void aumentarCantidadDeJuguetes(String nombreJuguete, int cantidad) {
        Juguete juguete = buscarJuguete(nombreJuguete);
        juguete.setStock(juguete.getStock() + cantidad);
        JOptionPane.showMessageDialog(null, "Cantidad aumentadaa");
    }

    @Override
    public void disminuirCantidadDeJuguetes(String nombreJuguete, int cantidad) {
        Juguete juguete = buscarJuguete(nombreJuguete);
        //int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades que quiere quitaar "));
        if(juguete.getStock() < cantidad ){
            JOptionPane.showMessageDialog(null, "no hay suficientes juguetes");
        }else{
            juguete.setStock(juguete.getStock() - cantidad);
            JOptionPane.showMessageDialog(null, "Cantidad disminuida");
        }
    }


    @Override
    public Juguete buscarJuguete(String nombreJuguete) {
        Juguete juguete = null;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null && juguetes[i].getNombre().equalsIgnoreCase(nombreJuguete)){
                return juguetes[i];
            }
        }
        return null;
    }

    @Override
    public void informarJuguetesPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null && juguetes[i].getMaterial().equalsIgnoreCase(tipo)){
                contador = contador + juguetes[i].getStock();
            };
        }
        JOptionPane.showMessageDialog(null, "Hay  "+contador+" juguetes de tipo "+tipo);
    }

    @Override
    public void informarCantidadTotalJuguetes() {
        int contador = 0;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null){
                contador = contador + juguetes[i].getStock();
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+contador+" juguetes en la tienda");
    }

    @Override
    public void informarValorTotalJuguetes() {
        double acumulador = 0;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null){
                acumulador = acumulador + (juguetes[i].getStock() * juguetes[i].getPrecio());
            }
        }
        JOptionPane.showMessageDialog(null, "El valor total de dinero de los juguetes es de "+acumulador);
    }

    @Override
    public void informarTipoConMasJuguetes() {
        int plastico = 0;
        int tela = 0;
        int electronico = 0;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null){
                if(juguetes[i].getMaterial().equalsIgnoreCase("plastico")){
                    plastico = plastico + juguetes[i].getStock();
                }else if(juguetes[i].getMaterial().equalsIgnoreCase("electronico")){
                        electronico = electronico+juguetes[i].getStock();
                }else if(juguetes[i].getMaterial().equalsIgnoreCase("tela")){
                    tela = tela + juguetes[i].getStock();
                }
            }
        }
        int mayor = 0;
        String nombre = "";
        if(plastico > mayor){
            mayor = plastico;
            nombre = "plastico";
        }else if(mayor < tela){
            mayor = tela;
            nombre = "tela";
        }else if(mayor < electronico){
            mayor = electronico;
            nombre = "electronico";
        }
        JOptionPane.showMessageDialog(null,"El tipo con mas juguetes es "+nombre);
    }

    @Override
    public void informarTipoConMenosJuguetes() {
        int plastico = 0;
        int tela = 0;
        int electronico = 0;
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null){
                if(juguetes[i].getMaterial().equalsIgnoreCase("plastico")){
                    plastico = plastico + juguetes[i].getStock();
                }else if(juguetes[i].getMaterial().equalsIgnoreCase("electronico")){
                    electronico = electronico+juguetes[i].getStock();
                }else if(juguetes[i].getMaterial().equalsIgnoreCase("tela")){
                    tela = tela + juguetes[i].getStock();
                }
            }
        }
        int menor = plastico;
        String nombre = "";
        if(menor > tela){
            menor = tela;
            nombre = "tela";
        }else if(menor > electronico){
            menor = electronico;
            nombre = "electronico";
        }
        JOptionPane.showMessageDialog(null,"El tipo con menos juguetes es "+nombre);
    }

    @Override
    public void informarJuguetesMasCarosQueValorIndicado(double valor) {
        int contador = 0;
        String jugueteLista = "JUGUETES CON PRECIO MAYOR A "+valor+":\n";
        for (int i = 0; i < juguetes.length; i++) {
            if(juguetes[i] != null){
                if(juguetes[i].getPrecio() > valor){
                    jugueteLista = jugueteLista + juguetes[i].getNombre()+"\n";
                    contador = contador + 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null,jugueteLista );
    }

    public Juguete[] getJuguetes() {
        return juguetes;
    }
}
