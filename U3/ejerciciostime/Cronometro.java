package ejerciciostime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        System.out.println("Cronómetro. Pulsa Enter para empezar...");

        // Hora de inicio
        LocalDateTime horaInicio, horaActual, horaParcial = null;
        Scanner sc = new Scanner(System.in);

        // Leer entrada y registrar el tiempo de inicio
        String entrada = sc.nextLine();
        horaInicio = LocalDateTime.now();
        System.out.println(horaInicio);

        System.out.println("Cronómetro en marcha. "
                + "\n- Pulsa Enter para registrar un nuevo tiempo"
                + "\n- Introduce un cero '0' para terminar");

        // Leer nueva entrada
        entrada = sc.nextLine();
        horaActual = LocalDateTime.now();
        System.out.println("Hora actual: " + horaParcial);

        while (entrada.isEmpty() || entrada.charAt(0) != '0'); {
            // Calcular tiempo desde el inicio (horaInicio, horaActual)
            long segundos = horaInicio.until(horaActual, ChronoUnit.SECONDS);
            System.out.println("Segundos transcurridos: " + segundos);
            
            // Volver a leer
            entrada = sc.nextLine();
            horaActual = LocalDateTime.now();
            System.out.println(horaActual);
        }
        sc.close();
    }

}
