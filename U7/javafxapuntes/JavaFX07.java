package javafxapuntes;

import java.util.Comparator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX07 extends Application {
    /*
     * Actividad 7. Crea una aplicación que permita introducir en cuadros de texto
     * las notas de un grupo de alumnos, una a una, y que al mismo tiempo las vaya
     * mostrando en orden alfabético de nombre de alumno en un control de tipo lista
     * (ListView) y que muestre también la media de la clase, la nota más alta y la
     * más baja.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX07");

        TextField textNombre = new TextField("Nombre");
        TextField textNota = new TextField("Nota");
        Button button = new Button("Añadir");

        ListView<NotaAlumno> listaNotas = new ListView<>();

        Label lblEstadisticas = new Label();

        VBox vbox = new VBox(textNombre, textNota, button, listaNotas, lblEstadisticas);

        button.setOnAction(e -> {
            NotaAlumno notaAlumno = new NotaAlumno(textNombre.getText(), Double.valueOf(textNota.getText()));
            listaNotas.getItems().add(notaAlumno);
            listaNotas.getItems().sort(Comparator.naturalOrder());
            double media = 0;
            NotaAlumno notaAlumnoMax = null;
            NotaAlumno notaAlumnoMin = null;
            for (NotaAlumno n : listaNotas.getItems()) {
                media += n.nota;
                if (notaAlumnoMax == null)
                    notaAlumnoMax = n;
                else if (n.nota > notaAlumnoMax.nota)
                    notaAlumnoMax = n;

                if (notaAlumnoMin == null)
                    notaAlumnoMin = n;
                else if (n.nota < notaAlumnoMin.nota)
                    notaAlumnoMin = n;
            }
            media /= listaNotas.getItems().size();

            String str = "Nota máxima: " + notaAlumnoMax + "; Nota mínima: " + notaAlumnoMin + "; Media: " + media;

            lblEstadisticas.setText(str);
        });

        Scene scene = new Scene(vbox, 300, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

class NotaAlumno implements Comparable<NotaAlumno> {

    String nombre;
    Double nota;

    @Override
    public int compareTo(NotaAlumno o) {
        return nombre.compareTo(o.nombre);
    }

    public NotaAlumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }

}