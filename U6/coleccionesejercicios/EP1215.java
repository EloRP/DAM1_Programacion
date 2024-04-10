package coleccionesejercicios;

import java.util.ArrayList;
import java.util.List;

public class EP1215 {

    /* @author Eloy Rodal Pérez
     * EP1215. Implementa un método genérico al que se le pasa una lista de valores
     * de la clase genérica T y devuelve otra donde se han eliminado las
     * repeticiones.
     */

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        System.out.println("Lista original: " + lista);

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        System.out.println("Lista con repetidos: " + lista);
        System.out.println("Lista sin repetidos: " + eliminarRepetidos(lista));
    }





    public static <T> List<T> eliminarRepetidos(List<T> lista) {
        List<T> listaSinRepetidos = new ArrayList<>();
        for (T e : lista) {
            if (!listaSinRepetidos.contains(e)) {
                listaSinRepetidos.add(e);
            }
        }
        return listaSinRepetidos;
    }
}
