package condicionalesapuntes;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroEntero;
        int cifras = 1;

        System.out.println("Escribe un número entre el 0 y el 99999.");
        numeroEntero = sc.nextInt();
        // verificar si el número está dentro del rango

        if (numeroEntero / 10000 > 0) {
            cifras = 5;
        } else if (numeroEntero / 1000 > 0) {
            cifras = 4;
        } else if (numeroEntero / 100 > 0) {
            cifras = 3;
        } else if (numeroEntero / 10 > 0) {
            cifras = 2;
        }

        System.out.println("El número de cifras del número es de: " + cifras);

        sc.close();

    }

}
