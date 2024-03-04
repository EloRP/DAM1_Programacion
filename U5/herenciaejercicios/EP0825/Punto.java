package herenciaejercicios.EP0825;

public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Punto otroPunto) {
        double distancia = Math.sqrt(((otroPunto.x - x) * (otroPunto.x - x)) + ((otroPunto.y - y) * (otroPunto.y - y)));
        return distancia;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = false;
        Punto otroPunto = (Punto) obj;
        if (x == otroPunto.x && y == otroPunto.y) {
            sonIguales = true;
        }
        return sonIguales;
    }
}
