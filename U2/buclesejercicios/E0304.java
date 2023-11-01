package buclesejercicios;

import java.util.Scanner;

public class E0304 {

    /*
     * E0304. Un centro de investigación de la flora urbana necesita una aplicación
     * que muestre cuál es el árbol más alto.
     * Para ello introducirá por teclado la altura (en centímetros) de cada árbol
     * (terminando la introducción de datos cuando se utilice el -1 como altura).
     * Los árboles se identifican mediante etiquetas con números únicos
     * consecutivos, comenzando en 0.
     * Diseñar una aplicación que, al terminar la introducción de datos, muestre el
     * número y la altura del árbol más alto.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int arbolActual = 0;
        int arbolMasAlto = 0;
        int alturaMasAlta = 0;
        System.out.println(
                "Introduce el valor de la altura del árbol (Escribe -1 para terminar con la recogida de datos): ");
        do {
            System.out.print("Árbol " + arbolActual + ": ");
            altura = sc.nextInt();

            if (altura != -1) {
                if (altura > alturaMasAlta) {
                    alturaMasAlta = altura;
                    arbolMasAlto = arbolActual;
                }
                arbolActual++;
            }
        } while (altura != -1);

        if (arbolActual == 0) {
            System.out.println("No se introdujeron alturas de árboles.");
        } else {
            System.out.println("El árbol más alto fue el " + arbolMasAlto + ".");
            System.out.println("La altura máxima fue de " + alturaMasAlta + " cm.");
        }

        sc.close();
    }
}
