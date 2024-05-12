package ficherosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EP1014 {

    /*
     * @author Eloy Rodal Pérez
     * EP1014. Escribe un programa que lea un fichero de texto llamado carta.txt.
     * Tenemos que
     * contar los caracteres, las líneas y las palabras. Para simplificar
     * supondremos que cada
     * palabra está separada de otra por un único espacio en blanco o por un cambio
     * de línea.
     */

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(
                new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\carta.txt"))) {
            int contadorCaracteres = 0;
            int contadorLineas = 0;
            int contadorPalabras = 0;
            int lector = in.read();

            while (lector != -1) {
                contadorCaracteres++;
                if (lector == ' ' || lector == '\n') {
                    contadorPalabras++;
                }
                if (lector == '\n') {
                    contadorLineas++;
                }
                lector = in.read();
            }

            if (contadorPalabras != 0) {
                contadorPalabras++;
            }

            if (contadorLineas != 0) {
                contadorLineas++;
            }

            String linea = in.readLine();

            while (linea != null) {
                linea = in.readLine();
                contadorLineas++;
            }

            contadorCaracteres -= contadorLineas - 1;

            System.out.println("Número de caracteres en el fichero: " + contadorCaracteres);
            System.out.println("Número de palabras en el fichero: " + contadorPalabras);
            System.out.println("Número de líneas en el fichero: " + contadorLineas);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
