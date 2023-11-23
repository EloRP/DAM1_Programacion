package funcionesparaninfo;

/*
 * EP0419. Sobrecarga la función realizada en la Actividad 4.18 para que el único parámetro
 * sea la cantidad de números aleatorios que se muestra por consola.
 * Los números aleatorios serán reales y estarán comprendidos entre 0 y 1.
 */
import java.util.Random;

public class EP0419 {
    public static void main(String[] args) {
        mostrarNumerosAleatorios(10);
    }

    static void mostrarNumerosAleatorios(int cantidad) {
        Random rand = new Random();
        System.out.println("Números aleatorios entre 0 y 1:");

        for (int i = 0; i < cantidad; i++) {
            double numeroAleatorio = rand.nextDouble();
            System.out.println(numeroAleatorio);
        }
    }

    // Sobrecarga de la función para mostrar números enteros entre minimo y maximo
    static void mostrarNumerosAleatorios(int cantidad, double minimo, double maximo) {
        Random rand = new Random();
        System.out.println("Números aleatorios reales entre " + minimo + " y " + maximo + ":");

        for (int i = 0; i < cantidad; i++) {
            double rango = maximo - minimo;
            double numeroAleatorio = rand.nextDouble() * rango + minimo;
            System.out.println(numeroAleatorio);
        }
    }
}
