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
public class clases {
    private String clase_name;
    ArrayList<String>atributos = new ArrayList();
    ArrayList<Metodos>methods = new ArrayList();
     ArrayList<String>type  = new ArrayList();



    public clases(String clase_name) {
        this.clase_name = clase_name;
    }

    public String getClase_name() {
        return clase_name;
    }

    public void setClase_name(String clase_name) {
        this.clase_name = clase_name;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Metodos> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<Metodos> methods) {
        this.methods = methods;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "clases{" + "clase_name=" + clase_name + ", atributos=" + atributos + ", methods=" + methods + ", type=" + type + '}';
    }
     
    
}
