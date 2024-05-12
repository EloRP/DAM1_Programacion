package ficherosbinariosapuntes;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.util.Arrays;

public class LectorBinario {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\datos.dat"))) {

            while (true) {
                System.out.println(Arrays.toString((double[]) (in.readObject())));
            }

        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
