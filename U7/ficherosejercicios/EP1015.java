package ficherosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EP1015 {

    /*
     * @author Eloy Rodal Pérez
     * EP1015. En el archivo numeros.txt disponemos de una serie de números (uno por
     * cada línea). Diseña un programa que procese el fichero y nos muestre el menor
     * y el mayor.
     */

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(
                new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\numeros.txt"))) {
            int numMayor = 0;
            int numMenor = 9999999;
            int numActual;
            String linea = in.readLine();

            while (linea != null) {
                numActual = Integer.parseInt(linea);

                if (numActual < numMenor) {
                    numMenor = numActual;
                }

                if (numActual > numMayor) {
                    numMayor = numActual;
                }

                linea = in.readLine();
            }

            System.out.println("Número mayor: " + numMayor);
            System.out.println("Número menor: " + numMenor);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}