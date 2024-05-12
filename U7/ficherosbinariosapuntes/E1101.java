package ficherosbinariosapuntes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E1101 {

    public static void main(String[] args) {
        // Escribe 10 números enteros en un fichero binario
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            for (int i = 0; i < 10; i++) {
                out.writeInt(i);
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Escribiendo... Error Entrada/Salida");
        }
    }
}