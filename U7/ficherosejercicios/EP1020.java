package ficherosejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EP1020 {
    /* @author Eloy Rodal Pérez
     * EP1020. Algunos sistemas operativos disponen de la orden comp, que compara
     * dos archivos y nos dice si son iguales o distintos. Diseña esta orden de
     * forma que, además, nos diga en qué línea y carácter se encuentra la primera
     * diferencia. Utiliza los ficheros texto1.txt y texto2.txt.
     */

    public static void main(String[] args) {
        String fileName1 = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\texto1.txt";
        String fileName2 = "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\texto2.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
                BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {

            String line1 = " ";
            String line2 = " ";
            int numLinea = 0;
            int numCaracter = 0;
            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                numLinea++;
                for (int i = 0; i < line1.length(); i++) {
                    numCaracter++;
                    if (line1.charAt(i) != line2.charAt(i)) {
                        System.out.println(
                                "Los archivos son distintos en la línea " + numLinea + " y el carácter " + numCaracter);
                        return;
                    }
                }
                System.out.println("Los archivos son iguales");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
