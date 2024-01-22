package arraysejercicios;

import java.util.Scanner;

public class EjArrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de media de alumnos de una clase. Introduce el número de alumnos.");
        int numAlumnos = sc.nextInt();
        double[] notas = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
        }

        sc.close();
        System.out.println("La media de las notas de la clase es de: " + calculoMedia(notas));

        System.out.println("Los alumnos cuyas notas superan la media son : ");
        alumnosEncimaMedia(notas, calculoMedia(notas));
    }

    static double calculoMedia(double[] notas) {
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        return (sumaNotas / notas.length);
    }

    static void alumnosEncimaMedia(double[] notas, double media) {
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] > media) {
                System.out.println("Alumno " + (j + 1) + ": " + notas[j]);
            }

        }
    }
}

