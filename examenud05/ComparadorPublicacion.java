package examenud05;

import java.util.Comparator;

public class ComparadorPublicacion implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        Objeto f1 = (Objeto) o1;
        Objeto f2 = (Objeto) o2;
        return f1.fechaHoraPublicacion.compareTo(f2.fechaHoraPublicacion);
    }
}
