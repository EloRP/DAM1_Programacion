package ficherostextoapuntes;

import java.util.Scanner;

public class E1001 {

    /*
     * APUNTES.
     * E1001. Escribir el método
     * Integer leerEntero()
     * que pide un entero por consola, lo lee del teclado y lo devuelve. Si la
     * cadena introducida
     * por consola no tiene el formato correcto, muestra un mensaje de error y
     * vuelve a pedirlo.
     */

    static Integer leerEntero() {
        Integer numero = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        do {
            try {
                numero = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine(); // Vacía el buffer de entrada
                System.out.print("Error de entrada. Prueba otra vez: ");
            }
        } while (numero == null);
        return numero;
    }

    public static void main(String[] args) {
        Integer n = leerEntero();

        System.out.println(n);
    }

}
