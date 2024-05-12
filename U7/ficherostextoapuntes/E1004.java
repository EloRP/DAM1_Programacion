package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E1004 {

    /*
     * APUNTES.
     * E1004. Crear con un editor el fichero de texto NumerosReales.txt en la
     * carpeta del
     * proyecto de NetBeans actual y escribir en él una serie de números reales
     * separados por
     * espacios simples.
     * Implementar un programa que acceda a NumerosReales.txt, lea los números y
     * calcule la
     * Suma y la media aritmética, mostrando los resultados por pantalla.
     */

    public static void main(String[] args) {
        // Declaración de variables
        String linea = null;
        Double suma = 0.0;
        int cont = 0;

        try {
            // Apertura del archivo de texto para lectura
            FileReader ficheroEntrada = new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\NumerosReales.txt");

            // Buffer de lectura para optimizar la lectura del archivo
            BufferedReader bufferEntrada = new BufferedReader(ficheroEntrada);

            // Lectura de la primera línea del archivo
            linea = bufferEntrada.readLine();

            // Bucle para recorrer todas las líneas del archivo
            while (linea != null) {
                // Separar la línea en números individuales utilizando el espacio como
                // delimitador
                String[] numerosStr = linea.split(" ");

                // Bucle para recorrer los números de la línea actual
                for (String numeroStr : numerosStr) {
                    // Conversión de cada número de tipo String a tipo Double y suma a la variable
                    // 'suma'
                    suma += Double.valueOf(numeroStr);
                    // Incremento del contador de números
                    cont++;
                }
                // Lectura de la siguiente línea del archivo
                linea = bufferEntrada.readLine();
            }

            // Cálculo y visualización de la suma y la media aritmética
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + suma / cont);

            // Cierre del archivo de entrada
            ficheroEntrada.close();
        } catch (FileNotFoundException ex) {
            // Manejo de la excepción en caso de que no se encuentre el archivo
            System.out.println("No se encuentra el fichero");
        } catch (IOException ex) {
            // Manejo de la excepción en caso de error de entrada/salida
            System.out.println("Error de Entrada/Salida");
        } catch (NumberFormatException ex) {
            // Manejo de la excepción en caso de que algún dato del archivo no tenga el
            // formato requerido
            System.out.println("Algún dato del fichero no tiene el formato requerido");
            System.out.println(ex);
        } catch (Exception ex) {
            // Manejo de cualquier otra excepción no prevista
            System.out.println("Ha habido algún otro tipo de problema");
            System.out.println(ex);
        }
    }
}