package clasesejercicios.EP0721;

import java.util.Arrays;

public class Conjunto {
    Integer[] conjunto;

    public Conjunto() { // Constructor sin parámetros
        conjunto = new Integer[0];

    }

    int numeroElementos() {
        return conjunto.length;
    }

    boolean insertar(Integer nuevo) {
        boolean esInsertable = true;
        Integer[] aux = Arrays.copyOf(conjunto, conjunto.length + 1);
        for (int i = 0; i < aux.length; i++) {
            if (nuevo == aux[i]) {
                System.out.println("El número ya se encuentra en el conjunto.");
                esInsertable = false;
            }
        }
        if (esInsertable = true) {
            aux[aux.length - 1] = nuevo;
            conjunto = aux;
        }
        return esInsertable;
    }

    boolean insertar(Conjunto otroConjunto) {
        boolean esInsertable = true;
        Integer[] aux = Arrays.copyOf(conjunto, conjunto.length + otroConjunto.conjunto.length);
        for (int i = 0; i < otroConjunto.conjunto.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if (otroConjunto.conjunto[i] == aux[j]) {
                    System.out.println("Error. Hay un elemento de la segunda tabla idéntico al de la primera.");
                    esInsertable = false;
                    break;
                }
            }
        }
        if (esInsertable = true) {
            System.arraycopy(otroConjunto.conjunto, 0, aux, aux.length - otroConjunto.conjunto.length,
                    otroConjunto.conjunto.length);
            conjunto = aux;
        } else if (esInsertable = false) {
            
        }
        return esInsertable;
    }

    boolean eliminar(Integer elemento) {
        boolean esEliminable = false;
        int e = 0;
        Integer[] aux = Arrays.copyOf(conjunto, conjunto.length - 1);
        for (int i = 0; i < aux.length; i++) {
            if (elemento == aux[i]) {
                e = i;
                esEliminable= true;
            }
        }
        if (esEliminable = true) {
            System.arraycopy(conjunto, e + 1, aux, e,
            conjunto.length - e - 1);
            conjunto = aux;
        }

        return esEliminable;
            }

    public void mostrar() { // Mostrar elementos por consola
        System.out.println(Arrays.toString(conjunto));
    }

    @Override
    public boolean equals(Object obj) {
        boolean conjuntosIguales = false;
        Conjunto c2 = (Conjunto) obj;

        return true;
    }

    public static void main(String[] args) {
        Conjunto c = new Conjunto();

        c.insertar(2);
        c.insertar(4);
        c.insertar(5);
        c.insertar(2);
        c.eliminar(5);
        c.mostrar();

        Conjunto c2 = new Conjunto();
        c2.insertar(3);
        c2.insertar(9);
        c2.insertar(7);
        c2.insertar(0);
        c2.mostrar();

        c.insertar(c2);
        c.mostrar();

    }

}
/*
 * Lista lR = new Lista();
 * Integer[] aux = Arrays.copyOf(l1.elementos, l1.length());
 * System.arraycopy( l2.elementos, 0, aux, aux.length - l2.length(),
 * l2.length());
 */