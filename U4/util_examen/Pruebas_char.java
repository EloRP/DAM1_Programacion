package util_examen;

import java.util.Arrays;

public class Pruebas_char {
    public static void main(String[] args) {
        String cadena = "Java";
        char[] charArray = cadena.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println("\n");

        String texto = "Programación en Java";
        System.out.println(texto.substring(5, 12).toUpperCase());
        System.out.println("\n");

        String[] array = { "Java", "es", "poderoso" };
        String result = "";

        for (String str : array) {
            result += str.substring(0, 1);
        }
        System.out.println(result);
        System.out.println("\n");

        String str = "Programación";
        int length = str.length();
        String resultat = "";

        for (int i = length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
            resultat += str.charAt(i);
        }
    }
        System.out.println(resultat);

        String[] nicks = {"binary", "sedicialvole", "carabel"};
        System.out.println(Arrays.toString(nicks));
    }
}
