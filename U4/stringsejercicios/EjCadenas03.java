package stringsejercicios;

import java.util.Scanner;

public class EjCadenas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto.");
        String texto = sc.nextLine();

        System.out.println("Introduce un caracter cuyas iteraciones desees conocer.");
        char caracter =  sc.next().charAt(0);;

        System.out.println("La frase que has introducido contiene el caracter " + "'" +caracter + "'" + " " + contadorCaracteres(texto, caracter) + " veces");
        sc.close();
    }

    public static int contadorCaracteres(String frase, char caracter) {
        String[] palabras = frase.split(" ");
        int contadorCaracter = 0;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                if (Character.toLowerCase(palabras[i].charAt(j)) == caracter) {
                    contadorCaracter++;
                }
            }
        }
        return contadorCaracter;
    }
}
