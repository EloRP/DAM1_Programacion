package herenciaejercicios.EP0825;

public class Punto3D extends Punto {
    public int x;
    public int y;
    public int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    double distancia(Punto3D otroPunto) {
        double distancia = Math.sqrt(((otroPunto.x - x) * (otroPunto.x - x)) + ((otroPunto.y - y) * (otroPunto.y - y))
                + ((otroPunto.z - z) * (otroPunto.z - z)));
        return distancia;

    }

    @Override
    public boolean equals(Object obj) {
        boolean sonIguales = false;
        Punto3D otroPunto = (Punto3D) obj;
        if (x == otroPunto.x && y == otroPunto.y && z == otroPunto.z) {
            sonIguales = true;
        }
        return sonIguales;
    }

}
