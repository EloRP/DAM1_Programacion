package arraysejercicios;

import java.util.Scanner;

public class EjArrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizUsuario = new int[3][3];

        System.out.println("Introduce los elementos de la matriz 3x3.");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizUsuario[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int suma = calcularSumaMatriz(matrizUsuario);
        System.out.println("La suma de todos los elementos de la matriz "); mostrarMatriz(matrizUsuario);
        System.out.println("es de " + suma);
    }

    public static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
