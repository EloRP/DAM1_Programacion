public class MatrizCuadradaExplicaciones {
    public static boolean esTriangular (int[][] t) {        //int[][] CREA UN ARRAY BIDIMENSIONAL. Se pueden hacer matrices con ellos
        Boolean esTriangular = false;
//t != null && t.length > 0 && t[0].length > 0 (Si es una matriz válida, o sea, si no es nula, si su longitud de filas (t.length) y columnas (t.length[0]) es mayor que 0)
//t.length == t[0].length (Si la matriz es cuadrada, o sea, si su longitud )
//t.length >= 2, si tiene 2 filas o más
        if (t != null && t.length > 0 && t[0].length > 0 && t.length == t[0].length && t.length >= 2) {
            boolean esTriangularSuperior = true;
            for (int i = 1; i < t.length; i++) {        //BUCLE PARA RECORRER EL ARRAY
                for (int j = 0; j < i; j++) {
                    if (t[i][j] != 0) {     //j se declara para recorrer las columnas. Si, por ejemplo, t[0][0] (columna 1 fila 1) != 0, no es triangular.
                        esTriangularSuperior = false;
                    }
                }
            }

            boolean esTriangularInferior = true;
            for (int i = 0; i < t.length - 1; i++)
                for (int j = i + 1; j < t.length; j++)
                    if (t[i][j] != 0)
                        esTriangularInferior = false;

            esTriangular = esTriangularInferior || esTriangularSuperior;    //escoge el verdadero de los dos resultados. no está implementado el método para determinar qué tipo de triangular es.
        }
        return esTriangular;
    }
}
