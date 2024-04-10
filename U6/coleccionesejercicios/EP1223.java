package coleccionesejercicios;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EP1223 {

    /*
     * @author Eloy Rodal Pérez
     * EP1223. Repite la Actividad EP1222 de forma que se inserten los nombres
     * manteniendo el orden alfabético.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> coleccion = new TreeSet<>();

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
