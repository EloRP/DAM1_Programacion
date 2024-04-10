package coleccionesejercicios.EP1235;

import java.time.Duration;
import java.time.LocalDateTime;

public class Jornada implements Comparable {
    /*
     * EP0928b. Implementar la clase Jornada, cuyos objetos son los datos de cada
     * día de trabajo de los empleados de una empresa. En ella se identificará al
     * trabajador por su DNI y figurarán la fecha y las horas de entrada y salida
     * del trabajo de cada jornada. Un método computará el número de minutos
     * trabajados en la jornada. El criterio de orden natural de las jornadas será
     * el de los DNI, y para igual DNI, el de la fecha de la jornada, con objeto de
     * que aparezcan consecutivas todas las jornadas de cada trabajador. Asimismo
     * implementar el método toString() que muestre el DNI del empleado, la fecha y
     * la duración en minutos de las jornadas.
     */
    String dni;
    LocalDateTime horaEntrada;
    LocalDateTime horaSalida;

    public Jornada(String dni, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.dni = dni;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int minutosTrabajados() {
        return (int) Duration.between(horaEntrada, horaSalida).toMinutes();
    }

    @Override
    public int compareTo(Object o) {
        Jornada j2 = (Jornada) o;

        int res = this.dni.compareTo(j2.dni);

        if (res == 0) {
            res = this.horaEntrada.compareTo(j2.horaEntrada);
        }

        return res;
    }

    @Override
    public String toString() {
        return "Jornada{" +
                "dni='" + dni + '\'' +
                ", duración=" + this.minutosTrabajados();
    }

    public static void main(String[] args) {
        Jornada j = new Jornada("123454B", LocalDateTime.now(), LocalDateTime.of(2024, 2, 25, 19, 0));
        System.out.println(j.minutosTrabajados());
    }
}