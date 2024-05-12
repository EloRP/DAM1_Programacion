package ficherosejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class EP1012 {
    /*
     * @author Eloy Rodal Pérez
     * EP1012. Diseña una aplicación que pida al usuario su nombre y edad. Estos
     * datos deben guardarse en el fichero datos.txt. Si este fichero existe, deben
     * añadirse al final en una nueva línea, y en caso de no existir, debe crearse.
     */

    public static void main(String[] args) {
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\datos.txt"))) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce tu nombre:");

            String nombre = sc.nextLine();

            System.out.println("Introduce tu edad:");

            int edad = sc.nextInt();

            sc.close();
            
            out.write(nombre + " " + edad);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
