package ficherosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EP1017 {
    /*
     * @author Eloy Rodal Pérez
     * 
     * @description EP1017. En Linux disponemos del comando more, al que se le pasa
     * un fichero y
     * lo muestra poco a poco: cada 24 líneas. Implementa un programa que funcione
     * de forma similar.
     */
    public static void main(String[] args) {
        String fileName = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficheroMore.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            Scanner sc = new Scanner(System.in);
            String line;
            int numLinea = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                numLinea++;
                if (numLinea % 24 == 0) {
                    sc.nextLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
