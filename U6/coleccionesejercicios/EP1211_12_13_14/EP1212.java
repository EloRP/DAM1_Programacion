package coleccionesejercicios.EP1211_12_13_14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import coleccionesapuntes.Util;

public class EP1212<T> extends Contenedor<Integer> {

    /*
     * @author Eloy Rodal Pérez
     * EP1212. Añade a la clase Contenedor el método
     *
     * void ordenar (Comparator<T> c)
     *
     * que ordena los elementos del contenedor según el criterio de c.
     */

    Object[] tabla = new Object[0];

    void insertarAlPrincipio(T objeto) {
        Object[] aux = new Object[tabla.length + 1];
        aux[0] = objeto;
        for (int i = 0; i < tabla.length; i++) {
            aux[i + 1] = tabla[i];
        }
        tabla = aux;

    }

    void insertarAlFinal(T objeto) {
        Object[] aux = new Object[tabla.length + 1];
        for (int i = 0; i < tabla.length; i++) {
            aux[i] = tabla[i];
        }
        aux[tabla.length] = objeto;
        tabla = aux;
    }

    T extraerAlPrincipio() {
        T res = (T) tabla[0];
        Object[] aux = new Object[tabla.length - 1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = tabla[i + 1];
        }
        tabla = aux;
        return res;
    };

    T extraerDelFinal() {
        T res = (T) tabla[tabla.length - 1];
        Object[] aux = new Object[tabla.length - 1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = tabla[i];
        }
        tabla = aux;
        return res;
    }

    public void ordenar(Collection<Integer> colecNums) {
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = i + 1; j < tabla.length; j++) {
                if (((Comparable) tabla[i]).compareTo(tabla[j]) > 0) {
                    Object aux = tabla[i];
                    tabla[i] = tabla[j];
                    tabla[j] = aux;
                }
            }
        }
    };

    public void ordenar(Comparator<T> c) {
        Arrays.sort(tabla, (Comparator) c);
    }

}
