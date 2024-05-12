package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class pruebaMapa extends Application {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final int TAMANO_CASILLA = 50;
    private int filaActual = 0;
    private int columnaActual = 0;
    private Rectangle[][] casillas = new Rectangle[FILAS][COLUMNAS];
    private int[][] tipoCasillas = new int[FILAS][COLUMNAS];

    // Definir los tipos de casillas
    private static final int VACIO = 0;
    private static final int MURO = 1;
    private static final int INICIO = 2;
    private static final int FIN = 3;

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(1);
        gridPane.setVgap(1);

        // Definir el mapa con diferentes tipos de casillas
        int[][] mapa = {
            {INICIO, VACIO, MURO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, FIN},
            {VACIO, VACIO, MURO, VACIO, MURO, VACIO, MURO, MURO, VACIO, VACIO},
            {VACIO, MURO, MURO, VACIO, MURO, VACIO, VACIO, VACIO, MURO, VACIO},
            {VACIO, VACIO, VACIO, VACIO, MURO, MURO, MURO, VACIO, MURO, VACIO},
            {MURO, MURO, MURO, VACIO, VACIO, VACIO, VACIO, VACIO, MURO, VACIO},
            {VACIO, VACIO, MURO, VACIO, MURO, MURO, MURO, VACIO, MURO, VACIO},
            {VACIO, MURO, VACIO, VACIO, VACIO, VACIO, VACIO, VACIO, MURO, VACIO},
            {VACIO, VACIO, MURO, VACIO, MURO, VACIO, MURO, VACIO, MURO, VACIO},
            {VACIO, MURO, MURO, MURO, VACIO, VACIO, VACIO, VACIO, MURO, VACIO},
            {VACIO, VACIO, VACIO, VACIO, VACIO, MURO, VACIO, VACIO, VACIO, VACIO}
        };


        

        // Crear el tablero
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                Rectangle casilla = new Rectangle(TAMANO_CASILLA, TAMANO_CASILLA);
                casillas[fila][columna] = casilla;
                switch (mapa[fila][columna]) {
                    case VACIO:
                        casilla.setFill(Color.WHITE);
                        break;
                    case MURO:
                        casilla.setFill(Color.BLACK);
                        break;
                    case INICIO:
                        casilla.setFill(Color.GREEN);
                        filaActual = fila;
                        columnaActual = columna;
                        break;
                    case FIN:
                        casilla.setFill(Color.RED);
                        break;
                }
                gridPane.add(casilla, columna, fila);
                tipoCasillas[fila][columna] = mapa[fila][columna];
            }
        }

        // Crear la escena y mostrarla
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mapa");
        primaryStage.show();

        // Manejar eventos de teclado para mover al personaje
        scene.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            switch (keyCode) {
                case UP, W:
                    moverArriba(primaryStage);
                    break;
                case DOWN, S:
                    moverAbajo(primaryStage);
                    break;
                case LEFT, A:
                    moverIzquierda(primaryStage);
                    break;
                case RIGHT, D:
                    moverDerecha(primaryStage);
                    break;
            }
        });
    }

    // Método para mover el personaje hacia arriba
    private void moverArriba(Stage primaryStage) {
        if (filaActual > 0 && tipoCasillas[filaActual - 1][columnaActual] != MURO) {
            casillas[filaActual][columnaActual].setFill(getColorCasilla(filaActual, columnaActual));
            filaActual--;
            casillas[filaActual][columnaActual].setFill(Color.BLUE);
            if (tipoCasillas[ filaActual ][ columnaActual ] == FIN) {
                Scene escenaFin1 = new Scene(mostrarMensajeFin());
                primaryStage.setScene(escenaFin1);
            }
        }
    }

    // Método para mover el personaje hacia abajo
    private void moverAbajo(Stage primaryStage) {
        if (filaActual < FILAS - 1 && tipoCasillas[filaActual + 1][columnaActual] != MURO) {
            casillas[filaActual][columnaActual].setFill(getColorCasilla(filaActual, columnaActual));
            filaActual++;
            casillas[filaActual][columnaActual].setFill(Color.BLUE);
            if (tipoCasillas[ filaActual ][ columnaActual ] == FIN) {
                Scene escenaFin1 = new Scene(mostrarMensajeFin());
                primaryStage.setScene(escenaFin1);
            }
        }
    }

    // Método para mover el personaje hacia la izquierda
    private void moverIzquierda(Stage primaryStage) {
        if (columnaActual > 0 && tipoCasillas[filaActual][columnaActual - 1] != MURO) {
            casillas[filaActual][columnaActual].setFill(getColorCasilla(filaActual, columnaActual));
            columnaActual--;
            casillas[filaActual][columnaActual].setFill(Color.BLUE);
            if (tipoCasillas[ filaActual ][ columnaActual ] == FIN) {
                Scene escenaFin1 = new Scene(mostrarMensajeFin());
                primaryStage.setScene(escenaFin1);
            }
        }
    }

    // Método para mover el personaje hacia la derecha
    private void moverDerecha(Stage primaryStage) {
        if (columnaActual < COLUMNAS - 1 && tipoCasillas[filaActual][columnaActual + 1] != MURO) {
            casillas[filaActual][columnaActual].setFill(getColorCasilla(filaActual, columnaActual));
            columnaActual++;
            casillas[filaActual][columnaActual].setFill(Color.BLUE);
            if (tipoCasillas[ filaActual ][ columnaActual ] == FIN) {
                Scene escenaFin1 = new Scene(mostrarMensajeFin());
                primaryStage.setScene(escenaFin1);
            }
        }
    }

    // Método para obtener el color de una casilla
    private Color getColorCasilla(int fila, int columna) {
        switch (tipoCasillas[fila][columna]) {
            case VACIO:
                return Color.WHITE;
            case MURO:
                return Color.BLACK;
            case INICIO:
                return Color.GREEN;
            case FIN:
                return Color.RED;
            default:
                return Color.WHITE;
        }
    }

    private DialogPane mostrarMensajeFin() {
        DialogPane dialogPane = new DialogPane();
        dialogPane.setHeaderText("¡Has llegado al final!");
        dialogPane.setContentText("¡Enhorabuena! Has completado el laberinto.");
        return dialogPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}