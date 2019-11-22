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
    private Set<Reserva> reservas;

    public Coche(String modelo, String marca, String estado, int id) {
        this.modelo = modelo;
        this.marca = marca;
        this.marca = estado;
        this.id = id;
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

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
