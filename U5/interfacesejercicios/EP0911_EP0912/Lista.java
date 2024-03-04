package interfacesejercicios.EP0911_EP0912;

import java.util.Arrays;

public class Lista {
    private String[] elementos;

    public Lista() {
        elementos = new String[0];
    }

    /* Interfaz Pila */

    public void apilar(String e) {
        insertarFinal(e);
    }

    public String desapilar() {
        return eliminarEn(elementos.length - 1);
    }

    /* Métodos propios de Lista */

    public int length() {
        return elementos.length;
    }

    public void insertarFinal(String e) {
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
    }

    public void insertarInicio(String e) {
        String[] aux = new String[elementos.length + 1];
        System.arraycopy(elementos, 0, aux, 1, elementos.length);
        aux[0] = e;
        elementos = aux;
    }

    public void insertarEn(String e, int i) {
        String[] aux = Arrays.copyOf(elementos, elementos.length + 1);
        aux[i] = e;
        System.arraycopy(elementos, i, aux, i + 1, elementos.length - i);
        elementos = aux;
    }

    public void insertarFinal(Lista l) {
        elementos = Arrays.copyOf(elementos, elementos.length + l.length());
        System.arraycopy(l.elementos, 0, elementos, elementos.length - l.length(), l.length());
    }

    public String eliminarEn(int i) {
        String e = null;

        if (i >= 0 && i < elementos.length) {
            e = elementos[i];
            String[] aux = Arrays.copyOf(elementos, elementos.length - 1);
            System.arraycopy(elementos, i + 1, aux, i, elementos.length - i - 1);
            elementos = aux;
        }

        return e;
    }

    public String valorEn(int i) {
        return (i >= 0 && i < elementos.length) ? elementos[i] : null;
    }

    public int buscar(String e) {
        int i = 0;
        int pos = -1;
        while (i < elementos.length && pos == -1) {
            if (elementos[i] == e)
                pos = i;
            i++;
        }

        return pos;
    }

    public void mostrar() {
        System.out.println(Arrays.toString(elementos));
    }

    public static Lista concatena(Lista l1, Lista l2) {

        // 1. CopyOf + ArrayCopy return

        // 2. Usando insertarFinal

        Lista l = l1;

        l.insertarFinal(l2);

        return l;
    }
}