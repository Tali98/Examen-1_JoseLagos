/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class Usuario {
    private String nombre_completo;
    private int edad;
    private String correo;
    private String user;
    private String contrasena;
    ArrayList<clases>lista = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre_completo, int edad, String correo, String user, String contrasena) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.contrasena = contrasena;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<clases> getLista() {
        return lista;
    }

    public void setLista(ArrayList<clases> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre_completo=" + nombre_completo + ", edad=" + edad + ", correo=" + correo + ", user=" + user + ", contrasena=" + contrasena + ", lista=" + lista + '}';
    }
    
}
