package arraysapuntes;

import java.util.Arrays;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        //Leer y almacenar puntuación de 5 programadores
        Scanner sc = new Scanner (System.in);

        int[] puntuacionesPro = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la puntuación del programador " + (i+1));
            puntuacionesPro[i] = sc.nextInt();
        }
        //Mostrar puntuaciones ordenadas

        //Añadir puntuaciones de programadores de exhibición, hasta introducir -1
        while (true) {
            
        System.out.println("Introduce los valores de las puntuaciones de los programadores de exhibición: ");
        int puntuacionExhibicion = sc.nextInt();
        if (puntuacionExhibicion == -1) {
            break;
        } else {
            puntuacionesPro = Arrays.copyOf(puntuacionesPro, puntuacionExhibicion);
            puntuacionesPro[puntuacionesPro.length - 1] = puntuacionExhibicion;
        }
        }
        //Mostrar todos ordenados
    }

    static void insertarOrdenado(int[] t, int valor) {
        if (t == null) {
            t = new int[1];
            t[0] = valor;
        } else {
            int[] copia = new int[t.length + 1];
            int indiceInsercion = Arrays.binarySearch(t, valor);
            if (indiceInsercion < 0) {
                indiceInsercion = -indiceInsercion - 1;
            }
            System.arraycopy(t, 0, copia, 0, indiceInsercion);
            copia[indiceInsercion] = valor;
            System.arraycopy(t, indiceInsercion, copia, indiceInsercion + 1, t.length - indiceInsercion);
            t = copia;
        }

    }
}
