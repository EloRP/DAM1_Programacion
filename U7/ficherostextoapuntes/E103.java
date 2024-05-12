package ficherostextoapuntes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class E103 {

    /*
     * @author Eloy Rodal Pérez
     * Crea con un editor el fichero de texto Jugadores.txt y escribe en él los
     * nombres, edades y
     * estaturas de los jugadores de un equipo, cada uno en una línea.
     * juan 22 1.77
     * luis 22 1.80
     * pedro 20 1.73
     * …
     * Implementa un programa que lea del fichero los datos, y genere e imprima una
     * lista de objetos de tipo Jugador, calcule la media de la edad y de las
     * estaturas.
     */

    public static void main(String[] args) {
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream(
                    "F:\\eloy_rodalperez\\Programación\\Unidades\\U7\\ficherostextoapuntes\\Jugadores.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El sistema no ha sido capaz de encontrar el fichero. Asegúrate de que existe.");
        }

        try {
            if (flujo != null) {
                Scanner sc = new Scanner(flujo).useLocale(Locale.US);
                int sumaEdad = 0;
                double sumaEstatura = 0;
                double cont = 0;
                ArrayList<Jugador> listaJugadores = new ArrayList<>();

                while (sc.hasNext()) {
                    String nombre = sc.next();
                    int edad = sc.nextInt();
                    double estatura = sc.nextDouble();
                    sumaEdad += edad;
                    sumaEstatura += estatura;
                    cont++;
                    System.out.println(nombre + " " + edad + " " + estatura);
                    listaJugadores.add(new E103().new Jugador(nombre, edad, estatura));
                }
                double mediaEstatura = (sumaEstatura / cont);
                double mediaEdad = ((double) sumaEdad / cont);

                System.out.println();
                System.out.println("Suma de edades :" + sumaEdad);
                System.out.printf("Suma de estaturas: %.2f %n", sumaEstatura);
                System.out.printf("Media de edad: %.2f %n", mediaEdad);
                System.out.printf("Media de estaturas: %.2f%n", mediaEstatura);
                if (listaJugadores.size() > 0) {
                    System.out.println("Lista de jugadores:" + listaJugadores);
                } else {
                    System.out.println("No hay jugadores para listar.");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Bonito");
        }

    }

    class Jugador {
        String nombre;
        int edad;
        double estatura;

        public Jugador(String nombre, int edad, double estatura) {
            this.nombre = nombre;
            this.edad = edad;
            this.estatura = estatura;
        }

        @Override
        public String toString() {
            return nombre;
        }

    }
}
