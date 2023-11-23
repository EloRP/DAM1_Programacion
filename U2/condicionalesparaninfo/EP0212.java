package condicionalesparaninfo;

/* EP0212. EI DNI consta de un entero de 8 digitos seguido de una letra que se obtiene a partir
del número de la siguiente forma:

letra = número DNI módulo 23

Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:

(tabla de valores)

y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde. Observa que un número de 8 digitos está dentro del rango del tipo int.
*/

import java.util.Scanner;

public class EP0212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la serie de números de tu DNI.");
        int numeroDNI = scanner.nextInt();
        char letraDNI = calcularLetraDNI(numeroDNI);
        scanner.close();
        System.out.println("Tu letra del DNI es: " + letraDNI);
    }
    public static char calcularLetraDNI(int numeroDNI) {
        int indice = numeroDNI % 23;
        char letra;

        switch (indice) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                letra = ' ';
        }
        return letra;
    }
}
