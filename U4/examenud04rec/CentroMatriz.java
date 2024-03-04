//ELOY RODAL PÉREZ

package examenud04rec;

public class CentroMatriz {

    int centroMatriz(int[][] t) {
        int valorPosicionCentral = 0;
        if (t == null || t.length == 0 || t[0].length == 0) {  //if para descartar matrices inválidas.
            return 0;
        } else if (t.length % 2 == 0 && t[0].length % 2 != 0) { // Número de filas par y número de columnas impar.

        } else if (t.length % 2 != 0 && t[0].length % 2 == 0) { // Número de filas impar y número de columans par.

        } else if (t.length % 2 == 0 && t[0].length % 2 == 0) { // Número de filas par y número de columnas par.
            
        }
        return valorPosicionCentral;
    //TODO: AVERIGUAR CÓMO ALCANZAR CENTRO
    }
}
/* CASO 1: FILAS PARES Y COLUMNAS IMPARES
 * 6    6   6
 * 6    6   6   //MEDIA DE ESTE
 * 6    6   6   // Y ESTE
 * 6    6   6
 */

/* CASO 2: FILAS IMPARES Y COLUMNAS PARES
 * 6    6   6   6
 * 6    6   6   6
 * 6    6   6   6
    MEDIA  MEDIA
 */

/* CASO 3: FILAS PARES Y COLUMNAS PARES
 * 6    6   6   6
 * 6    6   6   6
 * 6    6   6   6       //los cuatro de en medio
 * 6    6   6   6
 */