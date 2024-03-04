package arraysapuntes;

import java.util.Scanner;

public class E0502 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeros[] = new double[5];

        System.out.println("Introduce 5 números reales:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        for (double num : numeros) {
            System.out.println(num);
        }
    }
}
