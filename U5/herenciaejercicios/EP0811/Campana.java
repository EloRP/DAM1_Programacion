package herenciaejercicios.EP0811;

import herenciaapuntes.Instrumento;

public class Campana extends Instrumento {

    protected void interpretar() {
        System.out.print("Melodía de campana: ");
        for (Nota n : melodia) {
            System.out.print(n + " ");
        }

    }
}
