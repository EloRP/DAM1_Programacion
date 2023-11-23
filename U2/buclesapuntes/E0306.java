package buclesapuntes;

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número mayor que 0: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            System.out.println("Contando del 1 al " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }

        sc.close();
    }
}
