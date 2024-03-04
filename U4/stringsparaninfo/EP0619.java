package stringsparaninfo;

import java.util.Scanner;

public class EP0619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el texto: ");
        String texto = sc.nextLine();

        System.out.print("Escribe la palabra que quieras reemplazar: ");
        String palabraBuscar = sc.nextLine();

        System.out.print("Escribe la palabra de reemplazo: ");
        String palabraReemplazo = sc.nextLine();

        sc.close();

        String textoModificado = editorTexto(texto, palabraBuscar, palabraReemplazo);

        System.out.println("Texto modificado: \n" + textoModificado);
    }

    public static String editorTexto(String texto, String palabraBuscada, String palabraReemplazo) {
        return texto.replace(palabraBuscada, palabraReemplazo);     //Pilla una palabra que elija el usuario (palabraBuscar) y la reemplaza.
    }

}
