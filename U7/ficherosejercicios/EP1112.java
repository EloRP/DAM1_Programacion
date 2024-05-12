package ficherosejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EP1112 {
    /*
     * EP1112. Abre el fichero de la Actividad de aplicación EP1111, lee el valor
     * double contenido
     * en él y muéstralo por pantalla.
     */
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\archivoDouble.dat"))) {
            while (true) {
                System.out.println(in.readDouble());
            }
        } catch (IOException e) {
            System.out.println("FIN DEL ARCHIVO.");
        }

    }
}
