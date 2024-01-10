package repaso_recu;

import java.util.Scanner;

public class bucles1 {
    /*
     * Suma de Números Pares:
     *
     * Escribe un programa que solicite un número al usuario e imprima la suma de
     * todos los números pares hasta ese número.
     */

    public static void main(String[] args) {
        int numeroParaSuma;
        int sumaNumerosPares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número.");
        double numeroSuma = sc.nextDouble();
        sc.close();

        for (numeroParaSuma = 1; numeroParaSuma <= numeroSuma; numeroParaSuma++) {
            if (numeroParaSuma % 2 == 0) {
            sumaNumerosPares += numeroParaSuma;
            }
        }

        System.out.println("La suma de todos los números pares es igual a: " + sumaNumerosPares);
        sc.close();

    }
}


 //Para un número que empieza en 1, mientras este número sea inferior al número elegido por el usuario, el número que empieza en 1 aumenta.
 //Si el número es par, se añade su valor al monto total de la suma (sumaNumerosPares)