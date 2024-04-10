package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class E1205 {
    /*
     * Implementar una aplicación en la que se insertan en una colección 100 números
     * enteros aleatorios entre 1 y 10 (incluídos), que pueden estar repetidos. A
     * continuación, se crea una lista con los mismos elementos sin repeticiones.
     */
    public static void main(String[] args) {
        Collection<Integer> colecNums = new ArrayList<>();

        while (colecNums.size() != 100) {
            colecNums.add((int) (Math.random() * 10) + 1);
        }

        System.out.println(colecNums);

        List<Integer> listaSinDupes;
        listaSinDupes = new ArrayList<>();

        System.out.println("Lista sin repetidos: ");
        Iterator<Integer> it = colecNums.iterator();
        it = colecNums.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            if (!listaSinDupes.contains(num))
                listaSinDupes.add(num);
        }

        System.out.println(listaSinDupes);

    }
}
