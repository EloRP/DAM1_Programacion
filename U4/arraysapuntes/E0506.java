package arraysapuntes;

import java.util.Arrays;

public class E0506 {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        final int NUM_NUMS = 6;
        int[] apuesta1 = tablaAleatoria(MIN, MAX, NUM_NUMS);

        int[] combinacionGanadora = tablaAleatoria(MIN, MAX, NUM_NUMS);
        Arrays.sort(combinacionGanadora);

        System.out.println("Apuesta: " + Arrays.toString(apuesta1));
        System.out.println("Combinación ganadora: " + Arrays.toString(combinacionGanadora));

        System.out.println("Aciertos: " + numAciertos(apuesta1, combinacionGanadora));
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {
        int numAciertos = 0;

        for (int num : apuesta)
            if (Arrays.binarySearch(ganadora, num) >= 0)
                numAciertos++;

        return numAciertos;
    }

    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        int[] t = new int[longitud];

        // Inicialización de tabla que comprende desde numInicio a numFin.
        // Se genera un número aleatorio seis veces en las que se comprueba que ninguno
        // es igual a otro.
        for (int i = 0; i < t.length; i++) {
            int num;
            boolean repetido;
            do {
                num = (int) (Math.random() * (numFin - numInicio + 1) + numInicio);
                repetido = false;
                for (int j = 0; j < i; j++)
                    if (t[j] == num)
                        repetido = true;
            } while (repetido);

            t[i] = num;

        }

        return t;
    }
}

/*
 * static int numAciertos(int[] apuesta, int[] ganadora) {
 * int contador = 0;
 * 
 * /*
 * 
 * for(int num : apuesta)
 * if(Arrays.binarySearch(ganadora, num) >= 0)
 * contador++;
 */
/*
 * for (int j = 0; j < apuesta.length; j++) {
 * if (apuesta[i] == ganadora[j]) {
 * contador++;
 * }
 * }
 * }
 * return contador;
 * }
 */