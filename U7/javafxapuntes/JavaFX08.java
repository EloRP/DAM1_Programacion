package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFX08 extends Application {
    /*
     * Actividad 8. Crear una ventana que muestre un tablero de ajedrez, es decir
     * una cuadrícula de 8 x 8 “casillas” blancas y “negras” cuadradas.
     */
    @Override
    public void start(Stage primaryStage) {
        TilePane tilePane = new TilePane();
        tilePane.setPrefColumns(8);

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle square = new Rectangle(50, 50);
                square.setFill((row + col) % 2 == 0 ? Color.WHITE : Color.BLACK);
                tilePane.getChildren().add(square);
            }
        }

        Scene scene = new Scene(tilePane, 400, 400);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Tablero de Ajedrez");

        primaryStage.show();

        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}