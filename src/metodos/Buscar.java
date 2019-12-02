package metodos;

import hibernate.NewHibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Cliente;
import pojos.Empresa;
import pojos.Particular;

/**
 *
 * @author pablo
 */
public class Buscar {
    
    public Cliente clientes(String nombre){
        
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        
        List<Cliente> tuplas = null;
        Cliente objeto = null;
        try {
            tuplas = sesion.createCriteria(Cliente.class).list();
        }catch(HibernateException e){
            System.out.println(e);
        }
        for (Object cli : tuplas){
            if(((Cliente)cli).getNombre().equalsIgnoreCase(nombre)){
                if(((Cliente)cli) instanceof Particular){
                    String dni = ((Particular)cli).getDni();
                    int puntos = ((Particular)cli).getPuntos();
                    Date fechaNacimiento = ((Particular)cli).getFechaNacimiento();
                    int edad = ((Particular)cli).getEdad();
                    String email = ((Particular)cli).getEmail();
                    String telefono = ((Particular)cli).getTelefono();
                    
                    objeto = new Particular (dni, fechaNacimiento, puntos, edad, nombre, email, telefono);
                }else {
                    String cif = ((Empresa)cli).getCif();
                    String email = ((Empresa)cli).getEmail();
                    String telefono = ((Empresa)cli).getTelefono();
                    
                    objeto = new Empresa (cif, nombre, email, telefono);
                }
            }
        }
        sesion.getTransaction().commit();
        sesion.close();
        return objeto;
    } 
}
