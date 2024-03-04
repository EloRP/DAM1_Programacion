package stringsejercicios;

import java.util.Scanner;

public class EjCadenas08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el texto: ");
        String texto = sc.nextLine();

        System.out.print("Escribe la subcadena que quieras eliminar: ");
        String subcadenaEliminar = sc.nextLine();

        String textoSinSubcadena = eliminarSubcadena(texto, subcadenaEliminar);

        System.out.println("Texto modificado: \n" + textoSinSubcadena);
        sc.close();
    }

    public static String eliminarSubcadena(String texto, String subcadenaEliminar) {
        return texto.replaceAll(subcadenaEliminar, "");
    }
}
/*
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Escribe el texto: ");
 * String texto = sc.nextLine();
 * 
 * System.out.print("Escribe la palabra que quieras reemplazar: ");
 * String palabraBuscar = sc.nextLine();
 * 
 * System.out.print("Escribe la palabra de reemplazo: ");
 * String palabraReemplazo = sc.nextLine();
 * 
 * sc.close();
 * 
 * String textoModificado = editorTexto(texto, palabraBuscar, palabraReemplazo);
 * 
 * System.out.println("Texto modificado: \n" + textoModificado);
 * }
 * 
 * public static String editorTexto(String texto, String palabraBuscada, String
 * palabraReemplazo) {
 * return texto.replace(palabraBuscada, palabraReemplazo); //Pilla una palabra
 * que elija el usuario (palabraBuscar) y la reemplaza.
 * }
 * 
 * 
 * public static int contadorCaracteres(String frase, char caracter) {
 * String[] palabras = frase.split(" ");
 * int contadorCaracter = 0;
 * for (int i = 0; i < palabras.length; i++) {
 * for (int j = 0; j < palabras[i].length(); j++) {
 * if (Character.toLowerCase(palabras[i].charAt(j)) == caracter) {
 * contadorCaracter++;
 * }
 * }
 * }
 * return contadorCaracter;
 * }
 */