package arraysparaninfo;

import java.util.Arrays;
import java.util.Scanner;

/*
* EP0519. Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera. Cada uno de ellos dispone de un dorsal (un número entero) que los identifica.
*En la aplicación se introduce el número de dorsal de cada corredor cuando éste llega a la meta.
* Para indicar que la carrera ha finalizado (han llegado todos los corredores a la meta), se introduce como dorsal el número -1.
* A continuación, la aplicación solicita información extra de los corredores.
* En primer lugar, se introducen los dorsales de todos los corredores menores de edad; para premiarlos por su esfuerzo se les avanza un puesto en el ranking general de la carrera, es decir,
* es como si hubieran adelantado al corredor que llevaban delante.
* En segundo lugar, se introducen los dorsales de los corredores que han dado positivo en el test antidopaje, lo que provoca su expulsión inmediata.
* Para finalizar, se introducen los dorsales de los corredores que no han pagado su inscripción en la carrera, lo que provoca que se releguen a los últimos puestos del ranking general.
* La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce.
*
 */
public class EP5019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDorsal;
        int numDorsalMenores;
        int posicionCarrera;
        int[] dopados = new int[100];
        int[] menores = new int[100];
        int[] sinInscripcion = new int[100];
        System.out.println("Registro de corredores.");
        System.out.println("Escribe el dorsal de cada corredor. Escribe -1 para finalizar.");
        numDorsal = sc.nextInt();
        while (numDorsal != -1) {
            numDorsal = sc.nextInt();
        }
        sc.close();
        System.out.println("Introduce los números de dorsal de los corredores menores de edad (-1 para terminar): ");
        numDorsal = sc.nextInt();
        while (numDorsal != -  1) {
            /*menores += numDorsalMenores;*/
            numDorsal = sc.nextInt();
        }
        System.out.println(
                "Introduce el dorsal de aquellos corredores que hayan dado positivo en el control antidopaje: ");
        numDorsal = sc.nextInt();
        System.out.println(
                "Introduce los dorsales de aquellos corredores que no han pagado su inscripción en la carrera.");
    }

}

/* static int[] eliminacionCorredor(int t[], int corredor) {
        int[] aux = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] != corredor) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = t[i];
            }
        }

        return aux;
    } */