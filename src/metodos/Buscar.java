package metodos;

import hibernate.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import pojos.Cliente;
import pojos.Empresa;
import pojos.Particular;

/**
 *
 * @author pablo
 */
public class Buscar {

    public static List<Cliente> particulares(String nombre, String dni, String telefono, String email, String puntos, String fechaNacimiento, String edad) {

        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> clientes;
        if (nombre.equalsIgnoreCase("") && dni.equalsIgnoreCase("") && telefono.equalsIgnoreCase("") && email.equalsIgnoreCase("") && puntos.equalsIgnoreCase("") && fechaNacimiento.equalsIgnoreCase("") && edad.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            //Creo un filtro para buscar por cada campo
            Criteria filtros = sesion.createCriteria(Particular.class);
            if (!nombre.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("nombre", nombre);
                filtros.add(nameCriteria);
            }
            if (!dni.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("dni", dni);
                filtros.add(nameCriteria);
            }
            if (!telefono.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("telefono", telefono);
                filtros.add(nameCriteria);
            }
            if (!email.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("email", email);
                filtros.add(nameCriteria);
            }
            if (!puntos.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("puntos", puntos);
                filtros.add(nameCriteria);
            }
            if (!fechaNacimiento.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("fechaNacimiento", fechaNacimiento);
                filtros.add(nameCriteria);
            }
            if (!edad.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("edad", edad);
                filtros.add(nameCriteria);
            }
            clientes = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return clientes;
    }
    public static List<Cliente> empresas(String nombre, String cif, String telefono, String email) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> clientes;
        if (nombre.equalsIgnoreCase("") && cif.equalsIgnoreCase("") && telefono.equalsIgnoreCase("") && email.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            Criteria filtros = sesion.createCriteria(Particular.class);
            if (!nombre.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("nombre", nombre);
                filtros.add(nameCriteria);
            }
            if (!cif.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("dni", cif);
                filtros.add(nameCriteria);
            }
            if (!telefono.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("telefono", telefono);
                filtros.add(nameCriteria);
            }
            if (!email.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("email", email);
                filtros.add(nameCriteria);
            }
            clientes = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return clientes;
    }
    
}
