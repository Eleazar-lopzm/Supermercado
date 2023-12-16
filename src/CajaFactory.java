package src;


public class CajaFactory {

    public Caja crearCaja(TipoCaja tipo) throws NoSuchFieldException {

        switch (tipo) {

            case NORMAL:
                return new CajaPromedio();

            case RAPIDA:
                return new CajaRapida();

            default:
                throw new NoSuchFieldException("Tipo de Caja no soportado");
                
        }

    }

}