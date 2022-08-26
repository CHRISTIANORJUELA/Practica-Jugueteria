package co.edu.cue.Services;
import co.edu.cue.Model.Juguete;

public interface JugueteService {

    void agregarJuguete(String nombre, String material, double precio, int stock);

    void aumentarCantidadDeJuguetes(String nombreJuguete, int cantidad);

    void disminuirCantidadDeJuguetes(String nombreJuguete, int cantidad);

    Juguete buscarJuguete(String nombreJuguete);

    void informarJuguetesPorTipo(String tipo);

    void informarCantidadTotalJuguetes();

    void informarValorTotalJuguetes();

    void informarTipoConMasJuguetes();

    void informarTipoConMenosJuguetes();

    void informarJuguetesMasCarosQueValorIndicado(double valor);
}
