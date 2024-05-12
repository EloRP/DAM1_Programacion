package ficherosejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EP1111 {

    /* EP1111. Pide un valor double por consola y guárdalo en un archivo binario. */
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\archivoDouble.dat"))) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Escribe un valor double.");
            double inputUser = sc.nextDouble();
            out.writeDouble(inputUser);

            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
