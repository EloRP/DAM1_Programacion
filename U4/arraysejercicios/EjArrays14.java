package arraysejercicios;

public class EjArrays14 {
    


    public static Boolean esMatriz(int [][] t){
        return t != null && t.length > 0 && t[0].length > 0;
    }

    public static int[][] traspuesta(int [][] t){
        int[][] tr = null;

        if (esMatriz(t)) {
            tr = new int[t[0].length][t.length];

            for(int i = 0; i < tr.length; i++){
                for(int j = 0; j < tr[0].length; j++){
                    tr[i][j] = t[j][i];
                }
            }

        }

        return tr;
    }
}
