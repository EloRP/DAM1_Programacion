package simud05;

public class Armadura extends Item {
    int defensa = 0;
    public enum Tipo {YELMO, ARMADURA, ESCUDO};
    Tipo tipoArmadura;


    public Armadura(String nombreItem, int pesoItem, int precioItem, int defensa, Tipo tipoArmadura) {
        super(nombreItem, pesoItem, precioItem);
        this.defensa = defensa;
        this.tipoArmadura = tipoArmadura;
        }
}
