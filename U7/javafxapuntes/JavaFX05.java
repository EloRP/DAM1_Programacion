package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX05 extends Application {
    /*
     * Actividad 5. Crear una ventana con una lista desplegable de colores
     * (ComboBox) y un botón que, al hacer clic, cambie el color de fondo de la
     * ventana al color seleccionado en la lista desplegable.
     * Para prescindir del botón y cambiar el color con sólo seleccionarlo en el
     * desplegable, investiga el evento onAction del ComboBox que se dispara al
     * modificar la propiedad value.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX05");

        ComboBox<String> cmbColor = new ComboBox<>();
        cmbColor.getItems().add("red");
        cmbColor.getItems().add("blue");
        cmbColor.getItems().add("green");

        VBox vbox = new VBox(cmbColor);

        cmbColor.setOnAction(e -> vbox.setStyle("-fx-background-color: " + cmbColor.getValue()));

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}