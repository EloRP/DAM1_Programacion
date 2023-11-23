package ejerciciostime;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;

/*
 * DuracionActividad.
Desarrolla una aplicación que calcule la duración total de una actividad. La actividad tiene una hora de inicio (LocalTime) y una hora de finalización (LocalTime). El programa debe mostrar la duración total en horas y minutos.
 */

public class DuracionActividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Hora de inicio
        System.out.println("Introduce la hora de inicio");
        String horaInicioString = sc.next();
        LocalTime horaInicio = LocalTime.parse(horaInicioString);

        //Hora finalización
        System.out.println("Introduce la hora de finalización");
        String horaFinString = sc.next();
        LocalTime horaFin = LocalTime.parse(horaFinString);

        //Cálculo de la duración
        
    }
    }
