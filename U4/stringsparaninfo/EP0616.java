package stringsparaninfo;
// NO SE MENCIONA SI ES CASE SENSITIVE ASÍ QUE LO HE PUESTO EN MINÚSCULA

import java.util.Scanner;

public class EP0616 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase cuyos caracteres quieras convertir.");
        System.out.println("(los caracteres convertibles son a, e, i, s.)\n");
        String input = sc.nextLine();
        sc.close();
        System.out.println(sustitucionFrase(input));
    }

    public static String sustitucionFrase(String input) {
        String inputModificado = "";

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
            char caracterSustituido = sustitucionLetra(caracter, inputModificado);
            inputModificado += caracterSustituido;
        }
        return inputModificado.toString();
    }

    public static char sustitucionLetra(char caracter, String sustitucion) {
        String caracteresSustitucion = "@€1$";
        switch (Character.toLowerCase(caracter)) {
            case 'a':
                return caracteresSustitucion.charAt(0);
            case 'e':
                return caracteresSustitucion.charAt(1);
            case 'i':
                return caracteresSustitucion.charAt(2);
            case 's':
                return caracteresSustitucion.charAt(3);
            default:
                return caracter; // en caso de que el caracter NO esté dentro de las opciones
        }
    }
}
