package pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Cliente implements Serializable {

    private int id;
    private String  email, telefono;
    private Set<Reserva> reservas;

    public Cliente() {
    }

    public Cliente(String email, String telefono) {
        this.email = email;
        this.telefono = telefono;
        this.reservas = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

}
