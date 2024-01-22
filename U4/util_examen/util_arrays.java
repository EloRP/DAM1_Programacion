package util_examen;

import java.util.Arrays;

public class util_arrays {

    private static void imprimirInverso(int[] t) { // Imprime un array al revés
        for (int i = t.length - 1; i >= 0; i--)
            System.out.print(t[i] + " ");
    }

    public static void imprimir(int[] t) { // Imprime un array
        for (int i = 0 - 1; i >= 0; i--)
            System.out.print(t[i] + " ");
    }

    static int buscar(int t[], int clave) { // Busca un número en concreto dentro de un array y devuelve la posición de este. Cambia el tipo en función de las necesidades.
        int posicion = -1;

        if (t != null) {
            int i = 0;
            while (posicion == -1 && i < t.length) {
                if (clave == t[i])
                    posicion = i;
                i++;
            }
        }
        return posicion;
    }

    static int maximo(int t[]) {
        int maximo = t[0];

        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximo) {
                maximo = t[i];
            }
        }

        return maximo;
    }

    static int[] rellenaPares(int longitud, int fin) { // Crea un array de una longitud "longitud" y lo rellena con
                                                       // números pares aleatorios hasta el número fin.
        int numeros[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            numeros[i] = (int) (Math.random() * fin / 2) * 2 + 2;
        }
        Arrays.sort(numeros);

        return numeros;

    }

    static int[] insertarOrdenado(int[] t, int valor) { // Inserta un número de manera ordenada en un array.
        if (t == null) {
            t = new int[1];
            t[0] = valor;
        } else {
            int[] copia = new int[t.length + 1];
            int indiceInsercion = Arrays.binarySearch(t, valor);
            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1;
            }
            System.arraycopy(t, 0, copia, 0, indiceInsercion);
            copia[indiceInsercion] = valor;
            System.arraycopy(t, indiceInsercion, copia, indiceInsercion + 1, t.length - indiceInsercion);
            t = copia;
        }
        return t;
    }

    static int[] eliminarValor(int t[], int valor) { // Eliminar un valor en particular de un array.
        int[] aux = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] != valor) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = t[i];
            }
        }

        return aux;
    }

    static int[] eliminarIndice(int t[], int indice) { // Cambio de tipo de array que le pasas y el tipo de array que
                                                       // devuelves al que necesites
        int[] aux = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] != t[indice]) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = t[i];
            }
        }

        return aux;
    }
}