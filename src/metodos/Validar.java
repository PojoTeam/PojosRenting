/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author pablo
 */
public class Validar {

    public static boolean dni(String dni) {
        boolean error;
        if (!dni.matches("[0-9]{8}[A-Z]")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean cif(String cif) {
        boolean error;
        if (cif.matches("[0-9]{8}[A-Z]") || cif.matches("[A-Z][0-9]{9}")) {
            error = false;
        } else {
            error = true;
        }
        return error;
    }

    public static boolean cadena(String entrada) {
        boolean error;
        if (!entrada.matches("[aA-zZ.\\s0-9]{1,30}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean email(String entrada) {
        boolean error;
        if (!entrada.matches("[aA-zZ@0-9.]{1,30}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean nombre(String entrada) {
        boolean error;
        if (!entrada.matches("[aA-zZ]{1,15}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean nombreEmp(String entrada) {
        boolean error;
        if (!entrada.matches("[aA-zZ\\s]{1,30}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean apellidos(String entrada) {
        boolean error;
        if (!entrada.matches("[aA-zZ\\s]{1,20}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean estado(String entrada) {
        boolean error;
        if (!entrada.matches("En taller") ) {
            error = true;
        } else if(!entrada.matches("Alquilado")){
            error = true;
        } else if(!entrada.matches("Disponible")){
            error = true;
        }else {
            error = false;
        }
        return error;
    }

    public static boolean telefono(String entrada) {
        boolean error;
        if (!entrada.matches("[1-9][0-9]{1,11}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean matricula(String entrada) {
        boolean error;
        if (!entrada.matches("[0-9]{4}[A-Z]{3}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }

    public static boolean puntos(String entrada) {
        boolean error;
        int puntos = Integer.parseInt(entrada);
        if (puntos > 15 || puntos == 0) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }
    public static boolean precio(String entrada) {
        boolean error;
        if (!entrada.matches("[0-9]*[.]?[0-9]{0,2}")) {
            error = true;
        } else {
            error = false;
        }
        return error;
    }
}
