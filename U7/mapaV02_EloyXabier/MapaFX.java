package mapaV02_EloyXabier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MapaFX extends Application {

    // Creación de la primaryStage.
    @Override
    public void start(Stage primaryStage) throws Exception {

        Menu menu1 = new Menu("Archivo");
        Menu menu2 = new Menu("Ayuda");

        MenuBar menuBar = new MenuBar(menu1, menu2);

        Mapa mapaDPrueba = new Mapa(10, 10, new int[] { 0, 0 }, new int[] { 9, 9 }, new Integer[10][10]);

        Personaje personaje = new Personaje(mapaDPrueba.inicio[0], mapaDPrueba.inicio[1]);
        Label label = new Label("Tiempo");

        GridPane gridPane = crearMapa(mapaDPrueba);
        mapaDPrueba.generarMapa(30, 20);

        VBox vBox = new VBox(menuBar, gridPane, label);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mapa");
        primaryStage.show();

        scene.setOnKeyPressed(e -> moverPersonaje(personaje, e.getCode(), mapaDPrueba, gridPane));

    }

    private GridPane crearMapa(Mapa mapa) {

        GridPane mapaVisuales = new GridPane();

        for (int i = 0; i < mapa.getFilas(); i++) {
            for (int j = 0; j < mapa.getColumnas(); j++) {
                if (mapa.getTerreno()[i][j] == 0) {
                    mapaVisuales.add(new Rectangle(50, 50, Color.BLACK), j, i);
                }

                if (mapa.getTerreno()[i][j] == 1) {
                    mapaVisuales.add(new Rectangle(50, 50, Color.WHITE), j, i);
                }
            }
        }

        int[] inicio = mapa.getInicio();
        mapaVisuales.add(new Rectangle(50, 50, Color.RED), inicio[0], inicio[1]);
        mapaVisuales.add(new Text("Inicio"), inicio[0], inicio[1]);
        int[] fin = mapa.getFin();
        mapaVisuales.add(new Rectangle(50, 50, Color.GREEN), fin[0], fin[1]);
        mapaVisuales.add(new Text("Fin"), fin[0], fin[1]);

        return mapaVisuales;
    }

    public static void main(String[] args) {
        launch(args);

    }

    public int contarCasillasVacias(Mapa mapa) {
        int contador = 0;
        for (int i = 0; i < mapa.getFilas(); i++) {
            for (int j = 0; j < mapa.getColumnas(); j++) {
                if (mapa.getTerreno()[i][j] == 1) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void dibujarCarne(Mapa mapa) {
        if (mapa.getTerreno()[mapa.getFilas()][mapa.getColumnas()] == 1) {
        }
    }

    public void moverPersonaje(Personaje personaje, KeyCode code, Mapa mapa, GridPane mapaVisuales) {
        if (!mapa.esMuro(personaje.fila, personaje.columna)) {

            switch (code) {

                case UP -> {
                    if (!mapa.esMuro(personaje.fila - 1, personaje.columna)) {
                        borrarPersonaje(personaje, mapaVisuales);
                        personaje.fila--;
                        dibujarPersonaje(personaje, mapaVisuales);
                    }
                }
                case DOWN -> {
                    if (!mapa.esMuro(personaje.fila + 1, personaje.columna)) {
                        borrarPersonaje(personaje, mapaVisuales);
                        personaje.fila++;
                        dibujarPersonaje(personaje, mapaVisuales);
                    }
                }
                case LEFT -> {
                    if (!mapa.esMuro(personaje.fila, personaje.columna - 1)) {
                        borrarPersonaje(personaje, mapaVisuales);
                        personaje.columna--;
                        dibujarPersonaje(personaje, mapaVisuales);
                    }
                }
                case RIGHT -> {
                    if (!mapa.esMuro(personaje.fila, personaje.columna + 1)) {
                        borrarPersonaje(personaje, mapaVisuales);
                        personaje.columna++;
                        dibujarPersonaje(personaje, mapaVisuales);
                    }
                }
                default -> System.out.println("KeyCode sin acción asignada: " + code);
            }
            mapaVisuales.add(new Rectangle(50, 50, Color.RED), mapa.inicio[0], mapa.inicio[1]);
            mapaVisuales.add(new Text("Inicio"), mapa.inicio[0], mapa.inicio[1]);
            mapaVisuales.add(new Rectangle(50, 50, Color.GREEN), mapa.fin[0], mapa.fin[1]);
            mapaVisuales.add(new Text("Fin"), mapa.fin[0], mapa.fin[1]);

        }
    }

    private void dibujarPersonaje(Personaje personaje, GridPane mapaVisuales) {
        Rectangle rect = new Rectangle(50, 50, Color.BLUE);
        mapaVisuales.add(rect, personaje.columna, personaje.fila); // Cambiado fila y columna
    }

    private void borrarPersonaje(Personaje personaje, GridPane mapaVisuales) {
        // Eliminar el nodo anterior antes de agregar uno nuevo
        mapaVisuales.getChildren().removeIf(node -> GridPane.getRowIndex(node) == personaje.fila
                && GridPane.getColumnIndex(node) == personaje.columna);

        // Agregar un rectángulo blanco en la posición del personaje
        Rectangle rect = new Rectangle(50, 50, Color.WHITE);
        mapaVisuales.add(rect, personaje.columna, personaje.fila); // Cambiado fila y columna
    }

}