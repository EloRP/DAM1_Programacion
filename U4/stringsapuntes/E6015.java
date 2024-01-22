package stringsapuntes;

import java.util.Scanner;

public class E6015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraOculta = "desenvolvemento";

        String anagrama = desordenar(palabraOculta);

        System.out.println("Anagrama: " + anagrama);
        System.out.println("Adivina la palabra oculta: ");
        String palabraUsuario = sc.nextLine();

        while (!palabraUsuario.equals(palabraOculta)) {

            if (palabraUsuario.isEmpty()) {
                System.out.println("No se permite introducir cadenas vacías."); // Failsafe por si el usuario pone una
                                                                                // respuesta en blanco.
            } else {
                System.out.println("Has acertado " + contarCoincidencias(palabraOculta, palabraUsuario) + " letras.");
            }
            System.out.println("Prueba otra vez.");

            System.out.println("Adivina la palabra oculta: ");
            palabraUsuario = sc.nextLine();

        }

        System.out.println("Enhorabuena, has acertado.");
        sc.close();
    }

    public static int contarCoincidencias(String str1, String str2) {
        int contarCoincidencias = 0;

        try {
            for (int i = 0; i < str1.length(); i++)
                if (str1.charAt(i) == str2.charAt(i))
                    contarCoincidencias++;
        } catch (Exception e) {
            //Controla la excepción de que el segundo string sea más corto
        }
        return contarCoincidencias;
    }

    public static String desordenar(String str) {
        char[] strAux = str.toCharArray();

        for (int i = 0; i < strAux.length; i++) {
            int pos = (int) (Math.random() * str.length());
            char ch = strAux[i];
            strAux[i] = strAux[pos];
            strAux[pos] = ch;
        }

        return String.valueOf(strAux);
    }
}
