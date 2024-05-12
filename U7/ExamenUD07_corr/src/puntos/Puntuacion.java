package puntos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Puntuacion implements Serializable {
    String nombreJugador;
    int puntuacionTotal;
    LocalDateTime horaPuntuacion;

    public Puntuacion(String nombreJugador, int puntuacionTotal, LocalDateTime horaPuntuacion) {
        this.nombreJugador = nombreJugador;
        this.puntuacionTotal = puntuacionTotal;
        this.horaPuntuacion = horaPuntuacion;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public LocalDateTime getHoraPuntuacion() {
        return horaPuntuacion;
    }

    public void setHoraPuntuacion(LocalDateTime horaPuntuacion) {
        this.horaPuntuacion = horaPuntuacion;
    }

    @Override
    public String toString() {
        return nombreJugador + " - " + puntuacionTotal + " puntos" + ", registrado a las: " + horaPuntuacion;
    }

    public static void guardarPuntuacion(String nombreJugador, int puntuacionTotal, LocalDateTime horaPuntuacion, String archivo) {
        List<Puntuacion> listaPuntuaciones;
        
        // Intentamos leer las puntuaciones existentes del archivo
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            listaPuntuaciones = (List<Puntuacion>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Si hay un error al leer el archivo, asumimos que no hay puntuaciones previas
            listaPuntuaciones = new ArrayList<>();
        }
        
        // Agregamos la nueva puntuación a la lista
        listaPuntuaciones.add(new Puntuacion(nombreJugador, puntuacionTotal, horaPuntuacion));

        // Escribimos la lista completa en el archivo
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(listaPuntuaciones);
            System.out.println("Puntuación guardada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en puntuaciones.dat.");
        }
    }

    public static void main(String[] args) {
        guardarPuntuacion("Eloy", 432485, LocalDateTime.now(), "puntuaciones.dat");
        guardarPuntuacion("Juan", 485, LocalDateTime.now(), "puntuaciones.dat");
        guardarPuntuacion("Luis", 43245, LocalDateTime.now(), "puntuaciones.dat");
        guardarPuntuacion("Yoel", 42485, LocalDateTime.now(), "puntuaciones.dat");
        guardarPuntuacion("Iker", 4325, LocalDateTime.now(), "puntuaciones.dat");

    }
}
