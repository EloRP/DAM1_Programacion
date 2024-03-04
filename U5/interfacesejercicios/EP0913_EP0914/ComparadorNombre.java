package interfacesejercicios.EP0913_EP0914;

import java.util.Comparator;

public class ComparadorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        return f1.nombre.compareTo(f2.nombre);
}
}