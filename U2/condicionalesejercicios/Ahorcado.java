package condicionalesejercicios;

/*
 * Ahorcado. Haz un programa que lea por teclado un número de fallos en el juego del ahorcado,
 * entre 0 y 7, y que imprima un dibujo de un ahorcado más
 * o menos completo en función del número de fallos, como los de los siguientes ejemplos:
 *
 * (ejemplos)
 *Completa también los dibujos para 2, 4 y 5 fallos.
 *Fíjate en las partes comunes de los distintos muñecos e intenta repetir el mínimo código posible.
 */
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fallos;
        String dibujo = "";

        System.out.println("Introduce el número de fallos:");
        fallos = sc.nextInt();

        switch (fallos) {
            case 0:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 1:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 2:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "   |   |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 3:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "  /|   |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 4:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "  /|\\  |\n" +
                        "       |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 5:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "  /|\\  |\n" +
                        "   |   |\n" +
                        "       |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 6:
                dibujo = "    ___\n" +
                        "   |   |\n" +
                        "   O   |\n" +
                        "  /|\\  |\n" +
                        "   |   |\n" +
                        "  /    |\n" +
                        "       |\n" +
                        " ______|";
                break;
            case 7:
                dibujo = "   ___ \n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "  |   |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "______|";
                break;
            default:
            System.out.println("No has escrito un número de fallos soportado por el programa o un número negativo.");
        }
        System.out.println(dibujo);
        sc.close();
    }
}