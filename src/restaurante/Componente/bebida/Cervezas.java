/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Componente.bebida;

/**
 *
 * @author david
 */
public class Cervezas extends Licores{
    @Override
    public String guardar(String marca){
        return "\t"+marca;
    }    
}
