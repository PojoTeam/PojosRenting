package pojos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author a18pablobc
 */
public class Sede {
    
    private int id;
    private String ciudad;
    private Set<Coche> coches;

    public Sede(int id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
        this.coches = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Set<Coche> getCoches() {
        return coches;
    }

    public void setCoches(Set<Coche> coches) {
        this.coches = coches;
    }
    
}
