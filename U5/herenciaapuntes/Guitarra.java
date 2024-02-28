package herenciaapuntes;

public class Guitarra extends Instrumento {
    @Override
    void interpretar() {
            System.out.print("Melodía de Guitarra: ");
            for (Nota n : melodia){
                System.out.print(n + " ");
            }
    }

    public static void main(String[] args) {
    }
}
