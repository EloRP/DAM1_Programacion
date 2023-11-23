package buclesparaninfo;

/* EP0318. De forma similar a la actividad anterior (EP0317), implementa un algoritmo que calcule el minimo común múltiplo de dos números dados. */
import java.util.Scanner;

public class EP0318 {

    public static void main(String[] args) {
        int a, b, multiplo, mcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros positivos: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        if (a > b) {
            multiplo = a;
        } else {
            multiplo = b;
        }
        while (mcm != multiplo) {
            if (multiplo % a == 0 && multiplo % b == 0) {
                mcm = multiplo;
            } else {
                multiplo += 1;
            }
        }
        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
    }
}
