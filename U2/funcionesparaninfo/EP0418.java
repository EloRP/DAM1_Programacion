package funcionesparaninfo;

/*
 * EP0418. Crea una función que muestre por consola una serie de números aleatorios enteros.
 * Los parámetros de la función serán:
 * la cantidad de números aleatorios que se mostrarán y
 * los valores mínimos y máximos que estos pueden tomar.
 */
import java.util.Random;

public class EP0418 {
    public static void main(String[] args) {
        mostrarNumerosAleatorios(10, 1, 100);
    }

    static void mostrarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        Random rand = new Random();
        System.out.println("Números aleatorios entre " + minimo + " y " + maximo + ":");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = rand.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numeroAleatorio);
        }
    }
}
