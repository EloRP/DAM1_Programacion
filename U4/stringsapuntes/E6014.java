package stringsapuntes;

import java.util.Scanner;

public class E6014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraOculta = "desenvolvemento";

        String anagrama = desordenar(palabraOculta);

        System.out.println("Anagrama: " + anagrama);
        System.out.println("Adivina la palabra oculta: ");
        String palabraUsuario = sc.nextLine();

        while (!palabraUsuario.equals(palabraOculta)) {

            if (palabraUsuario.isEmpty()) {
                System.out.println("No se permite introducir cadenas vacías.");         //Failsafe por si el usuario pone una respuesta en blanco.
            }
            System.out.println("Prueba otra vez.");
            System.out.println("Adivina la palabra oculta: ");
            palabraUsuario = sc.nextLine();

        }

        System.out.println("Enhorabuena, has acertado.");
        sc.close();
    }

    public static String desordenar(String str) {
        char[] strAux = str.toCharArray();

        for (int i = 0; i < strAux.length; i++) {
            int pos = (int) (Math.random()*str.length());
            char ch = strAux[i];
            strAux[i] = strAux[pos];
            strAux[pos] = ch;
        }

        return String.valueOf(strAux);
    }
}
