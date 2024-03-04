package stringsparaninfo;

import java.util.Scanner;

public class EP0615 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generador de código HTML.\n");
        System.out.println("Escribe el título de tu página web.");
        String tituloWeb = sc.nextLine();
        System.out.println("Ahora introduce el contenido de la página.");
        String contenidoWeb = sc.nextLine();
        sc.close();
        System.out.println(generarDocumentoHTML(tituloWeb, contenidoWeb));
    }

    private static String generarDocumentoHTML(String titulo, String contenido) {
        // Utilizando formato de cadena para construir el documento HTML
        String documentoHTML = String.format("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>%s</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>%s</h1>\n" +
                "    <p>%s</p>\n" +
                "</body>\n" +
                "</html>", titulo, titulo, contenido);

        return documentoHTML;
    }
}
