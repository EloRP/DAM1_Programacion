package arraysejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EjArrays13 {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 3 } };
        System.out.println(esDiagonal(matriz));
    }

    public static boolean esDiagonal(int[][] t) {
        boolean esDiagonal = false;
        if (esMatrizValida(t) && esCuadrada(t)) {
            for (int i = 0; i < t.length; i++) {
                if (t[i][i] != 0) { // comprueba si diagonal != 0
                    esDiagonal = true;
                } else {
                    esDiagonal = false;
                    break;
                }
            }
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t[0].length; j++) {
                    if (i != j) {
                        if (t[i][j] == 0) { // comprueba si elementos que no están en la diagonal = 0
                            esDiagonal = true;
                        } else {
                            esDiagonal = false;
                            break;
                        }
                    }

                }
            }
        }
        return esDiagonal;
    }

    public static Boolean esMatrizValida(int[][] t) {
        return t != null && t.length > 0 && t[0].length > 0;
    }

    public static Boolean esCuadrada(int[][] t) {
        Boolean res = null;

        if (esMatrizValida(t)) {
            res = t.length == t[0].length;
        }

        return res;
    }

    @Test
    public void pruebaMatrizDiagonal() {
        int[][] matriz = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 3 } };
        assertTrue(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoDiagonal() {
        int[][] matriz = { { 1, 0, 0 }, { 0, 2, 0 }, { 0, 1, 3 } };
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoCuadrada() {
        int[][] matriz = { { 1, 0, 0 }, { 0, 2, 0 } };
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoCuadrada2() {
        int[][] matriz = { { 1, 0 }, { 0, 2 }, { 0, 0 } };
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizVacia() {
        int[][] matriz = {};
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNull() {
        int[][] matriz = null;
        assertFalse(esDiagonal(matriz));
    }
}