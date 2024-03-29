package buclesapuntes;

import java.util.Scanner;

public class Arboles {

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
