package pojos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a18pablobc
 */
public class LargoPlazo extends Alquiler implements Serializable {

    public LargoPlazo(Date fechaInicio, Date fechaFin, float precioTotal, float descuento) {
        super(fechaInicio, fechaFin, precioTotal, descuento);
    }

    @Override
    public void calculoDescuento() {
        super.calculoDescuento();
    }
    
    
    
}
