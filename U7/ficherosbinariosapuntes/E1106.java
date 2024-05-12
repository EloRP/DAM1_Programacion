package ficherosbinariosapuntes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class E1106 {
    /*
     * E1106. Recuperar la estrofa del archivo cancionPirata.dat de la actividad
     * E1102 y mostrarla por consola.
     */

    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\cancionPirata.dat"))) {
            String str = (String) in.readObject();
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
    
    }
