package examenud04;

import java.util.Arrays;
import java.util.Scanner;

public class CarreraPopular {
    public static void main(String[] args) {
        String[] datosParticipantes = new String[0];
        System.out.println("Registro de carrera.");
        lecturaParticipantes();
        System.out.println("Lista de participantes: " + datosParticipantes.toString());
        System.out.println("Hay "  + "en total. Hay " + participantesHermanos(datosParticipantes)
                + "participantes hermanos.");
    }

    public static int participantesHermanos(String[] participantes) {
        int participantesHermanos = 0;
        
        return participantesHermanos;
    }

    public static String[] lecturaParticipantes() {
        String[] participantes = new String[0];
        Scanner sc = new Scanner(System.in);
        String inputDatos = " ";
        int contadorParticipantes = 0;
        while (!inputDatos.equals("===")) {
            contadorParticipantes++;
            System.out.println("Participante " + contadorParticipantes + " (Apellidos, Nombre): ");
            inputDatos = sc.nextLine();
            inputDatos += participantes;
        }
        sc.close();
        Arrays.sort(participantes);
        return participantes;
    }
}