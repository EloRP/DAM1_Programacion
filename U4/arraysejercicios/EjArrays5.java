package arraysejercicios;

import java.util.Arrays;

public class EjArrays5 {

    public static void main(String[] args) {
        int arrayPrueba[] = { 5, 77, 34, 0, 63, 31, 35, -23, -54, 0 };

        Arrays.toString(contadorElementos(arrayPrueba));
    }

    public static int[] contadorElementos(int[] arrayElementos) {
        int contadorCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < arrayElementos.length; i++) {
            if (arrayElementos[i] == 0) {
                contadorCeros++;
            } else if (arrayElementos[i] > 0) {
                contadorPositivos++;
            } else if (arrayElementos[i] < 0) {
                contadorNegativos++;
            }
        }
        System.out.println("Número de ceros: " + contadorCeros);
        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);
        
        return Arrays.copyOf(arrayElementos, arrayElementos.length);

    }
}
