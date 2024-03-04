package stringsejercicios;

import java.util.Scanner;

public class EjCadenas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase cuyo número de palabras desees contar.");
        String frase = sc.nextLine();
        sc.close();

        System.out.println("La frase tiene " + contadorPalabras(frase) + " palabras en total.");
    }

    public static int contadorPalabras (String frase) {
        String[] palabras = frase.split(" ");
        
        return palabras.length;
    }
}
