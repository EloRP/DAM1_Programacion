package javafxapuntes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class prueba extends Application {

    static int pulsaciones = 0;
    static Button btn1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX01");

        btn1 = new Button("Púlsame");
        btn1.autosize();
        
        btn1.setStyle("-fx-font-size: 20px; -fx-background-color: #ff0000; -fx-text-fill: #fffff-;");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pulsaciones++;
                String str = "Me has pulsado " + pulsaciones + (pulsaciones > 1 ? " veces" : " vez");
                str += "\n¡Púlsame otra vez!";
                btn1.setText(str);
            }
        });

        primaryStage.setScene(new Scene(btn1, 300, 250));

        primaryStage.show();
    }
}
