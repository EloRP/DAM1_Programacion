package coleccionesejercicios.EP1211_12_13_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EP1213 {

    /*
     * @author Eloy Rodal Pérez
     * EP1213. Repite la Actividad EP1211 ordenando los números de mayor a menor.
     */

    public static void main(String[] args) {
        Collection<Integer> colecNums = new ArrayList<>();

        while (colecNums.size() < 30) {
            colecNums.add((int) (Math.random() * 10) + 1);
        }

        System.out.println("Contenedor antes de ser ordenado:");
        System.out.println(colecNums);

        System.out.println("\nColección tras ordenación:");
        List<Integer> list = new ArrayList<>(colecNums);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\nColección tras ordenación de mayor a menor");
        Collections.reverse(list);
        System.out.println(list);
    }
}
