package coleccionesapuntes;

import java.util.Arrays;

public class E1201 {
    /*
     * E1201. Implementar un método genérico estático que realice la inserción de un
     * objeto al final de una tabla, ambos del mismo tipo genérico, que se pasan
     * como parámetros. Devuelve una nueva table con el resultado de la inserción.
     */

    public static <U> U[] add(U e, U[] t) {
        U[] aux = Arrays.copyOf(t, t.length + 1);
        aux[aux.length - 1] = e;
        return aux;
    }

    /*
     * Implementa un método genérico que devuelva true si un elemento se encuentra
     * en un array y false en caso contrario.
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
     * los elementos de ambas concatenados (los de la segunda después de los de la
     * primera).
     */

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] aux = Arrays.copyOf(t1, t1.length + t2.length);

        System.arraycopy(t2, 0, aux, t1.length, t2.length);

        return aux;
    }

    public static void main(String[] args) {
        Integer[] t = { 1, 2, 3, 4, 5 };
        Integer e = 6;
        Integer[] res = add(e, t);
        System.out.println(Arrays.toString(res));

        System.out.println(buscar(5, t));

        Integer[] t1 = { 1, 2, 3 };
        System.out.println(Arrays.toString(t1));
        Integer[] t2 = { 4, 5, 6 };
        System.out.println(Arrays.toString(t2));
        Integer[] res2 = concatenar(t1, t2);
        System.out.println(Arrays.toString(res2));

    }
}
