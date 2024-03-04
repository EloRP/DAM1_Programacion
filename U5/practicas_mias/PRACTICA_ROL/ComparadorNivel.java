import java.util.Comparator;

public class ComparadorNivel implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Personaje p1 = (Personaje) o1;
        Personaje p2 = (Personaje) o2;

        if (p2.nivel == p1.nivel) {
            return p2.experiencia - p1.experiencia;
        } else {
            return p2.nivel - p1.nivel;
        }
    }

}
/*
 * import java.util.Comparator;
 * 
 * public class ComparadorPV implements Comparator {
 * 
 * @Override
 * public int compare(Object o1, Object o2) {
 * Personaje p1 = (Personaje) o1;
 * Personaje p2 = (Personaje) o2;
 * return p2.puntosVidaMax - p1.puntosVidaMax;
 * }
 */