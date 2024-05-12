package ficherosejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EP1011 {
    /*
     * @author Eloy Rodal Pérez
     * EP1011. Escribe un programa que solicite al usuario el nombre de un fichero
     * de texto y muestre su contenido en pantalla. Si no se proporciona ningún
     * nombre de fichero, la aplicación utilizará por defecto prueba.txt.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombreFichero = sc.nextLine();

        if (nombreFichero.isEmpty()) {
            nombreFichero = "prueba.txt";
        }
        
        sc.close();

        try (Scanner scFichero = new Scanner(new FileReader("U7\\ficherosejercicios\\" + nombreFichero + ".txt"))) {
            while (scFichero.hasNextLine()) {
                System.out.println(scFichero.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        }

    }
}
