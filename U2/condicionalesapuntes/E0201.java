package condicionalesapuntes;

import java.util.Scanner;

public class E0201 {

    public static void main(String[] args) {
        // E0201. Diseña una aplicación que solicite un número al usuario e indique si
        // es par o impar.

        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El número es par. ");
        } else {
            System.out.println("El número es impar.");
        }
        sc.close();
    }
}
