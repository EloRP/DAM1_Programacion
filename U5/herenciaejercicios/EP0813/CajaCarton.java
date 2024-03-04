package herenciaejercicios.EP0813;

public class CajaCarton extends herenciaejercicios.EP0812.Caja {

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, Unidad.cm);
    }
    
    @Override
    protected double getVolumen() {
        double volumen = (ancho * alto * fondo) * 0.8;
        return volumen;
    }

    protected double getSuperficie() {
        double superficie = ((ancho * alto) * 6);
        return superficie;
    }
}
