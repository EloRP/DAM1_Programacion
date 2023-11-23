package ejerciciosmath;

import java.util.Scanner;

public class ConversionRadianesGrados {

    /*
     * ConversionRadianesGrados. Desarrolla dos funciones que conviertan una medida
     * en radianes a grados, y viceversa. Desarrolla un programa que pida al usuario
     * ingresar la medida en radianes.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la medida en radianes: ");
        double Radianes = sc.nextDouble();

        System.out.println("Introduce la medida en grados: ");
        double Grados = sc.nextDouble();

        sc.close();
        System.out.println("La medida en grados de los radianes introducidos es de: " + radianesAGrados(Radianes));
        System.out.println("La medida en radianes de los grados introducidos es de: " + gradosARadianes(Grados));



    }

    public static double radianesAGrados(double radianes) {
        return radianes * 180 / Math.PI;
    }

    static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }
    }