package interfacesejercicios.EP0913_EP0914;

import java.util.Comparator;

public class ComparadorEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;

        if (f1.edad == f2.edad) {
            return f2.nombre.compareTo(f1.nombre);
        } else {
            return f2.edad - f1.edad;       //si f2 va antes, es de mayor a menor y viceversa
        }

    }

}
