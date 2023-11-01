package buclesparaninfos;

import java.util.Scanner;

public class EP0314 {
    /*
     * EP0314. Realiza un programa que nos pida un número n, y nos diga cuántos
     * números hay entre 1 y n que sean primos. Un número primo es aquel mayor que 1
     * y que solo es divisible por 1 y por él mismo. Veamos un ejemplo para n = 8.
     */
    public static void main(String[] args) {
        int n;
        int numPrimos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Número :");
        n = sc.nextInt();

        System.out.print("Números primos entre 1 y " + n + ": ");
        for (int i = 2; i <= n; i++){
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i  % j == 0)
                    primo = false;
            }
            if (primo)
                System.out.print(i + " ");
        }

        if (numPrimos == 0) {
            System.out.println("No se han encontrado números primos en ese intervalo.");
        } else {
            System.out.println("Hay " + numPrimos + " números primos en ese intervalo.");
        }
        sc.close();
        }
    }
