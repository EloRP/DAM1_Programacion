package condicionalesparaninfo;

/* EP0319. Calcula la raíz cuadrada de un número natural mediante aproximaciones.
En el caso de que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada de 23,
probamos 12 = 1, 22 = 4, 32 = 9, 42 = 16, 52 = 25 (nos pasamos), resultando 4 la raiz cuadrada de 23
con un resto (23 - 16) de 7. */

import java.util.Scanner;

public class EP0219 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grados, radianes;
        final int GRADOSCOMPLETO = 360;
        final double RADIANESCOMPLETO = 2 * Math.PI;
        final double GRADOSARADIANES = RADIANESCOMPLETO / GRADOSCOMPLETO / Math.PI;

        System.out.println("Introduce los grados que quieras pasar a radianes:");
        grados = sc.nextDouble();

        if (grados > GRADOSCOMPLETO)
            grados = grados % GRADOSCOMPLETO;

        radianes = grados * GRADOSARADIANES;

        sc.close();

        System.out.printf("%.2f grados equivalen a %.2fπ radianes.", grados, radianes);
    }
}
