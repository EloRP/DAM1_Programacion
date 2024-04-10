package coleccionesejercicios;

import java.util.ArrayList;

public class EP1217 {

    /*
     * @author Eloy Rodal Pérez
     * EP1217. Implementa la clase Cola genérica utilizando un objeto ArrayList para
     * guardar los elementos.
     */

    public static void main(String[] args) {
        Cola<Integer> cola = new EP1217().new Cola<>(); // Se debe poner el EP1217().new para poder instanciar la clase Cola. En todo caso habría que hacerla externa para no tener que ponerlo.
        cola.encolar(1);
        cola.encolar(4);
        cola.encolar(3);
        cola.encolar(2);

        System.out.println(cola.cola); //Se debe poner cola.cola porque la variable cola es un objeto de la clase Cola, y la variable cola de la clase Cola es la que contiene los elementos.

        cola.desencolar();
        cola.desencolar();

        System.out.println(cola.cola); //Se eliminan por orden de llegada. "First in, first out"

    }

    class Cola<T> {
        protected ArrayList<T> cola = new ArrayList<>();

        protected void encolar(T elemento) { // Se usa un objeto T el cual es añadido a la cola, representada como un
                                          // ArrayList al ser dinámico y no ordenado.
            cola.add(elemento);
        }

        protected void desencolar() { // Se elimina el primer elemento de la cola.
            cola.remove(0);
        }

    }
}
