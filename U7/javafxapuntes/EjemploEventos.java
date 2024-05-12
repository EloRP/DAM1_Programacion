package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class EjemploEventos extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejemplos de eventos");
        
        primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWING, e -> System.out.println("WINDOW_SHOWING"));
        primaryStage.addEventHandler(WindowEvent.WINDOW_HIDDEN, e -> System.out.println("WINDOW_HIDDEN"));
        primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWING, e -> System.out.println("WINDOW_SHOWING"));
        primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWN, e -> System.out.println("WINDOW_SHOWN"));
        primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, e -> System.out.println("WINDOW_CLOSE_REQUEST"));
    
        TextField textField = new TextField();



        Button button = new Button("Button");
        
        VBox vbox = new VBox(button);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        
        
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("MOUSE_CLICKED - " + e));
        
        vbox.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("MOUSE_CLICKED - " + e));

        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> System.out.println("MOUSE_CLICKED - " + e));
        
        primaryStage.show();
    
    }
}