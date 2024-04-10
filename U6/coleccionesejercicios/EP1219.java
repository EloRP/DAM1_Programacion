package coleccionesejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EP1219 {
    /*
     * @author Eloy Rodal Pérez
     * EP1219. Escribe un programa donde se introduzca por consola una frase que
     * conste exclusivamente de palabras separadas por espacios. Las palabras de la
     * frase se almacenarán en una lista. Finalmente, se mostrarán por pantalla las
     * palabras que estén repetidas y, a continuación, las que no lo estén.
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase con palabras separadas por espacios: ");
        String frase = sc.nextLine();
        sc.close();

        System.out.println(fraseALista(frase));

        System.out.println("\nPalabras repetidas:");
        System.out.println(mostrarRepetidas(fraseALista(frase)));

        System.out.println("\nPalabras sin repetir:");
        System.out.println(fraseSinRepeticiones(fraseALista(frase)));
    }

    public static List<String> fraseALista (String frase) {
        List<String> palabrasFrase = new ArrayList<>();
        String[] palabras = frase.split(" ");   //Se separan las palabras de la frase por los espacios mediante split que crea un array de palabras.
        for (String palabra : palabras) {   //Después se hace un for each para cada una de las palabras del array y se añaden a la lista.
            palabrasFrase.add(palabra);
        }
        return palabrasFrase;
    }

    public static List<String> mostrarRepetidas(List<String> listaFrase) {
        List<String> listaConRepetidas = new ArrayList<>();
        for (int i = 0; i < listaFrase.size(); i++) {
            for (int j = i + 1; j < listaFrase.size(); j++) { 
                if (listaFrase.get(i).equals(listaFrase.get(j))) {      //Se usan dos bucles para comparar la palabra actual (i) con la siguiente (j)
                    listaConRepetidas.add(listaFrase.get(i));
                }
            }
        }
        return listaConRepetidas;
    }

    public static Set<String> fraseSinRepeticiones(List<String> listaFrase) {
        Set<String> unicas = new HashSet<>();
        Set<String> repetidas = new HashSet<>();
        for (String palabra : listaFrase) {     //Se recorre la lista de palabras y se añaden a un conjunto. Si la palabra ya está en el conjunto de palabras únicas, se añade al conjunto de repetidas.
            if (!unicas.add(palabra)) {
                repetidas.add(palabra);
            }
        }
        unicas.removeAll(repetidas);
        return unicas;
    }
}
