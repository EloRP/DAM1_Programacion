package recursividad;

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número N del cual quieras saber la sucesión de Tribonacci.");
        int tribonacciUser = sc.nextInt();
        System.out.println("El resultado de la sucesión de Tribonacci del número " + tribonacciUser + " es " + tribonacci(tribonacciUser));
        sc.close();

    }

    public static int tribonacci(int n) {
        if (n == 0) { // si n es igual a 1 y n es igual a 0 devuelve 1 al no poder restar negativos
        return 0;
        } else if (n == 1 || n ==2) {
        return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}