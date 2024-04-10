package coleccionesejercicios;

import java.util.ArrayList;
import java.util.List;

public class EP1232 {

    /*
     * @author Eloy Rodal Pérez
     * EP1232. Implementa la función
     * static <E> List<E> clonaLista (List<E>)
     * que realice una copia exacta de una lista.
     */


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(512);

        System.out.println(lista);
        List<Integer> listaClonada = clonaLista(lista);
        System.out.println(listaClonada);
    }

    public static <E> List<E> clonaLista(List<E> listaOriginal) {
        List<E> listaClonada = new ArrayList<>();
        listaClonada.addAll(listaOriginal);
        return listaClonada;
    }
}

