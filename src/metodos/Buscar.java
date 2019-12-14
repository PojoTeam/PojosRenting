package metodos;

import hibernate.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import pojos.Alquiler;
import pojos.Cliente;
import pojos.Coche;
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
            Criteria filtros = sesion.createCriteria(Empresa.class);
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

    public static List<Coche> coches(String matricula, String modelo, String estado, String marca, String fechaPM, String anhos) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Coche> coches;
        if (matricula.equalsIgnoreCase("") && modelo.equalsIgnoreCase("") && estado.equalsIgnoreCase("") && marca.equalsIgnoreCase("") && fechaPM.equalsIgnoreCase("") && anhos.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        } else {
            Criteria filtros = sesion.createCriteria(Coche.class);
            if (!matricula.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("matricula", matricula);
                filtros.add(nameCriteria);
            }
            if (!modelo.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("modelo", modelo);
                filtros.add(nameCriteria);
            }
            if (!estado.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("estado", estado);
                filtros.add(nameCriteria);
            }
            if (!marca.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("marca", marca);
                filtros.add(nameCriteria);
            }
            if (!fechaPM.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("fechaPM", fechaPM);
                filtros.add(nameCriteria);
            }
            if(!anhos.equalsIgnoreCase("")){
                Criterion nameCriteria = Restrictions.eq("anhos", fechaPM);
                filtros.add(nameCriteria);
            }
            coches = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return coches;
    }
    
    public static List<Alquiler> alquileres(String precioTotal, String fechaInicio, String fechaFin, String coche, String cliente) {
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Alquiler> alquileres;
        if (precioTotal.equalsIgnoreCase("") && descuento.equalsIgnoreCase("") && fechaInicio.equalsIgnoreCase("") && fechaFin.equalsIgnoreCase("") && coche.equalsIgnoreCase("")&& cliente.equalsIgnoreCase("")) {
            //todos los campos estan vacios, por lo que no hay nada a buscar.
            sesion.close();
            return null;
        }else {
            Criteria filtros = sesion.createCriteria(Alquiler.class);
            if (!precioTotal.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("precioTotal", precioTotal);
                filtros.add(nameCriteria);
            }
            if (!fechaInicio.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("fechaInicio", fechaInicio);
                filtros.add(nameCriteria);
            }
            if (!fechaFin.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("fechaFin", fechaFin);
                filtros.add(nameCriteria);
            }
            if (!coche.equalsIgnoreCase("")) {
                Criterion nameCriteria = Restrictions.eq("coche", coche);
                filtros.add(nameCriteria);
            }
            if(!cliente.equalsIgnoreCase("")){
                Criterion nameCriteria = Restrictions.eq("cliente", cliente);
                filtros.add(nameCriteria);
            }
            alquileres = filtros.list();
        }
        sesion.getTransaction()
                .commit();
        sesion.close();
        return alquileres;
    }

}
