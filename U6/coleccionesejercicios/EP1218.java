package coleccionesejercicios;

import java.util.ArrayList;

public class EP1218 {
    /*
     * @author Eloy Rodal Pérez
     * EP1218. Implementa la clase Pila genérica utilizando un objeto ArrayList para
     * guardar los elementos.
     */

    public static void main(String[] args) {
        Pila<Integer> pila = new EP1218().new Pila<>();

        pila.apilar(1);
        pila.apilar(4);
        pila.apilar(3);
        pila.apilar(2);

        System.out.println(pila.pila);

        pila.desapilar();
        pila.desapilar();

        System.out.println(pila.pila);      //Aquí se quitan los dos últimos elementos
    }

    class Pila<T> {
        protected ArrayList<T> pila = new ArrayList<>();

        protected void apilar(T elemento) {
            pila.add(elemento);
        }

        protected void desapilar() {
            pila.remove(pila.size() - 1);       //ELIMINA EL ELEMENTO QUE SE ENCUENTRA EN EL ÚLTIMO LUGAR DE LA LISTA TOMANDO EL TAMAÑO DE ESTA Y RESTANDO
        }
    }
}
