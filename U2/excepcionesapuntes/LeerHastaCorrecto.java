package excepcionesapuntes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        // Declarar el objeto Scanner y las variables a utilizar
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        while (!numeroValido) {
            try {
                System.out.println("Introduce un número: ");
                numero = sc.nextInt(); // Intentar leer un número entero
                numeroValido = true; // Marcar el número como válido
            } catch (InputMismatchException e) {
                // Capturar la excepción si se introduce algo que no es un número
                System.out.println("Debes introducir un número válido, no letras u otros caracteres.");
                sc.nextLine(); // Limpiar el escáner
            }
        }

        // Devolver el resultado
        System.out.println("Has introducido un número válido: " + numero);
        sc.close(); // Cerrar el objeto Scanner al final
    }
}

