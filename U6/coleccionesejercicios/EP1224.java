package coleccionesejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EP1224 {
    /* @author Eloy Rodal Pérez
     * EP1224. Implementa una función a la que se le pasen dos listas de enteros
     * ordenadas en sentido creciente y nos devuelva una única lista, también
     * ordenada, fusión de las dos anteriores. Desarrolla el algoritmo de forma no
     * destructiva, es decir, que las listas utilizadas como parámetros de entrada
     * se mantengan intactas.
     */

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);

        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);

        System.out.println(fusionadorListas(lista1, lista2));

        System.out.println(lista1);
        System.out.println(lista2);
    }

    public static List<Integer> fusionadorListas (List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaFusionada = new ArrayList<>();
        
        Collections.sort(lista1);
        Collections.sort(lista2);

        listaFusionada.addAll(lista1);
        listaFusionada.addAll(lista2);

        Collections.sort(listaFusionada);

        return listaFusionada;

        
    }

}
