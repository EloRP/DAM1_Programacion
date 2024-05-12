package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX14 extends Application {
    /*
     * Actividad 14. Ejercicio con DialogPane:
     * Crea una aplicación que utilice DialogPane para mostrar varios cuadros de
     * diálogo con diferentes configuraciones.
     */

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX14");

        Button botonInfo = new Button("Información");
        Button botonError = new Button("Error");
        Button botonAdvertencia = new Button("Advertencia");

        botonInfo.setOnAction(event -> showDialog("Información", "Este es un cuadro de diálogo de información."));
        botonError.setOnAction(event -> showDialog("Error", "Se produjo un error."));
        botonAdvertencia.setOnAction(event -> showDialog("Advertencia", "Esto es una advertencia."));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(botonInfo, botonError, botonAdvertencia);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showDialog(String title, String message) {
        DialogPane dialogPane = new DialogPane();
        dialogPane.setHeaderText(title);
        dialogPane.setContentText(message);

        Stage stage = new Stage();
        stage.setScene(new Scene(dialogPane));
        stage.setTitle(title);
        stage.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}