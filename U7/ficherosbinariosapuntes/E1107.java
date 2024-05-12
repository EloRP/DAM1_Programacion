package ficherosbinariosapuntes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class E1107 {
    /* @author Eloy Rodal Pérez
     * E1107. Grabar en el fichero numeros.dat una serie de números enteros no
     * negativos
     * introducidos por teclado. La serie acabará cuando escribamos -1. Abrir de
     * nuevo
     * numeros.dat para lectura y leer todos los números hasta el final del fichero,
     * mostrándolos
     * por pantalla y copiándolos en un segundo fichero numerosCopia.dat.
     */

    public static void main(String[] args) {
        // Grabar en el fichero numeros.dat una serie de números enteros no negativos
        // introducidos por teclado. La serie acabará cuando escribamos -1.
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\numeros.dat"))) {
            Scanner sc = new Scanner(System.in);
            int num;
            do {
                num = sc.nextInt();
                if (num != -1) {
                    out.writeInt(num);
                }
            } while (num != -1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Abrir de nuevo numeros.dat para lectura y leer todos los números hasta el
        // final del fichero,
        // mostrándolos por pantalla y copiándolos en un segundo fichero numerosCopia.dat.
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\numeros.dat"));
                ObjectOutputStream out = new ObjectOutputStream(
                        new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\numerosCopia.dat"))) {
            while (true) {
                int num = in.readInt();
                System.out.println(num);
                out.writeInt(num);
            }
        } catch (EOFException ex) {
            System.out.println("Leyendo... Excepción fin de fichero");
        } catch (FileNotFoundException ex) {
            System.out.println("Leyendo... Error No se encuentra el fichero");
        } catch (IOException ex) {
            System.out.println("Leyendo... Error Entrada/Salida");
        }
    }
}
