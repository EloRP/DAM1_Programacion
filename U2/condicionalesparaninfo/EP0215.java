package condicionalesparaninfo;

/* EP0215. Escribe una aplicación que solicite por consola dos números reales que
corresponden a la base y la altura de un triángulo. Deberá mostrarse su área,
comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido.
*/

import java.util.Scanner;

public class EP0215 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Introduce la medida de la base del triángulo: ");
        base = sc.nextDouble();
        System.out.println("Introduce la medida de la altura del triángulo: ");
        altura = sc.nextDouble();
        sc.close();
        if (base > 0 && altura > 0) {
            area = base * altura / 2;
            System.out.printf("El área del triángulo es de: %.2f", area + "metros cuadrados");
        } else {
            System.out.println("El área del triángulo es incalculable. Revisa tus medidas.");
        }
    }
}
