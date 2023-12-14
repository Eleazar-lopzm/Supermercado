package src;

public class Producto {
    private static int contador = 1234567890;
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //constructor de un producto
    public Producto(int id, String nombre, double precio, int cantidad) {

        this.id = ++contador;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    
}