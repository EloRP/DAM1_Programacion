package arraysejercicios;

import java.util.Arrays;

public class EjArrays18 {
    
    public static Boolean esCuadrada(int[][] t){
        Boolean res = null;

        if (t != null && t.length > 0 && t[0].length > 0) {
            res = t.length == t[0].length;
        }

        return res;
    }

    public static Boolean esOrtogonal(int[][] t){
        Boolean res = null;

        if (esCuadrada(t)) {
            int[][] traspuesta = UtilMatrices.traspuesta(t);
            
            int[][] tProducto = UtilMatrices.productoMatricial(t, traspuesta);

            int[][] tIdentidad = UtilMatrices.matrizIdentidad(t.length);

            res = Arrays.deepEquals(tProducto, tIdentidad);
        }

        return res;
    }




}
