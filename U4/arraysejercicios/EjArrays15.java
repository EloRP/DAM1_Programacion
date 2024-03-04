package arraysejercicios;

import java.util.Arrays;

public class EjArrays15 {
    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println(Arrays.deepToString(sumaMatrices(matrizA, matrizB)));
    }

    public static int[][] sumaMatrices(int t1[][], int t2[][]) {
        int filas = t1.length;
        int columnas = t1[0].length;
        int[][] resultado = new int[filas][columnas];
        if (t1.length != t2.length || t1[0].length != t2[0].length) {
            System.out.println("Las matrices no tienen el mismo tamaño");
        }

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                resultado[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultado;
    }
}

