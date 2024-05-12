package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class E1006FX extends Application {

    /*
     * APUNTES.
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

        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // String rutaInicial = System.getProperty("user.dir") +
        // "src\\ud7\\ficherostextoapuntes";
        String rutaInicial = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes";

        // Crea y muestra una ventana FileChooser para elegir el fichero y obtiene un
        // String con la ruta completa.
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(rutaInicial));
        File fichero = fileChooser.showOpenDialog(primaryStage);
        String nombreFichero = fichero.getAbsolutePath();

        BufferedReader in = null;
        int suma = 0;
        int cont = 0;
        try {
            in = new BufferedReader(new FileReader(nombreFichero));

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
            System.out.printf("Media = %.2f", (suma / (double) cont));
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cierra la aplicación
            Platform.exit();
        }
    }
}