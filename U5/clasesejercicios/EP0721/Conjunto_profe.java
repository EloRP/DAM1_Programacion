package clasesejercicios.EP0721;

import java.util.Arrays;

public class Conjunto_profe {
    private Integer[] conjunto;

    public Conjunto_profe() { // Constructor sin parámetros
        conjunto = new Integer[0];
    }

    int numeroElementos() {
        return conjunto.length;
    }

    boolean insertar(Integer nuevo) {
        boolean insertar = true;
        for (int i = 0; i < conjunto.length && insertar; i++) {
            if (conjunto[i] == nuevo)
                insertar = false;
        }

        if (insertar) {
            conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
            conjunto[conjunto.length - 1] = nuevo;
        }

        return insertar;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean insertar = false;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
            if (insertar(otroConjunto.conjunto[i]))
                insertar = true;
        }

        return insertar;
    }

    boolean eliminarElemento(Integer elemento) {
        boolean eliminarElemento = false;

        int i = 0;
        while (i < conjunto.length && !eliminarElemento) {
            if (conjunto[i] == elemento) {
                System.arraycopy(conjunto, i + 1, conjunto, i, conjunto.length - 1);
                conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
                eliminarElemento = true;
            }
        }
        return eliminarElemento;
    }

    boolean eliminarConjuntoProfe(Conjunto_profe otroConjunto) {
        boolean eliminar = false;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++)
            if (eliminarElemento(otroConjunto.conjunto[i]))
                eliminar = true;

        return eliminar;
    }

    boolean pertenece(Integer elemento) {
        boolean pertenece = false;

        int i = 0;
        while (i < conjunto.length && !pertenece) {
            if (conjunto[i] == elemento)
                pertenece = true;
            i++;
        }

        return pertenece;
    }

    public static void main(String[] args) {
        Conjunto_profe c = new Conjunto_profe();

        System.out.println(c.insertar(7));
        System.out.println(c.insertar(6));
        System.out.println(c.insertar(7));

        System.out.println(c.eliminarElemento(5));
        System.out.println(c.eliminarElemento(6));
        System.out.println(c.eliminarElemento(6));
        System.out.println(c.eliminarElemento(7));

        Conjunto_profe b = new Conjunto_profe();

        System.out.println(b.insertar(4));
        System.out.println(b.insertar(2));
        System.out.println(b.insertar(3));

        System.out.println(c.eliminarConjuntoProfe(b));

        System.out.println(c.pertenece(7));
        System.out.println(c.pertenece(4));
    }
}
