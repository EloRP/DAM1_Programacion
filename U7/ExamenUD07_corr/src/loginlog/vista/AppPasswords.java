package loginlog.vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import loginlog.model.Usuario;

public class AppPasswords extends Application {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Usuario usuario;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Usuarios");
        primaryStage.setScene(new Scene(FXMLLoader.load(AppPasswords.class.getResource("login.fxml"))));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    static public void cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader("src\\loginlog\\shadow.txt"))) {
        String lineaActual;
        while ((lineaActual = in.readLine()) != null) {
            Usuario[] partes = lineaActual.split(": ");
            if (partes.length == 2) {
                usuarios.add(partes[0]);
            }
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}