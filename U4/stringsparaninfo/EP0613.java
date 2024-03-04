package stringsparaninfo;

import java.util.Scanner;

public class EP0613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una sentencia en C cuyos comentarios quieras eliminar: ");
        String sentenciaEnC = sc.nextLine();
        System.out.println(eliminarComentarios(sentenciaEnC));
        sc.close();
    }

    public static String eliminarComentarios(String sentenciaEnC) {
        String resultado = "";
        boolean dentroComentario = false;

        for (int i = 0; i < sentenciaEnC.length(); i++) {
            char caracterActual = sentenciaEnC.charAt(i);

            if (dentroComentario) {         //Si se está dentro de un comentario, se busca el fin de este (/)
                if (caracterActual == '*' && i < sentenciaEnC.length() - 1 && sentenciaEnC.charAt(i + 1) == '/') {
                    dentroComentario = false;
                    i++;
                }
            } else {                       //Si no se está dentro de un comentario, se verifica si se encuentra un inicio de comentario.
                if (caracterActual == '/' && i < sentenciaEnC.length() - 1 && sentenciaEnC.charAt(i + 1) == '*') {
                    dentroComentario = true;
                    i++;
                } else {
                    resultado += caracterActual;
                }
            }
        }
        return resultado;

    }
}
