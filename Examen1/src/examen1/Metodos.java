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
public class Metodos {
     ArrayList<String>atributos1 = new ArrayList();


    public Metodos() {
    }

    public ArrayList<String> getAtributos1() {
        return atributos1;
    }

    public void setAtributos1(ArrayList<String> atributos1) {
        this.atributos1 = atributos1;
    }

    
    @Override
    public String toString() {
        return "Metodos{" + "atributos1=" + atributos1+ '}';
    }
     
}
