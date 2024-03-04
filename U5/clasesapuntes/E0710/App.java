package E0710;

import E0710.maquinaria.Locomotora;
import E0710.maquinaria.Tren;
import E0710.personal.Maquinista;
import E0710.personal.Mecanico;
import E0710.personal.Mecanico.Especialidad;

public class App {

    public static void main(String[] args) {
        Mecanico m = new Mecanico("Marta Pérez", null, Especialidad.MOTOR);
        Locomotora l = new Locomotora(null, 0, 2000, m);

        Maquinista ma = new Maquinista("Pepe López", null, 2000, null);

        Tren t = new Tren(l, ma);

        t.anhadirVagon(3000, 2500, "Madera");
        t.anhadirVagon(4000, 3000, "Hierro");
        t.anhadirVagon(5000, 3500, "Pasajeros");

        System.out.println(t);

    }

}
