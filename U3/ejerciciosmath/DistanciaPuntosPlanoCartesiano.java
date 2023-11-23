package ejerciciosmath;

import java.util.Scanner;

/*
 * DistanciaPuntosPlanoCartesiano. Permite al usuario ingresar las coordenadas (x, y) de dos puntos en un plano cartesiano.
 * Calcula la distancia entre estos dos puntos utilizando la fórmula de distancia euclidiana:
 */

public class DistanciaPuntosPlanoCartesiano {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la primera coordenada del punto A (x): ");
    double coordenadaXA = sc.nextDouble();
    System.out.println("Introduce la segunda coordenada del punto A (y): ");
    double coordenadaYA = sc.nextDouble();

    System.out.println("Introduce la primera coordenada del punto B (x): ");
    double coordenadaXB = sc.nextDouble();
    System.out.println("Introduce la segunda coordenada del punto B (y): ");
    double coordenadaYB = sc.nextDouble();

    sc.close();
    System.out.println("La distancia entre los puntos A(" + coordenadaXA + " , " + coordenadaXB + ")" + " y B(" + coordenadaXB + " , " + coordenadaYB + ")" + " es de " + distanciaEuclidiana(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB));
}
    public static double distanciaEuclidiana(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        return Math.sqrt(Math.pow(coordenadaXA - coordenadaXB, 2) + Math.pow(coordenadaYA - coordenadaYB, 2));
    }
}
