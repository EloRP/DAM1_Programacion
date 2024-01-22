package arraysejercicios;

import java.util.Scanner;

public class EjArrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número en la posición " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        double[] medias = mediaPositivosNegativos(numeros);
        sc.close();

        System.out.println("Media de positivos: " + medias[0]);
        System.out.println("Media de negativos: " + medias[1]);
    }

    public static double[] mediaPositivosNegativos(int[] numeros) {
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }

        }
        double mediaPositivos = sumaPositivos / contadorPositivos;
        double mediaNegativos = sumaNegativos / contadorNegativos;
        return new double[] { mediaPositivos, mediaNegativos };
    }
}
