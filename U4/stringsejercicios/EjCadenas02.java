package stringsejercicios;

import java.util.Scanner;

public class EjCadenas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase cuya última palabra desees eliminar.");
        String frase = sc.nextLine();
        sc.close();

        System.out.println(eliminadorPalabras(frase));
    }

    public static String eliminadorPalabras(String frase) {
        String[] palabras = frase.split(" ");

        String[] fraseModificada = new String[palabras.length - 1];
        System.arraycopy(palabras, 0, fraseModificada, 0, palabras.length - 1);

        String fraseFinal = String.join(" ", fraseModificada);

        return fraseFinal;
    }
}
