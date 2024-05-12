package ficherosejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EP1115 {
    /*
     * EP1115. Implementa un programa que lea números enteros desde el fichero
     * numeros.dat y
     * los vaya guardando en los ficheros pares.dat e impares.dat, según su paridad.
     */
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\numeros.dat"))) {
            try (ObjectOutputStream outPares = new ObjectOutputStream(
                    new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\pares.dat"))) {
                try (ObjectOutputStream outImpares = new ObjectOutputStream(
                        new FileOutputStream("F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\impares.dat"))) {

                    int listaNumeros[] = (int[]) in.readObject();
                    for (int i = 0; i < listaNumeros.length; i++) {
                        if (listaNumeros[i] / 2 == 0) {
                            outPares.writeObject(listaNumeros[i]);
                        } else {
                            outImpares.writeObject(listaNumeros[i]);
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}