package coleccionesapuntes;

import java.util.Arrays;

public class Util {

    /*
     * Implementar un método genérico estático que realice la inserción de un objeto
     * al final de una tabla, ambos del mismo tipo genérico, que se pasan como
     * parámetros. Devuelve una nueva table con el resultado de la inserción.
     */

    /*
     * PARA ESTE:
     * Se crea una tabla auxiliar (aux) que es una copia de t con el tamaño de t +
     * 1.
     * Se añade el elemento "e" en la última posición de aux.
     * Se retorna aux.
     */

        public static <U> int numeroNulos(U[] t) {
        int cont = 0;
        for (U e : t) {
            if (e == null) {
                cont++;
            }
        }
        return cont;
    }

    /*
     * PARA ESTE:
     * Se crea una tabla auxiliar (aux) que es una copia de t con el tamaño de t +
     * 1.
     * Se añade el elemento "e" en la última posición de aux.
     * Se retorna aux.
     */

    public static <U> U[] add(U e, U[] t) {
        U[] aux = Arrays.copyOf(t, t.length + 1);
        aux[t.length - 1] = e;
        return aux;
    }

    /*
     * Implementa un método genérico que devuelva true si un elemento se encuentra
     * en un array y false en caso contrario.
     */

    /*
     * PARA ESTE:
     * Se recorre el array t y se compara cada elemento con e. Si se encuentra un
     * elemento "ei" igual a e, se retorna true. Si se recorre todo el array y no se
     * encuentra, se retorna false.
     */
    public static <U> boolean buscar(U e, U[] t) {
        for (U ei : t) {
            if (ei.equals(e)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Implementa un método genérico estático al que se le pasan como parámetros dos
     * tables con elementos del mismo tipo genérico y devuelve una nueva tabla con
     * los
     * elementos de ambas concatenados (los de la segunda después de los de la
     * primera).
     */

    /*
     * PARA ESTE:
     * Tienes dos tablas t1 y t2. Se crea otra tabla auxiliar (aux) que es una copia
     * de t1 con el tamaño de t1 + t2.
     * Se recorre t2 y se van añadiendo los elementos de t2 a aux a partir de la
     * posición t1.length + i.
     * Se retorna aux.
     */

    public static <U> U[] concatenarTablas(U[] t1, U[] t2) {
        U[] aux = Arrays.copyOf(t1, t1.length + t2.length);
        for (int i = 0; i < t2.length; i++) {
            aux[t1.length + i] = t2[i];
        }
        return aux;
    }

    /*
     * PARA EL ARRAYCOPY:
     * Partiendo del primer ejercicio, se usa arraycopy
     * arraycopy consiste de la "fuente", "la posición de inicio",
     * "la posición de destino" y "el número de elementos que se copia"
     * Se copian los elementos de t2 a partir de la posición 0, en el final de t1
     * presente en aux y se copia un número de elementos igual a la longitud de t2.
     */

    public static <U> U[] concatenarTablasArrayscopy(U[] t1, U[] t2) {
        U[] aux = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, aux, t1.length, t2.length);
        return aux;
    }
}
