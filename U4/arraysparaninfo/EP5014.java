package arraysparaninfo;

import java.util.Scanner;
import java.util.Arrays;

public class EP5014 {

    /*
     * EP0514. El ayuntamiento de tu localidad te ha encargado una aplicación que
     * ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo de
     * los habitantes del municipio. Para ello, tendrás que preguntar el sueldo a
     * cada persona encuestada. A priori, no conoces el número de encuestados. Para
     * finalizar la entrada de datos, introduce un sueldo con valor -1.
     *
     * Una vez terminada la entrada de datos, muestra la siguiente información:
     * Todos los sueldos introducidos ordenados de forma decreciente.
     * El sueldo máximo y mínimo.
     * La media de los sueldos.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración e inicialización de variables
        int sueldo;
        int[] sueldos = new int[1000]; // Tamaño máximo de la encuesta

        // Entrada de datos
        int i = 0;
        System.out.println("Introduce los sueldos de los habitantes. Finaliza con -1:");
        while (true) {
            System.out.print("Sueldo: ");
            sueldo = scanner.nextInt();

            if (sueldo == -1) {
                break;
            }

            sueldos[i] = sueldo;
            i++;
        }

        // Ordenar los sueldos de forma decreciente
        Arrays.sort(sueldos, 0, i);
        int[] sueldosOrdenados = new int[i];
        for (int j = 0; j < i; j++) {
            sueldosOrdenados[j] = sueldos[i - 1 - j];
        }

        // Mostrar la información solicitada
        System.out.println("\nSueldos ordenados de forma decreciente:");
        for (int j = 0; j < i; j++) {
            System.out.println(sueldosOrdenados[j]);
        }

        int sueldoMaximo = sueldosOrdenados[0];
        int sueldoMinimo = sueldosOrdenados[i - 1];
        int sumaSueldos = 0;

        // Calcular la media de los sueldos
        for (int j = 0; j < i; j++) {
            sumaSueldos += sueldosOrdenados[j];
        }

        double mediaSueldos = (double) sumaSueldos / i;

        System.out.println("\nSueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);
        System.out.println("Media de sueldos: " + mediaSueldos);

        scanner.close();
    }
}