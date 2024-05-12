package interfacesgraficasapuntes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class agga extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("agga.fxml"));
        loader.setController(new aggaController());
        primaryStage.setTitle("agga: el videojuego");
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}