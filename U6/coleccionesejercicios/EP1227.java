package coleccionesejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EP1227 {

    /*
     * @author Eloy Rodal Pérez
     * EP1227. Implementa la función LeeCadena(), con el siguiente prototipo:
     * 
     * List<Character> leeCadena()
     * 
     * que lee una cadena por teclado y nos la devuelve en una lista con un carácter
     * en cada elemento.
     * 
     */

    public static void main(String[] args) {
        System.out.println(leeCadena());
    }

    public static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        sc.close();

        List<Character> listaCaracteres = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            listaCaracteres.add(cadena.charAt(i));
        }

        return listaCaracteres;
    }
}
