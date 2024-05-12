package interfacesgraficasapuntes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class aggaController {

    @FXML
    private Button Calcular;

    @FXML
    private Label Resultado;

    @FXML
    private TextField primerNum;

    @FXML
    private TextField segundoNum;

    @FXML
    void calcularMedia(ActionEvent event) {
        double num1 = Double.parseDouble(primerNum.getText());
        double num2 = Double.parseDouble(segundoNum.getText());
        Resultado.setText(String.valueOf(calcularMedia(num1, num2)));
    }

    public static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2;
    }
    
}
