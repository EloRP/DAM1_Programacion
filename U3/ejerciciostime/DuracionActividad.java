package ejerciciostime;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;

/*
 * DuracionActividad.
Desarrolla una aplicación que calcule la duración total de una actividad. La actividad tiene una hora de inicio (LocalTime) y una hora de finalización (LocalTime). El programa debe mostrar la duración total en horas y minutos.
 */

import java.time.LocalTime;
import java.time.Duration;

public class DuracionActividad {
private LocalTime horaInicio;
private LocalTime horaFin;

public DuracionActividad(LocalTime horaInicio, LocalTime horaFin) {
this.horaInicio = horaInicio;
this.horaFin = horaFin;
}

public void calcularDuracion() {
Duration duracion = Duration.between(horaInicio, horaFin);
long horas = duracion.toHours();
long minutos = duracion.toMinutesPart();

System.out.println("Duración total: " + horas + " horas y " + minutos + " minutos.");
}

public static void main(String[] args) {
// Ejemplo de uso
LocalTime horaInicio = LocalTime.of(9, 30); // Hora de inicio
LocalTime horaFin = LocalTime.of(12, 45); // Hora de finalización

DuracionActividad actividad = new DuracionActividad(horaInicio, horaFin);
actividad.calcularDuracion();
}
}