package recursividad;

import java.util.Scanner;

public class NumDigitos {
    public static void main(String[] args) {

        System.out.println("Introduce el número del cual quieras conocer su número de dígitos.");
        Scanner sc = new Scanner(System.in);
        int numeroCifras = sc.nextInt();
        System.out.println("El número de dígitos del número " + numeroCifras + " es de " + contadorDigitos(numeroCifras));
        sc.close();
    }

    public static int contadorDigitos(int numero) {
        if (numero == 0) { // Comprobar si el número es igual a 0 (caso base)
            return 0; // Si el número es 0, no tiene dígitos
        } else {
            return 1 + contadorDigitos(numero / 10); // Utilizar recursión para contar los dígitos
        }
    }
}
