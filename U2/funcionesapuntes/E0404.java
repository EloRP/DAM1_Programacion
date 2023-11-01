package funcionesapuntes;

import java.util.Scanner;

public class E0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado = maximoNum(a, b);
        System.out.println("El número máximo entre " + a + " y " + b + " es : " + resultado);
        sc.close();

    }

    // FUNCIÓN
    static int maximoNum(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
