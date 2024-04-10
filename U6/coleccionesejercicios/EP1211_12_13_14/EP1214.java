package coleccionesejercicios.EP1211_12_13_14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class EP1214<T> extends Contenedor<Integer> {

    /*
     * @author Eloy Rodal Pérez
     * EP1214. Añade a la clase Contenedor el método
     * 
     * T get (int indice)
     * 
     * que devuelve el elemento que ocupa el lugar indice dentro del contenedor.
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

    T get (int indice) {
        return (T) tabla[indice];
    }

    public static void main(String[] args) {
        System.out.println("Comprobación de método:");
        EP1214<Integer> contenedor = new EP1214<>();

        contenedor.insertarAlFinal(1);
        contenedor.insertarAlFinal(2);
        contenedor.insertarAlFinal(3);
        contenedor.insertarAlFinal(4);
        contenedor.insertarAlFinal(5);

        System.out.println("Elemento en la posición 0: " + contenedor.get(0));      // -> Importante el detalle de que es el índice 0.
        System.out.println("Elemento en la posición 1: " + contenedor.get(1));
        System.out.println("Elemento en la posición 2: " + contenedor.get(2));
    }
}
