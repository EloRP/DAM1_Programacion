package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class E1208 {
    /*
     * E1208. Implementar un programa en el que se insertan 20 números aleatorios en
     * una colección. Ésta se ordenará de menor a mayor convirtiéndola antes en
     * table y volviéndola a convertir en colección. Repetir el proceso para
     * ordenarla de mayor a menor
     */
    public static void main(String[] args) {
        // Declara la colección
        Collection<Integer> numeros;

        // Crea la colección
        numeros = new ArrayList<>();

        // Añade 20 números aleatorios a la colección
        for (int i = 0; i < 20; i++) {
            numeros.add((int) (Math.random() * 100));
        }

        // Convierte la colección en un array
        Integer[] arrayNumeros = numeros.toArray(new Integer[0]);

        // Ordena el array
        Arrays.sort(arrayNumeros);

        // Imprime el array
        System.out.println(Arrays.toString(arrayNumeros));

        // Convierte el array de nuevo a una colección
        numeros = Arrays.asList(arrayNumeros);

        // Imprime la colección
        System.out.println(numeros);
    }

}
