package stringsejercicios;

import java.util.Scanner;

public class EjCadenas05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase que quieras saber si es palíndroma.");
        String frase = sc.nextLine();
        sc.close();

        System.out.println(esPalindroma(frase));
    }

    public static Boolean esPalindroma(String str) {
        Boolean esPalindromo = true;

        int i = 0;
        str = str.replace(" ", "").toLowerCase();
        while (esPalindromo && i < str.length() / 2) {
            char ch1 = letraSinTilde(str.charAt(i));
            char ch2 = letraSinTilde(str.charAt(str.length() - 1 - i));
            if (!(ch1 == ch2))
                esPalindromo = false;
            i++;
        }

        return esPalindromo;
    }

    private static char letraSinTilde(char ch) {
        return switch (ch) {
            case 'á' -> 'a';
            case 'é' -> 'a';
            case 'í' -> 'a';
            case 'ó' -> 'a';
            case 'ú' -> 'a';
            case 'ü' -> 'a';
            case 'Á' -> 'a';
            case 'É' -> 'a';
            case 'Í' -> 'a';
            case 'Ó' -> 'a';
            case 'Ú' -> 'a';
            case 'Ü' -> 'a';
            default -> ch;
        };
    }
}
