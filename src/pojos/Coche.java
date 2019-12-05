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
    private Alquiler alquiler;
    private Date fechaM;
    private float precioDia;

    public Coche() {
    }

    public Coche(String matricula, String modelo, String marca, String estado, int anhos, Date fechaM, float precioDia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.estado = estado;
        this.anhos = anhos;
        this.fechaM = fechaM;
        this.reservas = new HashSet<>();
        this.precioDia = precioDia;
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

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }
    
}
