/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import clases.Cliente;
import java.util.regex.Pattern;
import clases.Direcciones;
import clases.Hijos;
import java.util.Scanner;

/**
 * @author UTPL Clase para manejar la logica del cliente
 */
public class lCliente {

    //Expresiones regulares
    Scanner scan = new Scanner(System.in);

    public static boolean validaCedula(Cliente objCliente) {
        // Define la expresión regular para solo números
        String regex = "[0-9]{10}";
        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);
        // Usa el patrón para verificar si el String coincide con la expresión regular
        return pattern.matcher(objCliente.getCedula()).matches();
    }

    public static boolean validaMail(Cliente objCliente) {
        String regex = ".*@.*\\.com$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(objCliente.getMail()).matches();
    }

    public static boolean validaDirecciones(Cliente objDirecciones) {
        return !objDirecciones.getDireccion().getCalle1().equals(objDirecciones.getDireccion().getCalle2());
    }

    /*public static boolean validaEdad(Cliente objHijos) {
        for (int i = 0; i < objHijos.getHijos().size(); i++) {
            if (objHijos.getHijos().get(i).getEdad() > 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
     */
    public static boolean validaCliente(Cliente objCliente) {
        if (objCliente.getCedula() != null) {
            return true;
        } else {
            return false;
        }
    }

    

}
