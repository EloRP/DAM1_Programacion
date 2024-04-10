package coleccionesejercicios.EP1225;

import java.time.LocalDate;

public class Socio implements Comparable<Socio> {
    String apodo;
    String nombre;
    LocalDate fechaIngreso;

    public Socio(String apodo, String nombre, LocalDate fechaIngreso) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int compareTo(Socio o) {
        return apodo.compareTo(o.apodo);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "apodo='" + apodo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
