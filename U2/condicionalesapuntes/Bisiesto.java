package condicionalesapuntes;

import java.util.Scanner;

public class Bisiesto {

    // Haz un programa que pida por teclado un número de año y que muestre un
    // mensaje indicando si el año es bisiesto o no. Investiga el agoritmo para
    // calcular si un año es bisiesto o no.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un año:");
        int anho = sc.nextInt();

        boolean bisiesto = (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);

        // El año será bisiesto si es divisible entre 4 , no divisible entre 100, o si
        // es divisible entre 400

        if (bisiesto) {

            System.out.println("El año " + anho + " es un año bisiesto.");

        } else {

            System.out.println("El año " + anho + " no es un año bisiesto.");
        }

        sc.close();

        // proceso con ifs anidados

        if (anho % 4 == 0) {
            if (anho % 100 != 0) {
                bisiesto = true;

            } else {
                if (anho % 400 == 0)
                    bisiesto = true;
            }
        }
    }
}
