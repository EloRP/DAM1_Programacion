package stringsejercicios;

import java.util.Scanner;

public class EjCadenas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase que quieras invertir.");
        String frase = sc.nextLine();
        sc.close();

        System.out.println(invertirCadena(frase));
    }
    static String invertirCadena(String cad) {
        String cadInvertida = "";

        for (int i = cad.length() - 1; i >= 0; i--) {
            cadInvertida += cad.charAt(i);
        }

        return cadInvertida;
    }

}
