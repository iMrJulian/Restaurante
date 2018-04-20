/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente;

import java.util.ArrayList;
import restaurante.Componente.platoFuerte.*;

/**
 *
 * @author david
 */
public class Plato {

    public ArrayList<Componente> aperitivo;
    public ArrayList<PlatoFuerte> fuerte;
    public ArrayList<Componente> bebida;
    public ArrayList<Componente> postre;

    public Plato() {
        aperitivo = new ArrayList<Componente>();
        fuerte = new ArrayList<PlatoFuerte>();
        bebida = new ArrayList<Componente>();
        postre = new ArrayList<Componente>();
    }

    public void guardarPosbe(String alimento, Componente m ) {
        m.setPlato(alimento);
        postre.add(m);
    }
    
    public void guardarPosbe(String alimento, PlatoFuerte m  ) {
        m.setPlato(alimento);
        m.setNombre(alimento);
        fuerte.add(m);
    }
    public String mostrarPosbe() {
        String mem = "";
        for (Componente memoria : postre) {
             mem = mem + memoria.getPlato()+ "\n";
        }
        return mem;
    }
    public String mostrarFuerte() {
        String mem = "";
        for (PlatoFuerte memoria : fuerte) {
             mem = mem + memoria.getNombre();
             mem = mem +"\n"+ memoria.getPlato()+ ", ";
        }
        mem+="\n";
        return mem;
    }
}
