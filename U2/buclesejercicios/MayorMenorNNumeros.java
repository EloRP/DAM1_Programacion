package buclesejercicios;

/* MayorMenorNNumeros. Diseña una aplicación que muestre el mayor y menor número entero de un conjunto indeterminado de números positivos introducidos por teclado.
El programa terminará al introducir un 0 o un número negativo. */
import java.util.Scanner;

public class MayorMenorNNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroMayor = 0;
        int numeroMenor = 0;
        boolean primerNumero = true;
        while (true) {
            System.out.println("Introduce un número positivo. Escribe número negativo o 0 para terminar: ");
            numero = sc.nextInt();

            if (numero <= 0) {
                break;
            }

            if (primerNumero) {
                numeroMayor = numero;
                numeroMenor = numero;
                primerNumero = false;
            } else {
                if (numero > numeroMayor) {
                    numeroMayor = numero; //
                }
                if (numero < numeroMenor) {
                    numeroMenor = numero; //
                }
            }
        }

        if (!primerNumero) {
            System.out.println("El numeroMayor número introducido es: " + numeroMayor);
            System.out.println("El numeroMenor número introducido es: " + numeroMenor);
        } else {
            System.out.println("No se ha introducido ningún número positivo. Revisa el número.");
        }

        sc.close();
    }
}
