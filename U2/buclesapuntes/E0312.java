package buclesapuntes;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSuspensos = 0;
        System.out.println("Introduce 5 calificaciones de alumnos.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nota del alumno " + i + ":" );
            int calificacion = sc.nextInt();

            if (calificacion < 5) {
                numSuspensos++;
            }
        }
            sc.close();


            if (numSuspensos > 0) {
            System.out.println("Hay " + numSuspensos + " alumnos suspensos.");

            } else {
            System.out.println("No hay ningún alumno suspenso.");
            }
            }
        }

