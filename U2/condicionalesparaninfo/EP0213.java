package condicionalesparaninfo;

/* EP0213. En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
El número de animales que alimentar (todos de la misma especie) es numAnimales,
y sabemos que cada animal come una media de kilosPorAnimal.

Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero.
 */

import java.util.Scanner;

public class EP0213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de comida diaria (en kilos).");
        double comidaDiaria = sc.nextDouble();

        System.out.println("Introduce el número de animales: ");
        double numAnimales = sc.nextDouble();

        System.out.println("Introduce la cantidad de kilos de comida por animal.");
        double kilosComidaAnimal = sc.nextDouble();
        sc.close();

        if (kilosComidaAnimal <= 0) {
        } else {
            double comidaPorAnimal = comidaDiaria / numAnimales;

            if (comidaPorAnimal >= kilosComidaAnimal) {
                System.out.println("Hay suficiente comida para todos los animales.");
            } else {
                System.out.println("No hay suficiente comida para todos los animales.");
                System.out.println("La ración de comida por animal es de " + comidaPorAnimal + "kilos.");
            }
        }
    }
}