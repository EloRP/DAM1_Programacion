package coleccionesejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class EP1222 {
    /*
     * @author Eloy Rodal Pérez
     * EP1222. Introduce por teclado, hasta que se introduzca “fin”, una serie de
     * nombres, que se insertarán en una colección, de forma que se conserve el
     * orden de inserción y que no puedan repetirse. Al final, la colección se
     * mostrará por pantalla.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> coleccion = new LinkedHashSet<>();

        System.out.println("Introduce nombres para añadir a la colección. Introduce 'fin' para terminar.");
        String nombre = sc.nextLine();

        while (!nombre.equals("fin")) {
            coleccion.add(nombre);
            nombre = sc.nextLine();
        }

        sc.close();
    
        System.out.println(coleccion);
    }

}
