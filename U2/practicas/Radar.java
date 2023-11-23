package practicas;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la distancia entre radares (en kilómetros): ");
        int distanciaRadares = sc.nextInt();
        System.out.print("Introduce el tiempo en segundos que tardó el vehículo en recorrer la distancia: ");
        int tiempoSegundos = sc.nextInt();
        System.out.println("Escribe el límite de velocidad que había en ese tramo: ");
        int limiteVelocidad = sc.nextInt();
        sc.close();

        int exceso = excesoVelocidad(distanciaRadares, tiempoSegundos, limiteVelocidad);

        if (exceso == 0) {
            System.out.println("Velocidad dentro del límite.");
        } else {
            int multa = calcularMulta(exceso);
            System.out.println("Infracción por exceso de velocidad!! Multa de " + multa + " euros");
        }
    }

    static int excesoVelocidad(double distancia, int tiempo, int limite) {
        // Calcular la velocidad promedio en km/h
        double velocidadPromedio = (distancia / tiempo) * 3600;

        // Calcular el exceso de velocidad
        int exceso = (int) (velocidadPromedio - limite);

        return exceso;
    }

    static int calcularMulta(int exceso) {
        int multa = 0;
        if (exceso <= 20) {
            multa = 100;
        } else if (exceso <= 30) {
            multa = 300;
        } else if (exceso <= 40) {
            multa = 400;
        } else if (exceso <= 50) {
            multa = 500;
        } else {
            multa = 600;
        }
        return multa;
    }
}