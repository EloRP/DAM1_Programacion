package arraysejercicios;

import java.util.Scanner;

public class EjArrays2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un array de tamaño 10 para almacenar los números
        int[] numeros = new int[10];

        // Entrada de datos
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular la media de los números en posiciones pares
        double mediaPosicionesPares = calcularMediaPosicionesPares(numeros);

        // Mostrar el resultado
        System.out.println("La media de los números en posiciones pares es: " + mediaPosicionesPares);

        scanner.close();
    }

    private static double calcularMediaPosicionesPares(int[] numeros) {
        // Verificar si el array tiene al menos dos elementos para calcular la media de posiciones pares
        if (numeros.length < 2) {
            throw new IllegalArgumentException("El array debe tener al menos dos elementos para calcular la media de posiciones pares.");
        }

        // Calcular la suma de los números en posiciones pares
        int sumaPosicionesPares = 0;
        int contadorPosicionesPares = 0;

        for (int i = 0; i < numeros.length; i += 2) {
            sumaPosicionesPares += numeros[i];
            contadorPosicionesPares++;
        }

        // Calcular la media
        return (double) sumaPosicionesPares / contadorPosicionesPares;
    }
}
