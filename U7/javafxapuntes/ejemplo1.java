package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ejemplo1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX02");

        TextField txtText = new TextField("Escribe algo...");

        Label label = new Label();
        Label label2 = new Label();

        Button btnBoton = new Button("Imprimir");
        btnBoton.setOnAction(e -> {
            label.setText(txtText.getText());
        });

        VBox vbox = new VBox(txtText, btnBoton, label, label2);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
