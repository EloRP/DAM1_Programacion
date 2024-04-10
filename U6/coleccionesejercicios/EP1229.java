package coleccionesejercicios;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class EP1229<T> {
    /*
     * @author Eloy Rodal Pérez
     * EP1229. Añade a la clase Contenedor para tipos genéricos los métodos:
     * int[] buscarTodos (Object e): que devuelve una tabla con los indices de
     * todas las ocurrencias de e.
     * boolean eliminarTodos (Object e): que elimina todas las ocurrencias de e.
     * Devuelve true si la lista queda alterada.
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

    public int[] buscarTodos(Object e) {
        int[] indices = new int[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(e)) {
                int[] aux = new int[indices.length + 1];
                for (int j = 0; j < indices.length; j++) {
                    aux[j] = indices[j];
                }
                aux[indices.length] = i;
                indices = aux;
            }
        }
        return indices;
    }

    public boolean eliminarTodos(Object e) {
        int[] indices = buscarTodos(e);

        if (indices.length == 0) {
            return false;
        } else {
            Object[] aux = new Object[tabla.length - indices.length];
            int j = 0;
            for (int i = 0; i < tabla.length; i++) {
                if (Arrays.binarySearch(indices, i) < 0) {
                    aux[j] = tabla[i];
                    j++;
                }
            }
            tabla = aux;
            return true;
        }
    }

    public static void main(String[] args) {
        EP1229<Integer> contenedor = new EP1229<>();

        contenedor.insertarAlFinal(1);
        contenedor.insertarAlFinal(2);
        contenedor.insertarAlFinal(3);
        contenedor.insertarAlFinal(4);
        contenedor.insertarAlFinal(4);
        contenedor.insertarAlFinal(4);

        int[] indices = contenedor.buscarTodos(contenedor.tabla[4]); // Devuelve la posición de los 4. Recuerda el 0.

        System.out.println(Arrays.toString(indices));

        contenedor.eliminarTodos(contenedor.tabla[4]); // Elimina todos los 4.

        System.out.println(Arrays.toString(contenedor.tabla));
    }
}
