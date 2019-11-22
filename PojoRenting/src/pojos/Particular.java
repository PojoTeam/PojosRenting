package pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Particular extends Cliente implements Serializable {

    private String dni;
    private int edad, puntos;
    private Set<Alquiler> alquileres;

    public Particular(String dni, int edad, int puntos, String nombre, String email, String telefono, int id) {
        super(nombre, email, telefono, id);
        this.dni = dni;
        this.edad = edad;
        this.puntos = puntos;
        this.alquileres = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
