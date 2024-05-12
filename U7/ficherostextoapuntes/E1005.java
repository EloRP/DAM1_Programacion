package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class E1005 {
    /*
     * APUNTES.
     * E1005. Crea con un editor un archivo de texto con un conjunto de números
     * reales, uno por línea. Guarda el fichero en la misma carpeta que el código
     * fuente.
     * 
     * Crea un programa que abra el fichero con un flujo de texto para lectura y que
     * lo lea línea a línea. Utiliza la clase Scanner para convertir las cadenas
     * leidas en números de tipo double, y muestrar al final la suma de todos ellos.
     * 
     * Prueba:
     * Y si tenemos más de un número por línea?
     * Y si en las líneas también hay textos u otros datos?
     * Y si colocamos el fichero en otra ubicación?
     * 
     */
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\NumerosPorLinea.txt"));
            Scanner s;
            double numero;
            double suma = 0;
            // Lectura anticipada de la primera línea
            String linea = in.readLine();
            // Mientras siga habiendo líneas
            while (linea != null) {
                // Analiza la línea con un Scanner
                s = new Scanner(linea).useLocale(Locale.US); // Utiliza el punto decimal como separador
                // Si hay un número real en la línea, lo suma
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                } else {
                    System.out.println("La línea del fichero '" + linea + "' no contiene un número real. Se omitirá.");
                }
                // Lee la siguiente línea
                linea = in.readLine();
            }
            // Muestra la suma
            System.out.println("La suma es: " + suma);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Si se ha abierto el fichero intenta cerrarlo
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

}