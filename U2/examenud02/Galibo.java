package examenud02;

import java.util.Scanner;

public class Galibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturaMasAlta = 0;
        int alturaMaxima = 0;
        System.out.println("Introduce el número de puentes o túneles que hay en tu viaje (no más de 100): ");
        int numeroPuentesTuneles = sc.nextInt();
        if (numeroPuentesTuneles <= 100) {

            System.out.println("Introduce el número de carriles que hay debajo del puente (máximo 5): ");
        int carrilesIniciales = 1;
        sc.nextInt();
        if (carrilesIniciales <= 5) {

            switch (carrilesIniciales) {
                case 1, 2, 3, 4, 5:
                    do {
                        System.out.println("Introduce la altura del carril " + carrilesIniciales);
                        int alturaCarriles = sc.nextInt();
                        if (alturaCarriles > 200 || alturaCarriles < 800) {
                            if (alturaCarriles > alturaMasAlta) {
                                alturaMasAlta = alturaMaxima;
                                carrilesIniciales++;
                            }
                        } else {
                            System.out.println("Altura inválida.");
                            break;
                        }
                    } while (carrilesIniciales <= 5);
            }
        }
        sc.close();
        System.out.println("El vehículo puede acceder, como máximo, al carril de " + alturaMaxima + " cm de altura. ");
    }else {
        System.out.println("Número de túneles inválido.");
    }
}
}

/* El programa está sin terminar. Falta repetir los carriles y la conclusión como tal no funciona. */