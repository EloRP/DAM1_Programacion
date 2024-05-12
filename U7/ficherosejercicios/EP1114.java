package ficherosejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EP1114 {
    /*
     * EP1114. Introduce por teclado una frase y guárdala en un archivo binario. A
     * continuación,
     * recupérala y muéstrala por pantalla.
     */

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\textoBinario.dat"))) {
            Scanner sc = new Scanner(System.in);
            String frase = sc.nextLine();

            out.writeObject(frase);
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\textoBinario.dat"))) {
            String fraseArchivo = (String) in.readObject();
            System.out.println(fraseArchivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}