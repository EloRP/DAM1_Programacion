package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EP1117 {
    /*
     * EP1117. Escribe un texto, línea a línea, de forma que, cada vez que se pulse
     * Intro, se guarde la línea en un archivo binario. El proceso se termina cuando
     * introduzcamos una linea vacía. Después el programa lee el texto completo del
     * archivo y lo muestra por pantalla.
     */

    public static void main(String[] args) {
        String fileName = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficheroBinario.dat";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Scanner sc = new Scanner(System.in);
            String line;
            while (!(line = sc.nextLine()).isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
}