package co.edu.cue.Model;

public class Juguete {

    private String nombre;
    private String material;
    private double precio;
    private int stock;

    public Juguete() {
    }

    public Juguete(String nombre, String material, double precio, int stock) {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", material='" + material + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
