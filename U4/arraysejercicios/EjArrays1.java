package arraysejercicios;

import java.util.Scanner;

public class EjArrays1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números a introducir
        System.out.print("Introduce la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        // Declarar un array para almacenar los números
        double[] numeros = new double[cantidadNumeros];

        // Entrada de datos
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la media
        double media = calcularMedia(numeros);

        // Mostrar el resultado
        System.out.println("La media de los números es: " + media);

        scanner.close();
    }

    private static double calcularMedia(double[] numeros) {
        // Verificar si el array es vacío
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        // Calcular la suma de los números
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        // Calcular la media
        return suma / numeros.length;
    }
}