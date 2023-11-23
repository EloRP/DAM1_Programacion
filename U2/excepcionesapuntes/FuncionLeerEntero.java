package excepcionesapuntes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionLeerEntero {
    public static void main(String[] args) {
        int numero = leerEntero(); // Llamar a la función leerEntero y almacenar el valor en 'numero'
        System.out.println("Has introducido: " + numero);
    }

    public static int leerEntero() {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        try {
            System.out.println("Introduce un número entero: "); // Solicitar al usuario que introduzca un número entero
            int numero = sc.nextInt(); // Intentar leer un número entero
            return numero; // Devolver el número entero leído
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero válido. Intenta de nuevo.");
            sc.nextLine(); // Limpiar el scanner para evitar bucles infinitos
            return leerEntero(); // Llamada recursiva para intentar de nuevo si se ingresa un valor no válido
        } finally {
            sc.close(); // Cerrar el scanner en el bloque finally
        }
    }
}
