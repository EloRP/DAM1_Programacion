package stringsparaninfo;

import java.util.Scanner;

public class EP0612 {
    /*
     * EP0612. Realiza el juego del ahorcado. Las reglas del juego son:
     * El jugador A teclea una palabra, sin que el jugador B la vea.
     * Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por
     * ejemplo, para “hola” será "_ _ _ _”
     * El jugador B intentará acertar, letra a letra, la palabra secreta.
     * Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán
     * ocultas como guiones. Siguiendo con el ejemplo anterior, y suponiendo que se
     * han introducido la 'o', la 'j' y la 'a', se mostrará:” _o_a”.
     * El jugador B solo tiene 7 intentos.
     * La partida terminará al acertar todas las letras que forman la palabra
     * secreta (gana el jugador B) o cuando se agoten todos los intentos (gana el
     * jugador A).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntentos = 7;
        char respuestaUsuarioB;
        String palabraGuionada = "";
        System.out.println("Escribe una palabra para que el jugador B la adivine.");
        String palabraUsuarioA = sc.nextLine();
        System.out.println("Adivina la palabra, jugador B. Tienes 7 intentos: ");
        palabraGuionada = convertirGuiones(palabraUsuarioA);
        System.out.println(palabraGuionada);
        System.out.println("\n");

        while (numeroIntentos > 0) {
            respuestaUsuarioB = sc.next().charAt(0);
            if (comprobarLetra(palabraUsuarioA, respuestaUsuarioB) == true) {
                palabraGuionada = sustitucionLetras(palabraUsuarioA, palabraGuionada, respuestaUsuarioB);
            } else {
                numeroIntentos--;
                System.out.println("Te quedan " + numeroIntentos + " intentos.");
            } if (numeroIntentos == 0) {
                System.out.println("Fin de la partida. La palabra era: " + palabraUsuarioA);
                break;
            } if (palabraGuionada.equals(palabraUsuarioA)) {
                System.out.println("Enhorabuena, has ganado");
                break;
            }
            System.out.println(palabraGuionada);
        }
        sc.close();
    }

    public static String convertirGuiones(String palabraUsuarioA) {
        String palabraGuionada = "";
        for (int i = palabraUsuarioA.length() - 1; i >= 0; i--) {
            palabraGuionada += "_ ";
        }
        return palabraGuionada;
    }

    public static String sustitucionLetras(String palabraUsuarioA, String palabraGuionada, char respuestaUsuarioB) {
        String palabraModificada = "";
        for (int i = 0; i < palabraUsuarioA.length(); i++) {
            if ((palabraUsuarioA.charAt(i) == respuestaUsuarioB)) {
                palabraModificada += respuestaUsuarioB;
            } else if ((palabraGuionada.charAt(i) != '_') || (palabraGuionada.charAt(i) != ' ')) {
                palabraModificada += palabraGuionada.charAt(i);
            } else {
                palabraModificada += "_ ";
            }
        }
        return palabraModificada;

    }

    public static boolean comprobarLetra(String palabraUsuarioA, char respuestaUsuarioB) {
        boolean letraContenida = false;
        for (int i = 0; i < palabraUsuarioA.length(); i++) {
            if (palabraUsuarioA.charAt(i) == respuestaUsuarioB) {
                letraContenida = true;
            }
        }
        return letraContenida;
    }
}

/*
 * while (!palabraUsuario.equals(palabraOculta)) {
 * 
 * if (palabraUsuario.isEmpty()) {
 * System.out.println("No se permite introducir cadenas vacías.");
 * } else {
 * System.out.println("Has acertado " + contarCoincidencias(palabraOculta,
 * palabraUsuario) + " letras.");
 * }
 * System.out.println("Prueba otra vez.");
 * 
 * System.out.println("Adivina la palabra oculta: ");
 * palabraUsuario = sc.nextLine();
 * 
 * }
 */