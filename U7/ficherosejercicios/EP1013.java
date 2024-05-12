package ficherosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EP1013 {
    /*
     * @author Eloy Rodal Pérez
     * EP1013. Implementa un programa que lea dos listas de números enteros no
     * ordenados desde dos archivos con un número por linea, los reúna en una lista
     * única y los guarde en orden creciente en un tercer archivo, de nuevo uno por
     * línea.
     */

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7"));
            BufferedReader in2 = new BufferedReader(new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7"))){
            String linea = in.readLine();
            while (linea != null) {
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
