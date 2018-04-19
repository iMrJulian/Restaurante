/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente;

/**
 *
 * @author Estudiantes
 */
public abstract class Componente {

    private String plato;

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public abstract String guardar(String alimento);
}
