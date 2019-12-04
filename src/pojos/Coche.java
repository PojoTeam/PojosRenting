package pojos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Coche {
    
    private String matricula, modelo, marca, estado;
    private int anhos;
    private Set<Reserva> reservas;
    private Sede sede;
    private Alquiler alquiler;
    private Date fechaM;

    public Coche() {
    }

    public Coche(String matricula, String modelo, String marca, String estado, int anhos, Date fechaM) {
        this.modelo = modelo;
        this.marca = marca;
        this.marca = estado;
        this.anhos = anhos;
        this.fechaM = fechaM;
        this.reservas = new HashSet<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public int getAnhos() {
        return anhos;
    }

    public void setAnhos(int anhos) {
        this.anhos = anhos;
    }

    public Date getFechaM() {
        return fechaM;
    }

    public void setFechaM(Date fechaM) {
        this.fechaM = fechaM;
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
