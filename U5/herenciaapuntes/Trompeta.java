package herenciaapuntes;

public class Trompeta extends InstrumentoDeViento {

    public Trompeta() {
        super("METAL");
    }

    @Override
    protected void interpretar() {
        System.out.print("Melodía de trompeta (Instrumento de " + tipo + "): ");
        for (Nota n : melodia) {
            System.out.print(n + " ");
    }
    

    }
}
