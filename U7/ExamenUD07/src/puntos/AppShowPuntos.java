package puntos;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AppShowPuntos extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("AppShowPuntos");

        Button mostrarPuntuaciones = new Button("Mostrar puntuaciones");

        VBox vbox = new VBox(mostrarPuntuaciones);

        mostrarPuntuaciones.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(new File("..\\ExamenUD07"));
            File fichero = fileChooser.showOpenDialog(primaryStage);
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fichero))) {
                while (true) {
                System.out.println(in.readObject());
                }
            } catch (Exception ex) {
                System.out.println("FIN DEL ARCHIVO.");
            }
            
        });

        Scene scene = new Scene(vbox, 300, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
