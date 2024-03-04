package arraysejercicios;
/* SIN TERMINAR */
public class CuadradosDiabolicos {
    
    private static Boolean esCuadradoEsoterico(int[][] t) {
        Boolean esEsoterico = true;

        if (esCuadradoEsoterico(t)) {
            int n = t.length;
            boolean[] numeros = new boolean[n * n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (numeros[t[i][j]])
                    esEsoterico = false;
                else
                numeros[t[i][j]] = true;
        } else {
            esEsoterico = false;
        }

        return esEsoterico;
    }

    private static Boolean esCuadradoDiabolico(int[][] t) {
        Boolean esDiabolico = true;
        if (UtilMatrices.esCuadrada(t) ) {
            int n = t.length;
            int cm = 0;
            //Recorrer filas
            for(int i = 0; i < n; i ++) {
                int suma = 0;
                for (int j = 0; j < n; j++)
                suma += t[i][j];
            if (cm == 0) {
                cm = suma;
            } else if (suma != cm) {
                esDiabolico = false;
            }
            
            
            }
        }
    }
}

