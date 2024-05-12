package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E1006bis {

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
        // Crea un flujo de entrada con el fichero
        FileInputStream flujo = null;       //el "flujo" al que se refiere es, de cierto modo, "canalizar" el archivo dentro del programa para que este lo use.
        
        try (BufferedReader in = new BufferedReader(new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\Enteros.txt"));) {
            String linea = in.readLine();
            flujo = new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\Enteros.txt");
        
        
        // Crea un Scanner para analizar el flujo de entrada del fichero
        Scanner sc = new Scanner(flujo);
        int suma = 0;
        int cont = 0;
        while (sc.hasNextInt()) {
            cont++;
            suma += sc.nextInt();
        }

        if (sc.hasNextLine()) {
            System.out.println("Se ha detectado un valor alfanumérico " + linea + ". Se va a saltar.");
        }

        System.out.println("Suma = " + suma);
        System.out.printf("Media = %.2f", ((double) suma / cont));

        sc.close();
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}
}