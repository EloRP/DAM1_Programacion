package stringsparaninfo;

import java.util.Arrays;
import java.util.Scanner;

public class EP0620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la frase cuyas palabras quieras ordenar alfabéticamente.");
        String frase = sc.nextLine();

        String[] palabras = separacionPalabras(frase);
        Arrays.sort(palabras);

        System.out.println("Palabras ordenadas alfabéticamente: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        sc.close();
    }
    public static String[] separacionPalabras (String frase) {
        return frase.split(" ");
    }
}
