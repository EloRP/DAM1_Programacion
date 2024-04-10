package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E1210 {

    /*
     * E1210. Escribir en una lista 20 enteros aleatorios entre 1 y 10. A partir de
     * ella, crear un conjunto con los elementos de la lista sin repetir, otro con
     * los repetidos y otro con los elementos que aparecen una sola vez en la lista
     * original.
     */

    // Declara la lista
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        // Crea la lista
        lista = new ArrayList<>();

        // Añade 20 números aleatorioa a la lista
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10) + 1);
        }

        // Ordena la lista por el orden natural de sus elementos
        lista.sort(Comparator.naturalOrder());
        // Imprime la lista
        System.out.println(lista.toString());

        // Declara los conjuntos
        Set<Integer> conjuntoSinRepetidos, conjuntoRepetidos, conjuntoNoRepetidos;

        // Crea los conjuntos
        conjuntoSinRepetidos = new HashSet();
        conjuntoRepetidos = new HashSet();
        conjuntoNoRepetidos = new HashSet();

        // Este conjunto podemos obtenerlo añadiendo todos los elementos de la lista.
        conjuntoSinRepetidos.addAll(lista);

        // Buscar repetidos
        for (Integer num : lista) {
            // Si está repetido
            if (lista.indexOf(num) != lista.lastIndexOf(num)) {
                conjuntoRepetidos.add(num);
            } else {
                conjuntoNoRepetidos.add(num);
            }
        }

        // Imprime los 3 conjuntos
        System.out.println("sinRepetidos: " + conjuntoSinRepetidos.toString());
        System.out.println("Repetidos: " + conjuntoRepetidos.toString());
        System.out.println("NoRepetidos: " + conjuntoNoRepetidos.toString());

    }
}
