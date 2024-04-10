package coleccionesejercicios.EP1225;

import java.util.Comparator;

public class ComparadorAntiguedad implements Comparator<Socio> {
    @Override public int compare(Socio o1, Socio o2) {
        return o1.fechaIngreso.compareTo(o2.fechaIngreso);
    }
}