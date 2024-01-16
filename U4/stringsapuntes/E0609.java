package stringsapuntes;

import java.util.Scanner;

/* E0609. Introducir por teclado una frase, palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier combinación de mayúsculas y minúsculas.
La cadena “fin” no aparecerá en la frase final. */

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String palabra;

        System.out.println("Introduce una frase palabra a palabra. Escribe 'fin' para terminar.");
        palabra = sc.nextLine();
        frase += palabra;

        do {
            palabra = sc.nextLine();
            if (!palabra.equalsIgnoreCase("fin")) {
                frase += " " + palabra;
            }
        } while (!palabra.equalsIgnoreCase("fin"));
        sc.close();
        System.out.println("Frase final: " + frase);

    }
}
