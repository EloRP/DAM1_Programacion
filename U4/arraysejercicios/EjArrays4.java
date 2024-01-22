package arraysejercicios;

import java.util.Arrays;

public class EjArrays4 {

    public static void main(String[] args) {
        int numPares[] = new int[11];
        Arrays.toString(rellenaPares(numPares));
    }

    public static int[] rellenaPares(int[] numPares) {
        int contador = 0;
        for (int i = 0; i <= 20; i += 2) {
            numPares[contador] = i;
            contador++;
        }
        System.out.println(Arrays.toString(numPares));
        return numPares;
    }

}
/*
 * for (int i = 0; i < longitud; i++) {
 * numeros[i] = (int) (Math.random() * fin / 2) * 2 + 2;
 * }
 * Arrays.sort(numeros);
 * 
 * return numeros;
 */