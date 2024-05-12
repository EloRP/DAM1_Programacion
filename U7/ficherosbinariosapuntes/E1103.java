package ficherosbinariosapuntes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class E1103 {

    /*
     * @author Eloy Rodal Pérez
     * E1103. Pedir un entero n por consola y, a continuación, pedir n números de
     * tipo double,
     * que iremos insertando en una tabla. Guardar la tabla en un archivo binario.
     */

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\datos.dat"))) {
            
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
    }
}
