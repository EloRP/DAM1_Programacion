package herenciaapuntes;

import java.util.Arrays;

public abstract class Instrumento {
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI}

    protected Nota[] melodia;

    public Instrumento() {
        melodia = new Nota[0];
    }

    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }
    
    protected abstract void interpretar();

    public static void main(String[] args) {
        
    }
}
