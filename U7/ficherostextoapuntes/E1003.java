package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E1003 {

    /* APUNTES.
     * @author Eloy Rodal Pérez
     * E1003. Repetir la Actividad resuelta E1002 usando un flujo de texto con
     * búfer.
     */
    
    public static void main(String[] args) {
        String linea = null;
        String contenido = "";
        try {
            FileReader ficheroEntrada = new FileReader("src\\ficherostexto\\FicherosTexto.java");
            BufferedReader bufferEntrada = new BufferedReader(ficheroEntrada);
            linea = bufferEntrada.readLine();
            while (linea != null) {
                contenido += linea + "\n";
                linea = bufferEntrada.readLine();
            }
            System.out.println("Contenido del fichero: " + contenido);
            ficheroEntrada.close();
        } catch (IOException ex) {
            System.out.println("Error de Entrada/Salida");
        }
    }
}
