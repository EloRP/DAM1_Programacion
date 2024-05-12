package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFX12 extends Application {
    /*
     * Actividad 12. Ejercicio con FlowPane:
     * Crea una aplicación que contenga un FlowPane con varias ImageView. Las
     * ImageView deben mostrar diferentes imágenes. Al hacer clic en cada imagen, se
     * debe mostrar un mensaje en la consola que indique qué imagen ha sido pulsada.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX11");

        Image imagen = new Image(getClass().getResourceAsStream("1.jpg"));
        ImageView imageView = new ImageView(imagen);
        Image imagen2 = new Image(getClass().getResourceAsStream("2.jpg"));
        ImageView imageView2 = new ImageView(imagen2);
        Image imagen3 = new Image(getClass().getResourceAsStream("3.jpg"));
        ImageView imageView3 = new ImageView(imagen3);

        imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado la imagen 1"));
        imageView2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado la imagen 2"));
        imageView3.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("Se ha pulsado la imagen 3"));

        FlowPane flowpane = new FlowPane();

        Scene scene = new Scene(flowpane, 1000, 1000);

        primaryStage.setScene(scene);

        flowpane.getChildren().addAll(imageView, imageView2, imageView3);

        primaryStage.show();
    }
}