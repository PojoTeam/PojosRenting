package pruebas;

import hibernate.NewHibernateUtil;
import java.io.*;
import org.hibernate.Session;
import java.sql.*;

/**
 *
 * @author a18pablobc
 */
public class main {
    static Connection conexion;
    static Statement sentencia;
    static ResultSet resultado;
    
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://pablobarros.ga:3306/?user=root&password=root";
        
        try{
            conexion = DriverManager.getConnection(url);
            sentencia = conexion.createStatement();
            sentencia.execute("USE POJO_RENTING;");
        }catch(SQLException e) {
            e.printStackTrace();
        }
        NewHibernateUtil.getSession();
        Session sesion = NewHibernateUtil.getSession();
    }
}
