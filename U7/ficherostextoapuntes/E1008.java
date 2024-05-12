package ficherostextoapuntes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class E1008 extends Application {
    /*
     * @author Eloy Rodal Pérez
     * E1008. Escribir un programa que duplique el contenido de un fichero cuyo
     * nombre se pide
     * al usuario. El fichero copia tendrá el mismo nombre con el prefijo
     * “copia_de_".
     * Utiliza FileChooser de JavaFX para que el usuario seleccione el fichero.
     */

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String rutaInicial = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes";

        FileChooser fileChooser = new FileChooser();

        fileChooser.setInitialDirectory(new File(rutaInicial));

        File fichero = fileChooser.showOpenDialog(primaryStage);
        String nombreFichero ="F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\Copia de " + fichero.getName();

        try (BufferedReader in = new BufferedReader(new FileReader(fichero));
                BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero))) {
            String linea = in.readLine();
            while (linea != null) {
                out.write(linea);
                out.newLine();
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}



