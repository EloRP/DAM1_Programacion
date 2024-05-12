package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E1006 {

    /* APUNTES.
     * E1006. Crea con un editor el fichero de texto Enteros.txt en la carpeta del
     * proyecto actual y escribir en él una serie de enteros separados por
     * secuencias de espacios y tabuladores, incluso en líneas distintas, tal como:
     * 
     * 2 3 45 73
     * 
     * 123 4 21
     * 
     * Implementar un programa que acceda a Enteros.txt con un objeto Scanner a
     * través de un flujo de entrada, lea los números y calcule su suma y su media
     * aritmética, mostrando los resultados por pantalla.
     * 
     */
    public static void main(String[] args) {
        BufferedReader in = null;
        int suma = 0;
        int cont = 0;
        try {
            in = new BufferedReader(new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\Enteros.txt"));

            String linea = in.readLine();
            while (linea != null) {
                Scanner sc = new Scanner(linea);
                while (sc.hasNextInt()) {
                    cont++;
                    suma += sc.nextInt();
                }
                linea = in.readLine();
            }

            System.out.println("Suma = " + suma);
            System.out.printf("Media = %.2f", ((double) suma / cont));
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}