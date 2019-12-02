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
    private int puntos, edad;
    private Date fechaNacimiento;
    private Alquiler alquiler;

    public Particular(String dni, Date fechaNacimiento, int puntos, int id, int edad, String nombre, String email, String telefono) {
        super(id, nombre, email, telefono);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.puntos = puntos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    
}
