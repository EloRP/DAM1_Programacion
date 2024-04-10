package coleccionesejercicios.EP1211_12_13_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EP1211 {

    /*
     * @author Eloy Rodal Pérez
     * Utilizando la clase Contenedor definida en la actividad E1202, implementa una
     * aplicación donde se guardan 30 enteros aleatorios entre 1 y 10 y luego
     * ordenan de menor a mayor. La aplicación debe mostrar el contenedor antes y
     * después de ordenar.
     * 
     * SE HA EMPLEADO UN CONTENEDOR IDÉNTICO AL DE LA CLASE CONTENEDOR
     */

    public static void main(String[] args) {
        Collection<Integer> colecNums = new ArrayList<>();

        while (colecNums.size() < 30) {
            colecNums.add((int) (Math.random() * 10) + 1);
        }

        System.out.println("Contenedor antes de ser ordenado:");
        System.out.println(colecNums);

        System.out.println("Colección tras ordenación:");
        List<Integer> list = new ArrayList<>(colecNums);
        Collections.sort(list);
        System.out.println(list);
    }
}
