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

    public ArrayList<Componente> menu;

    public Plato() {
        menu = new ArrayList<Componente>();
    }

    public void guardarMemoria(String alimento, Componente m) {
        m.plato = alimento;
        menu.add(m);
    }

}
