package stringsejercicios;

import java.util.Scanner;

public class EjCadenas06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la frase cuyas palabras quieras separar.");
        String frase = sc.nextLine();
    
        String[] palabras = separacionPalabras(frase);
    
        System.out.println("Palabras ordenadas alfabéticamente: ");
        if (palabras.length > 0) {
            System.out.print(palabras[0] + "\n");
    
            for (int i = 1; i < palabras.length; i++) {
                System.out.println("\t" + palabras[i]);
            }
        }
        sc.close();
    }
    
    public static String[] separacionPalabras(String frase) {
        return frase.split(" ");
    }
}


/*
 * public static void main(String[] args) {
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
 */