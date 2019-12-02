package hibernate;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
public class NewHibernateUtil {
    
    private static final SessionFactory sessionFactory;
    
    static{
    
        try{
        
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        
        }catch(HibernateException ex){
            
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        
        }
    
    }
    
    public static Session getSession(){
    
        Session session = sessionFactory.openSession();
        return session;
    
    }
    
}
