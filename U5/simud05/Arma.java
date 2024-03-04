package simud05;

public class Arma extends Item{
    int ataque = 0;
    boolean dosManos = false;

    public Arma(String nombreItem, double pesoItem, int precioItem, int ataque, boolean dosManos) {
        super(nombreItem, pesoItem, precioItem);
        this.ataque = ataque;
        this.dosManos = dosManos;
    }
    
}
