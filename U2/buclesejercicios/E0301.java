package buclesejercicios;

import java.util.Scanner;

public class E0301 {

    /*
     * E0301. Diseñar un programa que muestre, para cada número introducido por
     * teclado, si es par, si es positivo y su cuadrado. El proceso se repetirá
     * hasta que el número introducido sea 0.
     */
    public static void main(String[] args) {

        int numero;

        // Entrada datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número (0 para salir): ");
        numero = sc.nextInt();

        // Proceso
        while (numero != 0) {
            // Operaciones
            if (numero % 2 == 0) {
                System.out.println("Es par. ");
            } else {
                System.out.println("Es impar. ");
            }

            if (numero > 0) {
                System.out.println("Es positivo. ");
            }

            System.out.println("Su cuadrado es " + (int) Math.pow(numero, 2));

            System.out.println("Introduce un número (0 para salir): ");
            numero = sc.nextInt();
        } // while

        sc.close();

    }
}
