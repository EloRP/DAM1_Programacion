package pruebas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.*;

public class Calculadora extends Application {
    String operador1 = "", operador2 = "";
    Double valorRes;
    Label lblResultado = new Label("Resultado: ");
    Character operacion = null;
    String txtHistorial = "";
    Label lblHistorial = new Label(txtHistorial);

    EventHandler<ActionEvent> asignarValor = event -> {
        Button boton = (Button) event.getSource();
        if (operacion == null) {
            operador1 += boton.getText();
        } else {
            operador2 += boton.getText();
        }
        txtHistorial += boton.getText();
        lblHistorial.setText(txtHistorial);
    };
    EventHandler<ActionEvent> asginarOperacion = event -> {
        Button boton = (Button) event.getSource();
        switch (boton.getText()) {
            case "+" -> {
                if (operador2.isEmpty() && operacion == null) {
                    operacion = '+';
                    txtHistorial += " " + operacion + " ";
                    lblHistorial.setText(txtHistorial);
                }
            }
            case "-" -> {
                if (operador2.isEmpty() && operacion == null) {
                    operacion = '-';
                    txtHistorial += " " + operacion + " ";
                    lblHistorial.setText(txtHistorial);
                }
            }
            case "*" -> {
                if (operador2.isEmpty() && operacion == null) {
                    operacion = '*';
                    txtHistorial += " " + operacion + " ";
                    lblHistorial.setText(txtHistorial);
                }
            }
            case "/" -> {
                if (operador2.isEmpty() && operacion == null) {
                    operacion = '/';
                    txtHistorial += " " + operacion + " ";
                    lblHistorial.setText(txtHistorial);
                }
            }
        }
    };
    EventHandler<ActionEvent> operar = new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            if (!operador2.isBlank()) {
                Double op1 = Double.parseDouble(operador1);
                Double op2 = Double.parseDouble(operador2);
                switch (operacion) {
                    case '+' -> valorRes = op1 + op2;
                    case '-' -> valorRes = op1 - op2;
                    case '*' -> valorRes = op1 * op2;
                    case '/' -> valorRes = op1 / op2;
                }
                lblResultado.setText("Resultado: " + valorRes);

                try (BufferedWriter out = new BufferedWriter(new FileWriter("log.txt", true))) {
                    out.write(operador1 + " " + operacion + " " + operador2 + " = " + valorRes);
                    out.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                operador1 = String.valueOf(valorRes);

                txtHistorial += " = " + operador1;
                lblHistorial.setText(txtHistorial);

                operador2 = "";
                operacion = null;
            } else {
                System.out.println("ERROR. Debes introducir un segundo operador primero.");
                lblHistorial.setText("ERROR. Debes introducir un segundo operador primero.");
            }
        }
    };
    EventHandler<ActionEvent> decimar = event -> {
        Button boton = (Button) event.getSource();
        if (operacion == null && !operador1.endsWith(".")) {
            operador1 += boton.getText();
        } else if (!operador2.endsWith(".")) {
            operador2 += boton.getText();
        }
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        lblHistorial.setMinSize(300, 50);
        lblHistorial.setTextAlignment(TextAlignment.RIGHT);

        Button btnClear = new Button("CE");
        btnClear.setOnAction(event -> {
            operador1 = "";
            operador2 = "";
            operacion = null;
            lblResultado.setText("Resultado: ");
            txtHistorial = "";
            lblHistorial.setText(txtHistorial);
        });
        btnClear.setMinSize(100, 50);
        HBox fila0 = new HBox(btnClear, lblHistorial);

        Button btnSiete = new Button("7");
        btnSiete.setOnAction(asignarValor);
        btnSiete.setMinSize(100, 50);
        Button btnOcho = new Button("8");
        btnOcho.setOnAction(asignarValor);
        btnOcho.setMinSize(100, 50);
        Button btnNueve = new Button("9");
        btnNueve.setOnAction(asignarValor);
        btnNueve.setMinSize(100, 50);
        Button btnMulti = new Button("*");
        btnMulti.setMinSize(100, 50);
        btnMulti.setOnAction(asginarOperacion);
        HBox fila1 = new HBox(btnSiete, btnOcho, btnNueve, btnMulti);

        Button btnCuatro = new Button("4");
        btnCuatro.setOnAction(asignarValor);
        btnCuatro.setMinSize(100, 50);
        Button btnCinco = new Button("5");
        btnCinco.setOnAction(asignarValor);
        btnCinco.setMinSize(100, 50);
        Button btnSeis = new Button("6");
        btnSeis.setOnAction(asignarValor);
        btnSeis.setMinSize(100, 50);
        Button btnSumar = new Button("+");
        btnSumar.setOnAction(asginarOperacion);
        btnSumar.setMinSize(100, 50);
        HBox fila2 = new HBox(btnCuatro, btnCinco, btnSeis, btnSumar);

        Button btnUno = new Button("1");
        btnUno.setOnAction(asignarValor);
        btnUno.setMinSize(100, 50);
        Button btnDos = new Button("2");
        btnDos.setOnAction(asignarValor);
        btnDos.setMinSize(100, 50);
        Button btnTres = new Button("3");
        btnTres.setOnAction(asignarValor);
        btnTres.setMinSize(100, 50);
        Button btnRestar = new Button("-");
        btnRestar.setOnAction(asginarOperacion);
        btnRestar.setMinSize(100, 50);
        HBox fila3 = new HBox(btnUno, btnDos, btnTres, btnRestar);

        Button btnDiv = new Button("/");
        btnDiv.setOnAction(asginarOperacion);
        btnDiv.setMinSize(100, 50);
        Button btnCero = new Button("0");
        btnCero.setOnAction(asignarValor);
        btnCero.setMinSize(100, 50);
        Button btnPunto = new Button(".");
        btnPunto.setOnAction(decimar);
        btnPunto.setMinSize(100, 50);
        Button btnIgual = new Button("=");
        btnIgual.setOnAction(operar);
        btnIgual.setMinSize(100, 50);
        HBox fila4 = new HBox(btnDiv, btnCero, btnPunto, btnIgual);

        VBox vBox = new VBox(fila0, fila1, fila2, fila3, fila4, lblResultado);

        Scene scene = new Scene(vBox);
        scene.onKeyPressedProperty().set(event -> {
            switch (event.getCode()) {
                case PLUS, ADD -> btnSumar.fire();
                case MINUS, SUBTRACT -> btnRestar.fire();
                case MULTIPLY, ASTERISK -> btnMulti.fire();
                case DIVIDE, SLASH -> btnDiv.fire();
                case DIGIT0, NUMPAD0 -> btnCero.fire();
                case DIGIT1, NUMPAD1 -> btnUno.fire();
                case DIGIT2, NUMPAD2 -> btnDos.fire();
                case DIGIT3, NUMPAD3 -> btnTres.fire();
                case DIGIT4, NUMPAD4 -> btnCuatro.fire();
                case DIGIT5, NUMPAD5 -> btnCinco.fire();
                case DIGIT6, NUMPAD6 -> btnSeis.fire();
                case DIGIT7, NUMPAD7 -> btnSiete.fire();
                case DIGIT8, NUMPAD8 -> btnOcho.fire();
                case DIGIT9, NUMPAD9 -> btnNueve.fire();
                case PERIOD, COMMA -> btnPunto.fire();
                case DELETE, BACK_SPACE -> btnClear.fire();
                case ENTER, INSERT -> btnIgual.fire();
            }
        });
        vBox.requestFocus();

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}