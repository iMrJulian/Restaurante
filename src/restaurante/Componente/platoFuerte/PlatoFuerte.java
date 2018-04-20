/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente.platoFuerte;

import restaurante.Componente.*;

/**
 *
 * @author Leo Wiesner
 */
public abstract class PlatoFuerte extends Componente {
    
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public abstract String guardar(String alimento);
}
