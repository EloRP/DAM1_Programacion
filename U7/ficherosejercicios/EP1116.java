package ficherosejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EP1116 {
    /*
     * EP1116. Implementa una aplicación que gestione una lista de nombres ordenada
     * por orden
     * alfabético. Al arrancar se leerá de un fichero los nombres insertados
     * anteriormente y se
     * pedirán nombres nuevos hasta que se introduzca la cadena "fin”. Cada nombre
     * que se
     * introduzca deberá añadirse a los que ya había, de forma que la lista
     * permanezca ordenada.
     * Al terminar se guardará en el fichero la lista actualizada.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaOrdenada = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("U7\\ficherosejercicios\\listaOrdenadaNombres.dat"))) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("U7\\ficherosejercicios\\listaOrdenadaNombres.dat"))) {

                listaOrdenada = (List<String>) in.readObject();

                String input = sc.nextLine();

                while (!input.equals("fin")) {
                    listaOrdenada.add(input);
                    input = sc.nextLine();
                }
                listaOrdenada.sort(new Comparator<String>() {

                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                });
                out.writeObject(listaOrdenada);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}