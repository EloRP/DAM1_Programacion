package arraysparaninfo;

import java.util.Arrays;

/*
     * EP0511. Realiza la función: int[] buscarTodos(int t[], int clave), que crea y
     * devuelve una tabla con todos los índices de los elementos donde se encuentra
     * la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t,
     * la función devolverá una tabla vacía.
     */
public class EP5011 {
public static void main(String[] args) {
    int[] arrayEjemplo = {1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8};
    int clave = 8;

    int indices[] = buscarTodos(arrayEjemplo, clave);

    if (indices.length == 0) {
        System.out.println("La clave no se encuentra en el array.");
    } else {
        System.out.println("La clave se encuentra en los siguientes índices: " + Arrays.toString(indices));
    }
}
static int[] buscarTodos(int t[], int clave) {
    int contadorClave = 0;
    for (int i = 0; i < t.length; i++) {
        if (t[i] == clave) {
            contadorClave++;
        }
    }
    System.out.println("Se ha encontrado la clave " + contadorClave + " veces");
    return t;
}
}
