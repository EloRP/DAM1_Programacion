package condicionalesparaninfo;

import java.time.LocalTime;
import java.util.Scanner;
import java.time.Duration;

public class EP0218_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMMAXIMO = 100;
        int numero1;
        int numero2;
        int resultado;
        int numeroIntroducido;
        int respuestasCorrectas = 0;
        boolean fallo = false;
        String operacion;

        System.out.println("Cálculo mental de sumas, restas o multiplicaciones, introduce la respuesta a la operación.");
        do {
           numero1 = (int) (Math.random() * NUMMAXIMO + 1);
            numero2 = (int) (Math.random() * NUMMAXIMO + 1);

            int opcionOperacion = (int) (Math.random() * 3);

            switch (opcionOperacion) {
                case 0:
                    resultado =numero1 + numero2;
                    operacion = "+";
                    break;
                case 1:
                    resultado =numero1 - numero2;
                    operacion = "-";
                    break;
                case 2:
                    resultado =numero1 * numero2;
                    operacion = "*";
                    break;
                default:
                    resultado = 0;
                    operacion = "?";
                    break;
            }

            System.out.println(numero1 + " " + operacion + " " + numero2 + " =");

            LocalTime tiempoInicio = LocalTime.now();

            numeroIntroducido = sc.nextInt();

            LocalTime tiempoFin = LocalTime.now();

            Duration duracion = Duration.between(tiempoInicio, tiempoFin);
            long segundos = duracion.getSeconds();

            if (resultado == numeroIntroducido) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("¡Has fallado! El resultado era: " + resultado + ".");
                fallo = true;
            }

            System.out.println("Has  tardado" + segundos + " segundos en contestar.");
        } while (!fallo);

        sc.close();

        System.out.println("Has acertado: " + respuestasCorrectas + " operaciones.");
    }
}
