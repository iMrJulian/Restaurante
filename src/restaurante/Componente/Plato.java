/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Plato {

    public ArrayList<Componente> aperitivo;
    public ArrayList<Componente> fuerte;
    public ArrayList<Componente> bebida;
    public ArrayList<Componente> postre;

    public Plato() {
        aperitivo = new ArrayList<Componente>();
        fuerte = new ArrayList<Componente>();
        bebida = new ArrayList<Componente>();
        postre = new ArrayList<Componente>();
    }

    public void guardarMemoria(String alimento, Componente m ) {
        m.setPlato(alimento);
        aperitivo.add(m);
    }

    public String mostrarMemorias() {
        String mem = "";
        for (Componente memoria : aperitivo) {
             mem = mem + "\n" + memoria.getPlato()+ "\n";
        }
        return mem;
    }
}
