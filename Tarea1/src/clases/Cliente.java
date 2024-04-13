/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Cliente {
    String cedula;
    String nombres;
    String apellidos;
    String mail;
    Direcciones direccion; //1 a 1 Cliente->Direcciones
    //ArrayList<Direcciones> direcciones; 1 a * Cliente->Direcciones
    ArrayList<Hijos> hijos;

    public Cliente(String cedula, String nombres, String apellidos, String mail, Direcciones direccion, ArrayList<Hijos> hijos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
        this.direccion = direccion;
        this.hijos = hijos;
    }

    public Cliente() {
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Hijos> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Hijos> hijos) {
        this.hijos = hijos;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombres=" + nombres + 
                ", apellidos=" + apellidos + ", mail=" + mail + 
                ", direccion=" + direccion.getCalle1()+ " " +  direccion.getCalle2();
    }
    
    
}