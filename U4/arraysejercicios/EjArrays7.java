package arraysejercicios;

import java.util.Scanner;

public class EjArrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de altura media. Introduce la cantidad de alturas (en cm) que desees.");
        int numAlturas = sc.nextInt();
        double[] alturas = new double[numAlturas];

        for (int i = 0; i < numAlturas; i++) {
            System.out.println("Introduce la altura " + (i + 1) + ":");
            alturas[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println("La media de alturas introducidas es de: " + calculoMedia(alturas) + " cm.");

        System.out.println("Las alturas que superan la media son: ");
        alturasSuperiores(alturas, calculoMedia(alturas));
        System.out.println("Las alturas inferiores a la media son: ");
        alturasInferiores(alturas, calculoMedia(alturas));
    }

    static double calculoMedia(double[] alturas) {
        double sumaAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            sumaAlturas += alturas[i];
        }
        return (sumaAlturas / alturas.length);
    }

    static void alturasSuperiores(double[] alturas, double media) {
        for (int j = 0; j < alturas.length; j++) {
            if (alturas[j] > media) {
                System.out.println("Altura " + (j + 1) + ": " + alturas[j]);
            }
        }
    }

    static void alturasInferiores(double[] alturas, double media) {
        for (int j = 0; j < alturas.length; j++) {
            if (alturas[j] < media) {
                System.out.println("Altura " + (j + 1) + ": " + alturas[j]);
            }
        }
    }
}
/*
 * static double calculoMedia(double[] notas) {
 * double sumaNotas = 0;
 * for (int i = 0; i < notas.length; i++) {
 * sumaNotas += notas[i];
 * }
 * return (sumaNotas / notas.length);
 * }
 * 
 * static void alumnosEncimaMedia(double[] notas, double media) {
 * for (int j = 0; j < notas.length; j++) {
 * if (notas[j] > media) {
 * System.out.println("Alumno " + (j + 1) + ": " + notas[j]);
 * }
 * 
 * }
 * }
 */