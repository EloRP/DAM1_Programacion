package ficherostextoapuntes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E1002 {

    /* APUNTES.
     * E1002. Leer el archivo de texto Main.java de uno de los proyectos que hayamos
     * terminado y mostrarlo por pantalla.
     */

    public static void main(String[] args) {
        String contenido = "";
        try {
            FileReader ficheroEntrada = new FileReader("prueba.txt"); // *
            int ch = ficheroEntrada.read();
            while (ch != -1) {
                contenido += (char) ch;
                ch = ficheroEntrada.read();
            }

            System.out.println("Contenido del fichero: " + contenido);
            ficheroEntrada.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException ex) {
            System.out.println("Error al leer el fichero");
        }
    }
}
