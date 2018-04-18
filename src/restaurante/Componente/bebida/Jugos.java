package restaurante.Componente.bebida;

public class Jugos extends Bebida {

    private String adicion;

    public Jugos(String adicion) {
        this.adicion = adicion;
    }

    @Override
    public String guardar(String sabor) {
        return "\tJugo de " + sabor + " en " + adicion;
    }

}
