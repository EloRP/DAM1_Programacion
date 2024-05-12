package loginlog.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import loginlog.model.Usuario;
import loginlog.vista.AppPasswords;

public class controller {

    @FXML
    private Button botonLogin;

    @FXML
    private TextField campoTextoPassword;

    @FXML
    private TextField campoTextoUser;

    @FXML
    void accionLogin(ActionEvent event) {
        if ("".equals(campoTextoPassword.getText()) ||
            "".equals(campoTextoUser.getText())){
            System.out.println("Los campos no pueden estar vacíos.");
            } else {
                Usuario usuario = new Usuario(
                    campoTextoUser.getText(),
                    campoTextoPassword.getText());
            AppPasswords.cargarUsuarios();

            if (AppPasswords.usuarios.contains(usuario)) {
                int i = AppPasswords.usuarios.indexOf(usuario);
                if (AppPasswords.usuarios.get(i).getPassword().equals(usuario.getPassword())) {
                    System.out.println("Login correcto.");
                    AppPasswords.usuario = AppPasswords.usuarios.get(i);
                } else {
                    System.out.println("ERROR!");
                }
            }
            }
        }
    }