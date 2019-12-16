package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a18pablobc
 */
public class CrearTablas {
    public static void crear(){
        String url = "jdbc:mysql://pablobarros.ga:3306/?user=root&password=root&useSSL=false";
        try{
            Connection conexion = DriverManager.getConnection(url);
            Statement sentencia = conexion.createStatement();
            sentencia.execute("CREATE DATABASE IF NOT EXISTS POJO_RENTING;");
            sentencia.execute("USE POJO_RENTING;");
            sentencia.execute("CREATE TABLE CLIENTES(\n" +
                "	ID INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,\n" +
                "	TELEFONO VARCHAR(12) NOT NULL ,\n" +
                "	EMAIL VARCHAR(30) NOT NULL ,\n" +
                "	PRIMARY KEY(ID)\n" +
                ") ENGINE = INNODB;");
            sentencia.execute("CREATE TABLE PARTICULARES(\n" +
                "	ID INT(5) UNSIGNED ZEROFILL NOT NULL,\n" +
                "    	NOMBRE VARCHAR(15) NOT NULL,\n" +
                "    	APELLIDOS VARCHAR(25) NOT NULL,\n" +
                "	DNI CHAR(9) NOT NULL,\n" +
                "	EDAD INT NOT NULL,\n" +
                "	PUNTOS INT NOT NULL,\n" +
                "	FECHANAC DATE NOT NULL,\n" +
                "	PRIMARY KEY(ID),\n" +
                "    CONSTRAINT FK1_CLIENTES\n" +
                "		FOREIGN KEY (ID) REFERENCES CLIENTES(ID)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "	INDEX FK1_CLIENTES(ID),\n" +
                "    UNIQUE (NOMBRE, APELLIDOS)\n" +
                ")ENGINE = INNODB;");
            sentencia.execute("CREATE TABLE EMPRESAS(\n" +
                "	ID INT(5) UNSIGNED ZEROFILL NOT NULL,\n" +
                "    NOMBRE VARCHAR(30),\n" +
                "	CIF CHAR(10) NOT NULL,\n" +
                "	N_ALQUILERES INT UNSIGNED NOT NULL,\n" +
                "	PRIMARY KEY(ID),\n" +
                "    CONSTRAINT FK2_CLIENTES\n" +
                "		FOREIGN KEY (ID) REFERENCES CLIENTES (ID)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "	INDEX FK2_CLIENTES(ID),\n" +
                "    UNIQUE (NOMBRE)\n" +
                ")ENGINE = INNODB;");
            sentencia.execute("CREATE TABLE COCHES(\n" +
                "	MATRICULA CHAR(7),\n" +
                "    -- ID_SEDE INT UNSIGNED ZEROFILL NOT NULL,\n" +
                "    ANHOS INT(2) UNSIGNED,\n" +
                "	MODELO VARCHAR(30) NOT NULL,\n" +
                "    ESTADO VARCHAR(20) NOT NULL,\n" +
                "    MARCA VARCHAR(30) NOT NULL,\n" +
                "    FECHA_M DATE NOT NULL,\n" +
                "    PRECIO_DIA FLOAT NOT NULL,\n" +
                "    PRIMARY KEY(MATRICULA)\n" +
                "    /**CONSTRAINT FK1_SEDE\n" +
                "		FOREIGN KEY (ID_SEDE) REFERENCES SEDES(ID)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "	INDEX FK1_SEDES(ID_SEDE)**/\n" +
                ")ENGINE = INNODB;");
            sentencia.execute("CREATE TABLE ALQUILERES(\n" +
                "	CODIGO INT(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,\n" +
                "    ID_PARTICULAR INT(5) UNSIGNED ZEROFILL NULL,\n" +
                "    ID_EMPRESA INT(5) UNSIGNED ZEROFILL NULL,\n" +
                "	MATRICULA CHAR(7),\n" +
                "	FECHA_INICIO DATE NOT NULL,\n" +
                "    FECHA_FIN DATE NOT NULL,\n" +
                "    PRECIO_TOTAL FLOAT NOT NULL,\n" +
                "	DESCUENTO FLOAT NOT NULL,\n" +
                "    PRIMARY KEY(CODIGO),\n" +
                "    CONSTRAINT PARTICULAR_ALQUILER\n" +
                "		FOREIGN KEY (ID_PARTICULAR) REFERENCES CLIENTES(ID)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "            \n" +
                "	CONSTRAINT EMPRESAS_ALQUILERES\n" +
                "		FOREIGN KEY (ID_EMPRESA) REFERENCES CLIENTES(ID)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "	\n" +
                "    CONSTRAINT FK1_COCHE\n" +
                "		FOREIGN KEY (MATRICULA) REFERENCES COCHES(MATRICULA)\n" +
                "			ON DELETE CASCADE\n" +
                "            ON UPDATE CASCADE,\n" +
                "	INDEX PARTICULAR_ALQUILER(ID_PARTICULAR),\n" +
                "    INDEX EMPRESAS_ALQUILERES(ID_EMPRESA),\n" +
                "    INDEX FK1_COCHES(MATRICULA)\n" +
                ")ENGINE = INNODB;");
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
