package practicas;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class RegistroTiempos {
    public static void main(String[] args) {
        int[] tiempos = new int[0];
        LocalTime horaInicio;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCronómetro.");
        System.out.println("--------------------------\n");

        System.out.println(
                "Contando el tiempo desde el inicio de la ejecución. "
                        + "Pulsa la tecla Enter para registrar un nuevo tiempo"
                        + "Introduce una \'f\' o una \'F\' para registrar el último tiempo: ");
        horaInicio = LocalTime.now();
        String entrada;
        // Lectura anticipada

        do {
            //LECTURA ENTRADA
            entrada = sc.nextLine();
            // PROCESAR ENTRADA
            LocalTime horaActual = LocalTime.now();
            int segundos = horaActual.toSecondOfDay() - horaInicio.toSecondOfDay();
            tiempos = Arrays.copyOf(tiempos, tiempos.length + 1);
            tiempos[tiempos.length - 1] = segundos;
        } while (entrada.isEmpty() || (entrada.charAt(0) != 'f' && entrada.charAt(0) != 'F'));

        System.out.println(Arrays.toString(tiempos));
        
    }
    
}
