package examenud02_CORREGIDO;

import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        int numPuentes;
        int alturaMaxima = 800;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los datos de gálibo para calcular la altura máxima del vehículo: ");
        System.out.println("Número de puentes: ");
        numPuentes = leerNumeroEntre(1, 100);
        for (int i = 0; i < numPuentes; i++) {
            System.out.println("Número de carriles del puente: " + i + ":");
            int numCarriles = leerNumeroEntre(1, 5);
            int maxGaliboPuente = 200;
            for (int j = 1; j <= numCarriles; j++) {
                System.out.println("Gálibo del carril" + j + ":");
                int galibo = leerNumeroEntre(200, 800);
                if (galibo > maxGaliboPuente)
                    maxGaliboPuente = galibo;
            }
            if (maxGaliboPuente < alturaMaxima) {
                alturaMaxima = maxGaliboPuente;
            }
            System.out.println("Altura máxima: " + alturaMaxima);
            sc.close();
        }
    }
    static int leerNumeroEntre(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean numeroOk = true;

        do {
            n = sc.nextInt();
            if (n >= min && n <= max) {
                System.out.println("El número debe estar entre" + min + " y " + max);
                numeroOk = false;
            }
        } while (!numeroOk);

        sc.close();
        return n;

    }
}