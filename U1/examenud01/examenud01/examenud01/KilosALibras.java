/*Eloy Rodal Pérez DAM1 5-10-2023 */

package examenud01;

import java.util.Scanner;

public class KilosALibras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LIBRA = 0.453592;

        System.out.print("Escribe un valor en kilos: ");
        double kilos =  sc.nextDouble();

        double valorKilosALibras = kilos / LIBRA;

        System.out.println("El valor en libras de los kilos que has introducido es de: " + valorKilosALibras);
        /* System.out.printf(format: "%.2f kilos es igual a %.2f libras%n%n", kilos, valorKilosALibrasb) */
        
        sc.close();
    }
}

