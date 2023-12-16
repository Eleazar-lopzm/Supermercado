package src;

public class Simulacion {
    public static void main(String[] args) throws NoSuchFieldException {
        System.out.println("Hola mundo");
        CajaFactory fabricaCajaFactory = new CajaFactory();
        Caja cajanormal = fabricaCajaFactory.crearCaja(TipoCaja.NORMAL);
        cajanormal.crearCaja();
    }
}
