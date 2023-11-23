package funcionesparaninfo;

import java.util.Scanner;

/*
 * EP0417. Escribe una función que decida si dos números enteros positivos son amigos.
 * Dos números a y b son amigos si la suma de los divisores propios (distintos de él mismo) de a
 * es igual a b. Y viceversa.
 * Para probar se pueden usar los números 220 y 284, que son amigos.
 */
public class EP0417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer número.");
        int numero1 = sc.nextInt();
        System.out.println("Escribe el segundo número.");
        int numero2 = sc.nextInt();
        sc.close();
        
        if (Amigos(numero1, numero2)) {
            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }
    }

    static boolean Amigos(int num1, int num2) {
        return (sumaDivisoresPropios(num1) == num2) && (sumaDivisoresPropios(num2) == num1);
    }

    static int sumaDivisoresPropios(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
