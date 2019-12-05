package pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Empresa extends Cliente implements Serializable {

    private String nombre, cif;
    private int nAlquileres;
    private Set<Alquiler> alquileres;

    public Empresa() {
    }

    public Empresa(String cif, String nombre, String email, String telefono) {
        super(email, telefono);
        this.nombre = nombre;
        this.cif = cif;
        this.alquileres = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public int getnAlquileres() {
        return nAlquileres;
    }

    public void setnAlquileres(int nAlquileres) {
        this.nAlquileres = nAlquileres;
    }

    public Set<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Set<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    

}
