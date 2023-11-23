package condicionalesparaninfo;

/* EP0214. Escribe un programa que solicite al usuario un número comprendido entre 1 y 99.
El programa debe mostrario con letras, por ejemplo, para 56, se verá: “cincuenta y seis”. */

import java.util.Scanner;

public class EP0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("El número debe estar entre 1 y 99.");
        } else {
            String numeroEnPalabras = convertirNumeroAPalabras(numero);
            System.out.println(numeroEnPalabras);
        }

        scanner.close();
    }

    public static String convertirNumeroAPalabras(int numero) {
        String[] unidades = {
                "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco",
                "Seis", "Siete", "Ocho", "Nueve"
        };

        String[] decenas = {
                "Diez", "Once", "Doce", "Trece", "Catorce", "Quince",
                "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"
        };

        String[] decenasMultiplos = {
                "", "", "Veinte", "Treinta", "Cuarenta", "Cincuenta",
                "Sesenta", "Setenta", "Ochenta", "Noventa"
        };

        if (numero < 10) {
            return unidades[numero];
        } else if (numero >= 10 && numero < 20) {
            return decenas[numero - 10];
        } else {
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad == 0) {
                return decenasMultiplos[decena];
            } else {
                return decenasMultiplos[decena] + " y " + unidades[unidad];
            }
        }
    }
}
