package arraysejercicios;

import java.util.Arrays;

public class EjArrays9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayAleatorio(7, 50)));
    }
    static int[] arrayAleatorio(int longitud, int fin) { // Crea un array de una longitud "longitud" y lo rellena con
                                                       // números pares aleatorios hasta el número fin.
        int numeros[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            numeros[i] = (int) (Math.random() * fin);
        }
        Arrays.sort(numeros);

        return numeros;

    }
}
