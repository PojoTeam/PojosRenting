package pojos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Coche {
    
    private String modelo, marca, estado;
    private int id;
    private float precioDia;
    private Set<Reserva> reservas;
    private Sede sede;
    private Alquiler alquiler;

    public Coche(String modelo, String marca, String estado, int id, float precioDia) {
        this.modelo = modelo;
        this.marca = marca;
        this.marca = estado;
        this.id = id;
        this.precioDia = precioDia;
        this.reservas = new HashSet<>();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
    
}
