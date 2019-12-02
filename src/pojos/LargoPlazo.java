package pojos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a18pablobc
 */
public class LargoPlazo extends Alquiler implements Serializable {
    
    public LargoPlazo(int codigo, Date fechaInicio, Date fechaFin, float precioTotal, float descuento) {
        super(codigo, fechaInicio, fechaFin);
    }
       
    @Override
    public float calculoDescuento() {
        if(this.calculoDuracion() > 30 && this.calculoDuracion() < 180){
            this.setDescuento(0.1f);
        }else if(this.calculoDuracion() >= 180 && this.calculoDuracion() < 360){
            this.setDescuento(0.2f);
        }else if(this.calculoDuracion() >= 360 && this.calculoDuracion() < 720){
            this.setDescuento(0.3f);
        }else if(this.calculoDuracion() >= 720){
            this.setDescuento(0.4f);
        }else{
            this.setDescuento(0);
        }
        return this.getDescuento();
    }
    
    
    
}
