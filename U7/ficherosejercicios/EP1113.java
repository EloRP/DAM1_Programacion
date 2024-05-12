package ficherosejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class EP1113 {
    /*
     * EP1113. Escribe un programa que lea de un fichero binario una tabla de
     * números double y
     * después muestre el contenido de la tabla por consola.
     */

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\tablaDouble.dat"))) {

            Scanner sc = new Scanner(System.in);
            double[] tablaEnteros = new double[10];

            for (int i = 0; i < tablaEnteros.length; i++) {
                tablaEnteros[i] = sc.nextDouble();
            }

            out.writeObject((double[]) tablaEnteros);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        double[] t = null;

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\tablaDouble.dat"))) {
            t = (double[]) in.readObject();
            System.out.println(Arrays.toString(t));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
