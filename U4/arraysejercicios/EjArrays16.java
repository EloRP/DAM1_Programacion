package arraysejercicios;

public class EjArrays16 {

    public static int[][] multiplicar(int t1[][], int t2[][]) {
        int[][] tr = null;

        if (t1 != null && t2 != null && t1[0] != null && t2[0] != null && t1[0].length == t2.length) {
            tr = new int[t1.length][t2[0].length];

            for (int i = 0; i < tr.length; i++) {
                for (int j = 0; j < tr[i].length; j++) {

                    // Asignar valor a la casilla
                    tr[i][j] = 0;
                    for (int r = 0; r < t2.length; r++) {
                        // SUMATORIO DE PRODUCTOS
                        tr[i][j] += t1[i][r] * t2[r][j];
                    }
                }
            }
        }

        return tr;
    }
}
