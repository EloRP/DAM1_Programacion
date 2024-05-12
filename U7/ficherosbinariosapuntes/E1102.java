package ficherosbinariosapuntes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class E1102 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\cancionPirata.dat"))) {
            String str = "Con diez cañones por banda,\n";
            str += "viento en popa a toda vela,\n";
            str += "no corta el mar, sino vuela\n";
            str += "un velero bergantin.";

            out.writeObject(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
