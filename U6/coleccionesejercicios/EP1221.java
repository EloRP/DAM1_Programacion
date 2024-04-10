package coleccionesejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EP1221 {
    /*
     * @author Eloy Rodal Pérez
     * EP1221. Implementa una aplicación donde se insertan 20 números enteros
     * aleatorios distintos, menores que 100, en una colección. Deberán guardarse
     * por orden decreciente a medida que se vayan generando, y se mostrará la
     * colección resultante por pantalla.
     */

    public static void main(String[] args) {

        System.out.println(generadorNumeros(20));

    }

    public static List<Integer> generadorNumeros(int numeros) {
        List<Integer> listaAleatorios = new ArrayList<>();

        for (int i = 0; i < numeros; i++) {
            int numero = (int) (Math.random() * 100);
            if (!listaAleatorios.contains(numero)) {
                listaAleatorios.add(numero);
            } else {
                i--;
            }
        }

        Collections.sort(listaAleatorios, Collections.reverseOrder());
        
        return listaAleatorios;

    }
}
