package coleccionesejercicios.EP1216;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio> {

    /*
     * @ author Eloy Rodal Pérez
     * E1211. Implementar la clase Socio, cuyos atributos son dni, nombre y
     * fechaAlta, que deberá incluir el método equals(), la interfaz Comparable
     * basada en el dni y el método antiguedad().
     */

    String dni;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni) && Objects.equals(nombre, socio.nombre) &&
                Objects.equals(fechaAlta, socio.fechaAlta);
    }

    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }

    public int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.DAYS); // Devuelve la diferencia en días entre la fecha de alta y la fecha actual
    }
}