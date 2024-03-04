package herenciaejercicios.EP0828;

public class Suceso extends herenciaejercicios.EP0825.Punto3D {

    int tiempo;
    String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descripcion) {
        super(x, y, z);
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        boolean sucesoIdentico = false;
        Suceso otroSuceso = (Suceso) obj;
        if (x == otroSuceso.x && y == otroSuceso.y && z == otroSuceso.z && tiempo == otroSuceso.tiempo
                && descripcion.equals(otroSuceso.descripcion)) {
            sucesoIdentico = true;
        }
        return sucesoIdentico;
    }

}
