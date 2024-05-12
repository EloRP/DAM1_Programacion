package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX04 extends Application {
    /*
     * Actividad 4. Crear una ventana con un campo de texto y un botón que, al hacer
     * clic, cambie el color de fondo de la ventana (o de una etiqueta) al color
     * especificado en el campo de texto. (Investiga setBackground() de la clase
     * Region o setStyle() de la clase Node para cambiar el color de fondo de un
     * nodo).
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX04");

        TextField txtColor = new TextField("Escribe un color");

        Button btn = new Button("Cambiar color");

        VBox vbox = new VBox(txtColor, btn);

        btn.setOnAction(e -> vbox.setStyle("-fx-background-color: " + txtColor.getText()));

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}