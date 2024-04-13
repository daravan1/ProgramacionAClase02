/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import clases.Cliente;
import java.util.Scanner;
import logica.lCliente;
import clases.Direcciones;
import clases.Hijos;
import static logica.lCliente.validaCedula;

/**
 *
 * @author UTPL
 */
public class main {

    /**
     * 9 de abril 2024
     *
     * @param args the command line arguments
     */
    static String campo;
    static Scanner scan = new Scanner(System.in);
    static Cliente cliente = new Cliente();
    static lCliente lcliente = new lCliente();

    public static void main(String[] args) {
        // TODO code application logic here


        /*if ((lcliente.validaCedula(cliente))&& lcliente.validaMail(cliente) && lcliente.validaDirecciones(cliente.getDireccion())) {
            System.out.println(cliente.toString());
        } else {
            System.out.println("Datos incorrectos");
        }*/
        int i = 0;
        do {
            System.out.println("Crear cliente: 1\nAgregar direccion: 2\nAgregar hijos: 3\nListar: 4\nSalir: 5");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    if (lcliente.validaCliente(cliente)) {
                        System.out.println("Cliente no aun no creado");
                    } else {
                        crearCliente(cliente);
                        break;
                    }
                case 2:
                    if (lcliente.validaCliente(cliente)) {
                        crearDireccion(cliente);
                    } else {
                        System.out.println("Cliente no aun no creado");
                        break;
                    }
                case 3:
                    if (lcliente.validaCliente(cliente)) {
                        System.out.println("Numero de hijos que desea ingresar:");
                        int num = scan.nextInt();
                        for (int j = 1; j <= num; j++) {
                            crearHijos(cliente);
                        }
                    } else {
                        System.out.println("Cliente no aun no creado");
                        break;
                    }

                case 4:
                    if (lcliente.validaCliente(cliente)) {

                    } else {
                        System.out.println("Cliente no aun no creado");
                        break;
                    }

                case 5:
                    i = 5;
                    System.out.println("Saliendo");

            }
        } while (i != 5);

    }

    public static void crearCliente(Cliente cliente) {
        String campo;
        System.out.println("Ingrese su cedula");
        campo = scan.nextLine();
        cliente.setCedula(campo);
        if (validaCedula(cliente)) {
            System.out.println("Ingrese sus nombres");
            campo = scan.nextLine();
            cliente.setNombres(campo);
            System.out.println("Ingrese sus apellidos");
            campo = scan.nextLine();
            cliente.setApellidos(campo);
            System.out.println("Ingrese su mail");
            campo = scan.nextLine();
            cliente.setMail(campo);
        } else {
            System.out.println("Cedula incorrecta");
        }

    }

    public static void crearDireccion(Cliente cliente) {
        System.out.println("Ingrese la calle principal de su direccion");
        String calle1 = scan.nextLine();
        System.out.println("Ingrese la calle secundaria de su direccion:");
        String calle2 = scan.nextLine();
        if (calle1 != (calle2)) {
            cliente.setDireccion(new Direcciones(calle1, calle2));
        } else {
            System.out.println("Direccion incorrecta");
        }
    }

    public static void crearHijos(Cliente cliente) {
        Hijos hijo = new Hijos();
        System.out.println("Ingrese el nombre de su hijo");
        String nom = scan.nextLine();
        System.out.println("Ingrese la edad de su hijo");
        int ed = scan.nextInt();
        cliente.getHijos().add(hijo(nom, ed));
    }

}
