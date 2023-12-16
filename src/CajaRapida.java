package src;

public class CajaRapida implements Caja {

    @Override
    public void atenderClientes() {
        System.out.println("Caja rapido atendiendo");
    }

    @Override
    public void crearCaja() {
        System.out.println("creando caja rapida");
    }
    
}
