package buclesapuntes;

import java.util.Scanner;

public class E0315 {

    /*
     * E0315. Pedir por consola un número n y dibujar un triángulo rectángulo de n
     * elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n =
     * 4:
     * * * *
     * * *
     * *
     */

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int numero;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();

        // Proceso & Salida
        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }

}
