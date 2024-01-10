package arraysapuntes;

import java.util.Arrays;

public class E0505 {

    public static void main(String[] args) {
        //Declaración de variables y constantes
        System.out.println(Arrays.toString(rellenaPares(100,200)));
    }

    static int[] rellenaPares(int longitud, int fin) {
        int numeros[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            numeros[i] = (int) (Math.random() * fin / 2) * 2 + 2;
        }
        Arrays.sort(numeros);

        return numeros;
    
    }
    
}
