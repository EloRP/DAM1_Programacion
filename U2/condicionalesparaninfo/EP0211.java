package condicionalesparaninfo;

/* EP0211. Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
La aplicación tendrá que indicar si el número introducido es capicúa.*/

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9999.");
        int numero = scanner.nextInt();
        scanner.close();

        if (esCapicua(numero)) {
            System.out.println("El número es capicúa.");

        } else {
            System.out.println("El número no es capicúa.");
        }
    }

    public static boolean esCapicua(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        return numeroOriginal == numeroInvertido;
    }
}
