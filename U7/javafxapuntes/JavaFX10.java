package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX10 extends Application {
    /*
     * Actividad 10. Ejercicio con VBox:
     * Crea una aplicación que contenga un VBox con tres botones, cada uno de ellos
     * con un texto diferente (por ejemplo, "Botón 1", "Botón 2" y "Botón 3"). Al
     * hacer clic en cada botón, se debe mostrar un mensaje en la consola que
     * indique qué botón ha sido pulsado.
     */

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX10");

        Button btn1 = new Button("Botón 1");
        Button btn2 = new Button("Botón 2");
        Button btn3 = new Button("Botón 3");

        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 1"));
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 2"));
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado el botón 3"));

        VBox vbox = new VBox(btn1, btn2, btn3);

        Scene scene = new Scene(vbox, 200, 200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
