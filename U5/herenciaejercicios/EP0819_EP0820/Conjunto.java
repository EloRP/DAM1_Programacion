package herenciaejercicios.EP0819_EP0820;

import java.util.Arrays;

public class Conjunto extends herenciaejercicios.EP0814_EP0815.Lista {

    boolean insertar(Integer nuevo) {
        boolean insertar = true;
        for (int i = 0; i < elementos.length && insertar; i++) {
            if (elementos[i] == nuevo)
                insertar = false;
        }

        if (insertar) {
            elementos = Arrays.copyOf(elementos, elementos.length + 1);
            elementos[elementos.length - 1] = nuevo;
        }

        return insertar;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean insertar = false;

        for (int i = 0; i < otroConjunto.elementos.length; i++) {
            if (insertar(otroConjunto.elementos[i]))
                insertar = true;
        }
        return insertar;
    }

    boolean eliminarElemento(Integer elemento) {
        boolean eliminarElemento = false;

        int i = 0;
        while (i < elemento && !eliminarElemento) {
            if (elementos[i] == elemento) {
                System.arraycopy(elemento, i + 1, elemento, i, elementos.length - 1);
                elementos = Arrays.copyOf(elementos, elementos.length - 1);
                eliminarElemento = true;
            }
        }
        return eliminarElemento;
    }

    boolean eliminarConjunto(Conjunto otroConjunto) {
        boolean eliminar = false;

        for (int i = 0; i < otroConjunto.elementos.length; i++)
            if (eliminarElemento(otroConjunto.elementos[i]))
                eliminar = true;

        return eliminar;
    }

    boolean pertenece(Integer elemento) {
        boolean pertenece = false;

        int i = 0;
        while (i < elementos.length && !pertenece) {
            if (elementos[i] == elemento)
                pertenece = true;
            i++;
        }

        return pertenece;
    }

}
