// ELOY RODAL PÉREZ

package examenud04rec;

import java.util.Arrays;
import java.util.Scanner;

public class Sumas {

    /*
     * PRIMER ELEMENTO: SUMA DE TODOS
     * SEGUNDO ELEMENTO: SUMA DE TODOS LOS POSITIVOS
     * TERCER ELEMENTO: SUMA DE TODOS LOS NEGATIVOS
     */

    static int[] sumas(int t[]) {
        int[] resultados = new int[3];
        if (t == null) { // Primer caso, que el array sea nulo o su longitud sea 0
            return null;
        } else {
            for (int i = 0; i < t.length; i++) {
                resultados[0] += t[i];
                // Primer elemento, suma todos los números del array
                if (t[i] >= 0) {
                    resultados[1] += t[i]; // Segundo elemento, suma todos los números positivos del array
                }
                if (t[i] <= 0) {
                    resultados[2] += t[i]; // Tercer elemento, suma todos los números negativos del array
                }
            }
        }
        return resultados;
    }

    public static void main(String[] args) {        //PEQUEÑO PROGRAMA MAIN EN EL QUE SE EMPLEA EL MÉTODO.
        Scanner sc = new Scanner(System.in);
        int numeroCifrasArray;
        System.out.println("Introduce la cantidad de números que conforman el array");
        numeroCifrasArray = sc.nextInt();
        int[] arrayInicial = new int[numeroCifrasArray];
        System.out.println("Introduce los valores del array (números enteros)");

        for (int i = 0; i < arrayInicial.length; i++) {
            arrayInicial[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(sumas(arrayInicial)));
    }

}
