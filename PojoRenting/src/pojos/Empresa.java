package pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Empresa extends Cliente implements Serializable {

    private String cif;
    private int nAlquileres;
    private Set<Alquiler> alquileres;

    public Empresa(String cif, int nAlquileres, String nombre, String email, String telefono, int id) {
        super(nombre, email, telefono, id);
        this.cif = cif;
        this.nAlquileres = nAlquileres;
        this.alquileres = new HashSet<>();
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
