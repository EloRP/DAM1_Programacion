package ficherosbinariosapuntes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class E1108 {
    /*
     * E1108. Implementar un programa que guarde en el fichero socios.dat una tabla
     * de objetos
     * Socio. Después se abrirá de nuevo el fichero en modo lectura para recuperar
     * la tabla de
     * socios, mostrándose por pantalla.
     */
    public static void main(String[] args) {
        Socio[] socios = {
                new Socio(1, "Juan", "Calle Chan do Monte", "01/01/2021"),
                new Socio(2, "Ana", "Calle Marín", "01/01/2022"),
                new Socio(3, "Luis", "Calle Vigo", "01/01/2023"),
        };

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\socios.dat"))) {
            out.writeByte(3);
            out.writeObject(socios);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\socios.dat"))) {
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
