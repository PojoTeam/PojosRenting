package metodos;

import hibernate.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Alquiler;
import pojos.Coche;
import pojos.Empresa;
import pojos.Particular;

/**
 *
 * @author carlos
 */
public class Modificar {
    
    public static void particulares(Particular particular) {
        
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();
            
            sesion.beginTransaction();
            sesion.update(particular);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e){
            e.printStackTrace();
        }
            
    }
    
    public static void empresas(Empresa empresa) {
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();
            
            sesion.beginTransaction();
            sesion.update(empresa);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e) {
            System.out.println(e);
        }
    }
    
    public static void coches(Coche coche) {
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();
            
            sesion.beginTransaction();
            sesion.update(coche);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e){
            System.out.println(e);
        }
    }
    
    public static void alquileres(Alquiler alquiler) {
        try{
            NewHibernateUtil.getSession();
            Session sesion = NewHibernateUtil.getSession();
            
            sesion.beginTransaction();
            sesion.update(alquiler);
            sesion.getTransaction().commit();
            sesion.close();
        }catch(HibernateException e){
            System.out.println(e);
        }
    }
}
