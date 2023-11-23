package ejerciciosmath;

import java.util.Scanner;

/*
 * Hipotenusa. Escribe un programa que tome como entrada la longitud de dos lados de un triángulo rectángulo y
 * calcule la longitud de la hipotenusa utilizando el teorema de Pitágoras:
*/

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del primer lado del triángulo: ");
        double lado1 = sc.nextDouble();
    
        System.out.println("Introduce la longitud del segundo lado del triángulo: ");
        double lado2 = sc.nextDouble();

        sc.close();

        System.out.println("La hipotenusa del triángulo de lados " + lado1 + " y " + lado2 + " es de: " + calculoHipotenusa(lado1, lado2));
    }

    public static double calculoHipotenusa (double lado1, double lado2){
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow (lado2, 2));
    }
}
