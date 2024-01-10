package repaso_recu;

import java.util.Scanner;

public class bucles2 {
    /*
     * Factorial:
     * Implementa un programa que calcule el factorial de un número ingresado por el
     * usuario utilizando un bucle.
     */

    public static void main(String[] args) {
        long resultadoFactorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número a partir del cual se realizará el factorial.");
        int numeroFactorial = sc.nextInt();

        for (int anteriores = 1; anteriores <= numeroFactorial; anteriores++)
            if (numeroFactorial == 0) {
                resultadoFactorial = 1;
            } else {
                resultadoFactorial *= anteriores;

            }

        System.out.println("El resultado del factorial es: " + resultadoFactorial);
        sc.close();
    }
}

/*
 * El factorial de un número se calcula multiplicando todos los números
 * ANTERIORES a él.
 * Para una variable "anteriores" igual a 1, mientras sea menor o igual que
 * numeroFactorial, se suma 1 a esta.
 * Si el númeroFactorial es igual a 0 su factorial es igual a 1.
 * En cualquier otro caso, el resultado del factorial es igual a la multiplicación de todos los "anteriores".
 */