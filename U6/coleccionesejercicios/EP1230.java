package coleccionesejercicios;

import java.util.ArrayList;
import java.util.List;

public class EP1230 {

    /*
     * @author Eloy Rodal Pérez
     * EP1230. Implementa una función
     *
     * <T> List<T> eliminaRepetidos(List<T> lista)
     *
     * a la que se pase una lista de objetos y devuelva una copia sin elementos
     * repetidos.
     *
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
        System.out.println("Lista sin repetidos: " + eliminaRepetidos(lista));
    }
    
    public static <T> List<T> eliminaRepetidos(List<T> lista) {
        List<T> listaSinRepetidos = new ArrayList<>();
        for (T e : lista) {
            if (!listaSinRepetidos.contains(e)) {
                listaSinRepetidos.add(e);
            }
        }
        return listaSinRepetidos;
}

}

