package arraysejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EjArrays17 {
    public static void main(String[] args) {
        int[][] matrizSimetrica = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
        System.out.println(esSimetrica(matrizSimetrica));
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

    public static Boolean esSimetrica(int[][] t) {
        boolean esSimetrica = false;
        int[][] tr = null;

        if (esMatrizValida(t) && esCuadrada(t)) {
            tr = new int[t[0].length][t.length];

            for (int i = 0; i < tr.length; i++) {
                for (int j = 0; j < tr[0].length; j++) {
                    tr[i][j] = t[j][i];
                }
                esSimetrica = Arrays.deepEquals(t, tr);
            }
        }
        return esSimetrica;
    }

    @Test
    public void testEsSimetricaConMatrizSimetrica() {
        int[][] matrizSimetrica = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
        assertTrue(EjArrays17.esSimetrica(matrizSimetrica));
    }

    @Test
    public void testEsSimetricaConMatrizNoSimetrica() {
        int[][] matrizNoSimetrica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        assertFalse(EjArrays17.esSimetrica(matrizNoSimetrica));
    }

}

/*
 * public static int[][] traspuesta(int[][] t) {
 * int[][] tr = null;
 * 
 * if (esMatrizValida(t)) {
 * tr = new int[t[0].length][t.length];
 * 
 * for (int i = 0; i < tr.length; i++) {
 * for (int j = 0; j < tr[0].length; j++) {
 * tr[i][j] = t[j][i];
 * }
 * }
 * 
 * }
 * 
 * return tr;
 * }
 */