package pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Particular extends Cliente implements Serializable {

    private String dni;
    private int puntos;
    private Date fechaNacimiento;
    private Set<Alquiler> alquileres;

    public Particular(String dni, Date fechaNacimiento, int puntos, String nombre, String email, String telefono) {
        super(nombre, email, telefono);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.puntos = puntos;
        this.alquileres = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Set<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Set<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
}
