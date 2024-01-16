package stringsapuntes;

import java.util.Scanner;

/*
 * E0610. Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir,
 * que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios.
 * Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”
 */

public class E0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = " ";
        System.out.println("Introduce una frase para comprobar si es palíndroma.");
        frase = sc.nextLine();

        esPalindroma(frase);
        sc.close();

        System.out.println(eliminarTildes(frase));
    }

    static boolean esPalindroma(String frase) {
        String fraseInvertida = "";
        frase = eliminarEspaciosEnBlanco(frase);

        for (int i = frase.length() - 1; i >= 0; i--) {
            eliminarEspaciosEnBlanco(fraseInvertida);
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

    static String eliminarTildes(String frase) {
        String vocalesTilde = "áéíóúüÁÉÍÓÚÜ";
        String fraseSinTildes = "";
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (!vocalesTilde.contains(String.valueOf(ch)))
                fraseSinTildes += frase.charAt(i);
        }
        return fraseSinTildes;
    }

}

/*
 * static String quitarEspacios(String frase) {
 * // Utiliza una expresión regular para reemplazar todos los espacios en blanco
 * con una cadena vacía
 * return frase.replaceAll("\\s", "");
 * }
 */

