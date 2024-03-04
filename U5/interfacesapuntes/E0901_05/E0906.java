package interfacesapuntes.E0901_05;

import java.util.Arrays;

public class E0906 {
    public static void main(String[] args) {
        Cola cola = new Lista();

        cola.encolarMultiple(3, 10);
        cola.encolarMultiple(4, 3);

        System.out.println(Arrays.toString(cola.desencolarTodos()));

        /*
        Integer e = cola.desencolar();
        while (e != null) {
            System.out.println(e);
            e = cola.desencolar();
        }
        */
    }
}
