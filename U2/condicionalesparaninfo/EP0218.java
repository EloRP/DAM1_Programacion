package condicionalesparaninfo;

/* EP0318. De forma similar a la actividad anterior (EP0317),
implementa un algoritmo que calcule el minimo común múltiplo de dos números dados. */

import java.util.Scanner;

public class EP0218 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXIMO = 100;
        int num1;
        int num2;
        int resultado;
        int numeroIntroducido;
        int aciertos = 0;
        boolean fallo = false;
        String operacion;

        System.out.println("Cálculo mental de sumas, restas o multiplicaciones");
        System.out.println("Resuelve la operación aleatoria.");

        do {

            num1 = (int) (Math.random() * MAXIMO + 1);
            num2 = (int) (Math.random() * MAXIMO + 1);
            int opcionOperacion = (int) (Math.random() * 3);

            switch (opcionOperacion) {
                case 0:
                    resultado = num1 + num2;
                    operacion = "+";
                    break;
                case 1:
                    resultado = num1 - num2;
                    operacion = "-";
                    break;
                case 2:
                    resultado = num1 * num2;
                    operacion = "*";
                    break;
                default:
                    resultado = 0;
                    operacion = "?";
                    break;
            }

            System.out.println(num1 + " " + operacion + " " + num2 + " =");
            numeroIntroducido = sc.nextInt();

            if (resultado == numeroIntroducido) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("¡Has fallado! El resultado era: " + resultado + ".");
                fallo = true;
            }
        } while (!fallo);

        sc.close();

        System.out.println("Has acertado: " + aciertos + " operaciones.");
    }
}
