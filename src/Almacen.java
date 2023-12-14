package src;
import java.util.HashMap;

public class Almacen {
    private HashMap<String, Integer> productos;

    public Almacen() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String producto, int cantidad) {
        productos.put(producto, cantidad);
    }

    public void actualizarCantidad(String producto, int nuevaCantidad) {
        productos.put(producto, nuevaCantidad);
    }

    public void eliminarProducto(String producto) {
        productos.remove(producto);
    }

    public boolean contieneProducto(String producto) {
        return productos.containsKey(producto);
    }

    public int obtenerCantidad(String producto) {
        return productos.getOrDefault(producto, 0);
    }
}
