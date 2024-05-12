package ficherosbinariosapuntes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LectorE1108 {

    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("X:\\dam1\\Programación\\UD07\\socios.dat"))) {
            int numSocios = in.readByte();
            Socio[] sociosLeidos = (Socio[]) in.readObject();
            for (int i = 0; i < numSocios; i++) {
                System.out.println(sociosLeidos[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}