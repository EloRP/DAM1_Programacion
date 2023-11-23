package excepcionesapuntes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionTiposEntrada {
    public static void main(String[] args) {
        //Declarar la variable número y la instancia del objeto escáner
        Scanner sc = new Scanner(System.in);
        int numero;

        try {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt(); // Intentar leer un número entero
            System.out.println("Has introducido: " + numero);
        } catch (InputMismatchException e) {
            // Capturar la excepción si se introduce algo que no es un número
            System.out.println("Debes introducir un número válido, no letras u otros caracteres.");
        } finally {
            sc.close(); // Cerrar el objeto Scanner en el bloque finally
        }
    }
}
