package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFX13 extends Application {
    /*
     * Actividad 13. Ejercicio con GridPane:
     * Crea una aplicación que contenga un GridPane con varios botones. Los botones
     * deben estar distribuidos en el GridPane de manera que formen una cuadrícula.
     * Al hacer clic en cada botón, se debe mostrar un mensaje en la consola que
     * indique qué botón ha sido pulsado y en qué posición se encuentra dentro del
     * GridPane.
     */

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX13");

        GridPane gridPane = new GridPane();
        Button btn1 = new Button("Botón 1");
        Button btn2 = new Button("Botón 2");
        Button btn3 = new Button("Botón 3");

        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 1"));
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 2"));
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 3"));

        gridPane.add(btn1, 1, 0);
        gridPane.add(btn2, 2, 0);
        gridPane.add(btn3, 3, 0);

        Scene scene = new Scene(gridPane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
