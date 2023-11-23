package buclesejercicios;

/* Digitos. Implementa un programa que pida un número entero y lo muestre dígito a dígito.
Por ejemplo, para el número de entrada 123, deberá mostrar por separado los dígitos 3, 2 y 1. */
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número entero: ");
        numero = sc.nextInt();

        numero = Math.abs(numero);

        while (numero > 0) {
            int digito = numero % 10;
            System.out.println("Dígito: " + digito);
            numero /= 10;
        }

        sc.close();
    }
}
