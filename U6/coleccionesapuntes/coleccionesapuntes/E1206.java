package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class E1206 {
    /*
     * Implementar una aplicación donde se insertan 100 números enteros aleatorios
     * entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección.
     * Después se eliminan todos los elementos que valen 5. Mostrar la colección
     * antes y después de la eliminación.
     */

    public static void main(String[] args) {
        Collection<Integer> colecNums = new ArrayList<>();

        while (colecNums.size() < 100) {
            colecNums.add((int) (Math.random() * 10) + 1);
        }

        System.out.println(colecNums);

        System.out.println("Colección sin 5: ");
        Iterator<Integer> it = colecNums.iterator();
        it = colecNums.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            if (num == 5)
                it.remove();
        }
        System.out.println(colecNums);
    }
}
