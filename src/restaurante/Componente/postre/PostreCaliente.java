/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente.postre;

/**
 *
 * @author david
 */
public class PostreCaliente extends Postre {

    @Override
    public String guardar(String postre) {
        return "\t" + postre;
    }
}
