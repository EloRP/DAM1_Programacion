package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFX09 extends Application {
    /*
     * Actividad 9. Ejercicio con HBox:
     * Crea una aplicación que contenga un HBox con dos ImageView.
     * Los ImageView deben mostrar dos imágenes diferentes.
     * Al hacer clic en cada imagen, se debe mostrar un mensaje en la consola que
     * indique qué imagen ha sido pulsada.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX09");
        HBox hbox = new HBox();

        // Crear botones
        Image imagen = new Image(getClass().getResourceAsStream("1.jpg"));
        ImageView imageView = new ImageView(imagen);
        Image imagen2 = new Image(getClass().getResourceAsStream("2.jpg"));
        ImageView imageView2 = new ImageView(imagen2);

        imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha clicado en la imagen 1"));
        imageView2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha clicado en la imagen 2"));
        // Agregar los botones al HBox
        hbox.getChildren().addAll(imageView, imageView2);

        // Crear una escena
        Scene scene = new Scene(hbox, 300, 200);

        // Configurar la escena en la ventana
        primaryStage.setScene(scene);

        // Configurar título de la ventana
        primaryStage.setTitle("Ejemplo de HBox en JavaFX");

        primaryStage.show();
    }

}
