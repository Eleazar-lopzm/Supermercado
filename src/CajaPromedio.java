package src;

public class CajaPromedio implements Caja {

    @Override
    public void atenderClientes() {
        System.out.println("Caja normal atendiendo");
    }

    @Override
    public void crearCaja() {
        System.out.println("creaste una caja normal");
    }
    
    
}
