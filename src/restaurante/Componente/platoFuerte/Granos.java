/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente.platoFuerte;

/**
 *
 * @author Leo Wiesner
 */
public class Granos extends PlatoFuerte {

    @Override
    public String guardar(String eleccion) {
        return "\t" + eleccion;
    }
}
