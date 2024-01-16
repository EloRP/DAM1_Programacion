package arraysparaninfo;

import java.util.Scanner;

public class EP5018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos para la matriz
        int[][] matriz = new int[4][4];
        System.out.println("Introduce los elementos de la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento en la posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si es una matriz mágica
        if (esMatrizMagica(matriz)) {
            System.out.println("La matriz introducida es una matriz mágica.");
        } else {
            System.out.println("La matriz introducida no es una matriz mágica.");
        }

        scanner.close();
    }

    private static boolean esMatrizMagica(int[][] matriz) {
        // Calcular la suma de la primera fila para comparar con las otras filas
        int sumaPrimeraFila = 0;
        for (int j = 0; j < 4; j++) {
            sumaPrimeraFila += matriz[0][j];
        }

        // Verificar las sumas de las filas
        for (int i = 1; i < 4; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < 4; j++) {
                sumaFilaActual += matriz[i][j];
            }
            if (sumaFilaActual != sumaPrimeraFila) {
                return false; // Si alguna suma de fila es diferente, no es una matriz mágica
            }
        }

        // Verificar las sumas de las columnas
        for (int j = 0; j < 4; j++) {
            int sumaColumnaActual = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumnaActual += matriz[i][j];
            }
            if (sumaColumnaActual != sumaPrimeraFila) {
                return false; // Si alguna suma de columna es diferente, no es una matriz mágica
            }
        }

        return true; // Si todas las sumas coinciden, es una matriz mágica
    }
}