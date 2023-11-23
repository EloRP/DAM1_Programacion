package condicionalesejercicios;

/* JuegoCuantoTiempo. Realiza un juego que solicite al usuario pulsar Enter después de trasncurrir
un número aleatorio de segundos, que se mostrará al usuario, elegido al azar entre un número mínimo,
por ejemplo 5, y un número máximo, por ejemplo 30. Los límites mínimo y
máximo de segundos se definirán como constantes.
El programa contará el tiempo que el usuario ha tardado en pulsar Enter y
responderá con un mensaje diciendo si acertó en el momento correcto o,
en caso contrario, cuántos segundos, de adelanto o de retraso, se desvió.
*/

import java.util.Scanner;
import java.time.LocalTime;

public class JuegoCuantoTiempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int MINIMO = 5;
        final int MAXIMO = 30;
        int segundosInicio, segundosFinal, segundosTardados, segundosRetraso;
        String comienzo;
        int tiempoAleatorio = (int) (Math.random() * (MAXIMO - MINIMO + 1)) + MINIMO;

        System.out.println(
                "Pulsa ENTER cuando creas que hayan pasado " + tiempoAleatorio
                        + " segundos. (Pulsa ENTER para empezar)");
        comienzo = sc.nextLine();

        segundosInicio = LocalTime.now().getSecond();
        System.out.println("Presiona ENTER cuando creas haya pasado el tiempo.");
        comienzo = sc.nextLine();
        segundosFinal = LocalTime.now().getSecond();

        if (segundosFinal < segundosInicio) {
            segundosFinal += 60;
        }

        segundosTardados = segundosFinal - segundosInicio;
        segundosRetraso = segundosTardados - tiempoAleatorio;

        sc.close();
        System.out.println("Han pasado: " + segundosTardados + ".");
        if (segundosTardados == tiempoAleatorio) {
            System.out.println(comienzo == "1" ? "Espera..." : "¡Felicidades! Has ganado.");
        } else if (segundosTardados > tiempoAleatorio) {
            System.out.println("Se acabó el tiempo! Te retrasaste: " + segundosRetraso + " segundos.");
        } else if (segundosTardados < tiempoAleatorio) {
            System.out.println("Se acabó el tiempo! Te faltaron: " + Math.abs(segundosRetraso) + " segundos.");
        }

    }
}
