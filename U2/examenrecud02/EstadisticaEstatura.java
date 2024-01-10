package examenrecud02;
// Eloy Rodal Pérez
import java.util.InputMismatchException;
import java.util.Scanner;

public class EstadisticaEstatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaración de variables.
        int numAlumnos = 0;
        int alturaTotal = 0;
        double mediaAltura = 0;
        double alturaMayor = 0;
        double alturaMenor = 0;
        double alturaAlumno = 1;
        boolean finPrograma = false;

        //El bucle se mantiene mientras la altura de los alumnos sea mayor que 0.
        while (!finPrograma && alturaAlumno > 0) {
            try {

                numAlumnos++;
                System.out.println("Introduce la altura del alumno " + numAlumnos + " en centímetros ");
                alturaAlumno = sc.nextDouble();
                alturaTotal += alturaAlumno;

                if (alturaAlumno > alturaMayor) {
                    alturaMayor = alturaAlumno;
                } else if (alturaAlumno < alturaMayor && alturaAlumno > 0) {
                    alturaMenor = alturaAlumno;
                }

                if (alturaAlumno < 0)
                    finPrograma = true;
                mediaAltura = (alturaTotal / numAlumnos) / 100;
                System.out.println("El número total de alumnos es de " + numAlumnos + "."
                        + " La altura más alta fue de " + alturaMayor + "cm y la altura menor fue de " + alturaMenor
                        + "."
                        + " La media de estaturas en toda la clase fue de " + mediaAltura + " m aproximadamente.");
                sc.close();

            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un valor válido. No valen caracteres no numéricos.");
                sc.nextLine();
                return;
            }
        }

    }

}
/*
 * if (primerNumero) {
 * numeroMayor = numero;
 * numeroMenor = numero;
 * primerNumero = false;
 * } else {
 * if (numero > numeroMayor) {
 * numeroMayor = numero; //
 * }
 * if (numero < numeroMenor) {
 * numeroMenor = numero; //
 * }
 * }
 * }
 */

/*
 * if (alturaMayor < alturaAlumno) {
 * alturaAlumno = alturaM;
 * }
 * 
 * if (alturaMenor > alturaAlumno)
 * alturaAlumno = alturaMenor;
 */