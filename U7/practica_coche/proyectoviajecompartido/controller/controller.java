package practica_coche.proyectoviajecompartido.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import practica_coche.proyectoviajecompartido.modelo.PuntoGeografico;
import practica_coche.proyectoviajecompartido.modelo.User;
import practica_coche.proyectoviajecompartido.modelo.Viaje;

public class controller {

        @FXML
        private DatePicker campoFecha;

        @FXML
        private TextField campoHora1;

        @FXML
        private TextField campoHora2;

        @FXML
        private TextField campoPlazas;

        @FXML
        private TextField campoconductor;

        @FXML
        private TextField campopuntoLlegada1;

        @FXML
        private TextField campopuntoLlegada2;

        @FXML
        private TextField campopuntoSalida1;

        @FXML
        private TextField campopuntoSalida2;

        @FXML
        private Button crearViaje;

        @FXML
        void crearViaje(ActionEvent event) {
                try {
                        System.out.println("Creando viaje");
                        User user = new User(campoconductor.getText());
                        LocalDate date = campoFecha.getValue();
                        LocalDateTime fechaHora = date.atTime(Integer.parseInt(campoHora1.getText()),
                                        Integer.parseInt(campoHora2.getText()));
                        PuntoGeografico puntoSalida = new PuntoGeografico(
                                        Double.parseDouble(campopuntoSalida1.getText()),
                                        Double.parseDouble(campopuntoSalida2.getText()));
                        PuntoGeografico puntoLlegada = new PuntoGeografico(
                                        Double.parseDouble(campopuntoLlegada1.getText()),
                                        Double.parseDouble(campopuntoLlegada2.getText()));
                        int plazas = Integer.parseInt(campoPlazas.getText());
                        Viaje viaje = new Viaje(user, fechaHora, puntoSalida, puntoLlegada, plazas);

                        viaje.mostrarDetalle();

                        Alert alert = new Alert(AlertType.INFORMATION);

                        alert.setHeaderText("Viaje creado");
                        alert.setContentText(viaje.toString() + "\n" + viaje.urlOpenStreetMaps());
                        alert.showAndWait();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }

        }

}
