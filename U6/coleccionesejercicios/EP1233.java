package coleccionesejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EP1233 {
    /*
     * @author Eloy Rodal Pérez
     * EP1233. Define la clase ListaOrdenada, que almacena una serie de objetos de
     * tipo genérico E, de forma ordenada, pudiéndose repetir.
     * Los elementos se ordenarán según el orden natural de E o bien con el criterio
     * de orden definido en un comparador que se le pasa al constructor.
     */
    public static void main(String[] args) {
        ListaOrdenada<String> listaO = new ListaOrdenada<>();
        ListaOrdenada<String> listaO2 = new ListaOrdenada<String>(Comparator.reverseOrder());
        listaO.add("Maria");
        listaO.add("Lola");
        listaO.add("Pepa");
        listaO.add("Martín");
        System.out.println(listaO);
        listaO2.add("Maria");
        listaO2.add("Lola");
        listaO2.add("Pepa");
        listaO2.add("Martín");
        System.out.println(listaO2);
        listaO2.reordenar(Comparator.naturalOrder());
        System.out.println(listaO2);
    }
}

class ListaOrdenada<T extends Comparable<T>> {
    List<T> elementos;
    Comparator<T> comp;

    public ListaOrdenada() {
        this.elementos = new ArrayList<T>();
        this.comp = null;
    }

    public void reordenar(Comparator<T> c) {
        this.comp = c;
        elementos.sort(c);
    }

    public ListaOrdenada(Comparator<T> comp) {
        this.elementos = new ArrayList<T>();
        this.comp = comp;
    }

    public void add(T e) {
        elementos.add(e);
        elementos.sort(comp);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}