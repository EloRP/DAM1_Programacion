package coleccionesejercicios.EP1225;

import java.util.Comparator;

public class ComparadorApodos implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.apodo.compareTo(o2.apodo);
    }
}