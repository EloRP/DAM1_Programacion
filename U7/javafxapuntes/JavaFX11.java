package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFX11 extends Application {
    /*
     * Actividad 11. Ejercicio con BorderPane:
     * Crea una aplicación que contenga un BorderPane con un menú en la parte
     * superior y un panel en el centro. El menú debe tener dos opciones: "Rojo" y
     * "Verde". Al seleccionar la opción "Rojo", el panel debe cambiar su color de
     * fondo a rojo; al seleccionar la opción "Verde", el panel debe cambiar su
     * color de fondo a verde.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX11");

        ComboBox<String> cmbColor = new ComboBox<>();

        Pane panel = new Pane();

        cmbColor.getItems().add("red");
        cmbColor.getItems().add("green");

        BorderPane borderpane = new BorderPane();

        borderpane.setTop(cmbColor);
        borderpane.setCenter(panel);

        cmbColor.setOnAction(e -> panel.setStyle("-fx-background-color: " + cmbColor.getValue()));

        Scene scene = new Scene(borderpane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
