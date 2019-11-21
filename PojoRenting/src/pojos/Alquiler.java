package pojos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author a18pablobc
 */
public class Alquiler implements Serializable {
    
    private Date fechaInicio, fechaFin;
    private float precioTotal, descuento;
    private Coche coche;
    private Empresa empresa;
    private Particular particular;

    public Alquiler(Date fechaInicio, Date fechaFin, float precioTotal, float descuento) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.descuento = descuento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Particular getParticular() {
        return particular;
    }

    public void setParticular(Particular particular) {
        this.particular = particular;
    }
    
    private void calculoPrecio(){}
    private void calculoDescuento(){}
    private void calculoDuracion(){}
    
}
