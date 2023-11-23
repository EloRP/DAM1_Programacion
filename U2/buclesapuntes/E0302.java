package buclesapuntes;

import java.util.Scanner;

public class E0302 {

    public static void main(String[] args) {
        int edad;
        int numAlumnos = 0, numMayores18 = 0, sumEdades = 0, mediaEdades;

        Scanner sc = new Scanner(System.in);
        System.out.println("EDADES: Sumas, medias, etc.");
        System.out.println("Introduce las edades de los alumnos (número negativo para terminar)");
        edad = sc.nextInt();

        while (edad >= 0) {
            numAlumnos++;
            sumEdades += edad;
            if (edad >= 18) {
                numMayores18++;
            }
            edad = sc.nextInt();
        }

        sc.close();

        if (numAlumnos > 0) {
            mediaEdades = sumEdades / numAlumnos;
            System.out.println("Número de alumnos: " + numAlumnos);
            System.out.println("Número de alumnos mayores de edad: " + numMayores18);
            System.out.println("Suma de las edades de los alumnos: " + sumEdades);
            System.out.println("Media de las edades de los alumnos: " + mediaEdades);
        } else {
            System.out.println("No has introducido ninguna edad válida.");
        }
    }
}