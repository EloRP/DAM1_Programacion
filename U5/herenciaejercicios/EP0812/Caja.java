package herenciaejercicios.EP0812;

public class Caja {
    protected enum Unidad {cm, m} ;
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;
    protected String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    protected double getVolumen() {
        double volumen = ancho * alto * fondo;
        return volumen;
    }

    void setEtiqueta(String etiqueta) {
        if (etiqueta.length() < 31) {
            this.etiqueta = etiqueta;
        }
        else throw new IllegalArgumentException("Longitud de etiqueta errónea.");
    }

    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
                + etiqueta + "]";
    }

    public static void main(String[] args) {
        Caja caja = new Caja(30, 30, 30, Unidad.m);

        caja.setEtiqueta("EEEEEEEEEEEEEEEEEEEEEEEEE");
    
        System.out.println(caja.toString());
    }
}
