package stringsapuntes;

import java.util.Scanner;

/*
 * E0610. Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir,
 * que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios.
 * Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”
 */

public class E0610_MÍO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = " ";
        System.out.println("Introduce una frase para comprobar si es palíndroma.");
        frase = "Dábale arroz a la zorra el abad";

        esPalindroma(frase);
        sc.close();

    }

    static boolean esPalindroma(String frase) {
        String fraseInvertida = "";
        frase = eliminarEspaciosEnBlanco(frase);
        frase = eliminarTilde(frase);
        for (int i = frase.length() - 1; i >= 0; i--) {
            eliminarEspaciosEnBlanco(fraseInvertida);
            eliminarTilde(fraseInvertida);
            fraseInvertida += frase.charAt(i);
            if (fraseInvertida.equalsIgnoreCase(frase)) {
                System.out.println("La frase es palíndroma.");
                return true;
            }
        }
        System.out.println("La frase no es palíndroma.");
        return false;
    }

    static String eliminarEspaciosEnBlanco(String frase) {
        String fraseSinEspacios = "";

        for (int i = 0; i < frase.length(); i++) {
            if (!(frase.charAt(i) == ' ')) {
                fraseSinEspacios += frase.charAt(i);
            }
        }

        return fraseSinEspacios;
    }

    static String eliminarTilde(String frase) {
        String letrasConTilde = "ÁáÉéÍíÓóÚúü";
        String fraseSinTilde = "";

        for (int i = 0; i < frase.length(); i++) {
            if (letrasConTilde.contains(String.valueOf(frase.charAt(i)))) {
                switch (frase.charAt(i)) {
                    case 'á':
                        fraseSinTilde += 'A';
                        break;
                    case 'Á':
                        fraseSinTilde += 'a';
                        break;
                    case 'É':
                        fraseSinTilde += 'E';
                        break;
                    case 'é':
                        fraseSinTilde += 'e';
                        break;
                    case 'Í':
                        fraseSinTilde += 'I';
                        break;
                    case 'í':
                        fraseSinTilde += 'i';
                        break;
                    case 'Ó':
                        fraseSinTilde += 'O';
                        break;
                    case 'ó':
                        fraseSinTilde += 'o';
                        break;
                    case 'Ú':
                        fraseSinTilde += 'U';
                        break;
                    case 'ú':
                        fraseSinTilde += 'u';
                        break;
                    case 'ü':
                        fraseSinTilde += 'u';
                        break;

                }
            } else {
                fraseSinTilde += frase.charAt(i);
            }
        }
        return fraseSinTilde;
    }
}

/*
 * static String quitarEspacios(String frase) {
 * // Utiliza una expresión regular para reemplazar todos los espacios en blanco
 * con una cadena vacía
 * return frase.replaceAll("\\s", "");
 * }
 */

/*
 * private static char letraSinTilde(char ch) {
 * return switch (ch) {
 * case 'á' -> 'a';
 * case 'é' -> 'e';
 * case 'í' -> 'i';
 * case 'ó' -> 'o';
 * case 'ú' -> 'u';
 * case 'ü' -> 'u';
 * case 'Á' -> 'A';
 * case 'É' -> 'E';
 * case 'Í' -> 'I';
 * case 'Ó' -> 'O';
 * case 'Ú' -> 'U';
 * case 'Ü' -> 'U';
 * default -> ch;
 * };
 * }
 * }
 */