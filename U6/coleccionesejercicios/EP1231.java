package coleccionesejercicios;

import java.util.ArrayList;

public class EP1231  {

    /*
     * @author Eloy Rodal Pérez
     * EP1231. Implementa las clases Cola y Pila genéricas heredando de ArrayList.
     */

    public static void main(String[] args) {
        
        Cola<Integer> cola = new Cola<>();
        
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());
        System.out.println(cola.desencolar());

        Pila<String> pila = new Pila<>();
        
        pila.apilar("Lola");
        pila.apilar("Maria");
        pila.apilar("Pepa");
    
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
    }

    public static class Cola<E> extends ArrayList<E> {
        
        public void encolar(E e) {
            add(e);
        }

        public E desencolar() {
            return remove(0);
        }
    }

    public static class Pila<E> extends ArrayList<E> {
        
        public void apilar(E e) {
            add(e);
        }

        public E desapilar() {
            return remove(size() - 1);
        }
    }
}
