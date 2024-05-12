package ficherosejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EP1019 {
    /*
     * @author Eloy Rodal Pérez
     * EP1019. Un encriptador es una aplicación que transforma un texto haciéndolo
     * ilegible para aquellos que desconocen el código. Diseña un programa que lea
     * un fichero de texto, lo codifique y cree un nuevo archivo con el mensaje
     * cifrado. El alfabeto de codificación se encontrará en el fichero codec.txt.
     * Un ejemplo de codificación de alfabeto es:
     * Alfabeto: abcdefghijklmnopqrstuvwxyz
     * Cifrado: emsrcyjnfxiwtakozdlqvbhupg
     */

    public static void main(String[] args) {
        String fileName = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficheroACifrar.txt";
        String fileNameCodec = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\codec.txt";

        try (BufferedReader lector = new BufferedReader(new FileReader(fileName));
                BufferedReader lectorCodec = new BufferedReader(new FileReader(fileNameCodec));
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficheroCifrado.txt"))) {

            String alfabeto = lectorCodec.readLine();
            String cifrado = lectorCodec.readLine();

            String line;
            while ((line = lector.readLine()) != null) {
                String encryptedLine = encriptar(line.toLowerCase(), alfabeto, cifrado);
                writer.write(encryptedLine);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String encriptar(String texto, String alfabeto, String cifrado) {
        String encryptedText = "";
        for (int i = 0; i < texto.length(); i++) {
            char currentChar = texto.charAt(i);
            int index = alfabeto.indexOf(currentChar);
            if (index != -1) {
                encryptedText += cifrado.charAt(index);
            } else {
                encryptedText += currentChar;
            }
        }
        return encryptedText;
    }
}
