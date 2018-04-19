package restaurante.Componente.bebida;

public class Jugos extends Bebida {


    @Override
    public String guardar(String sabor) {
        return "\tJugo de " + sabor;
    }

}
