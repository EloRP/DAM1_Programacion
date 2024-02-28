

import java.util.Comparator;

public class comparadorFuerza implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Personaje) o1).fuerza - ((Personaje) o2).fuerza;
    }
};