package practica_coche.proyectoviajecompartido.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppViajeFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Viajes compartidos");

        primaryStage.setScene(new Scene(FXMLLoader.load(AppViajeFX.class.getResource("viajeCompartido.fxml"))));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
