package condicionalesapuntes;

import java.util.Scanner;

public class E0205 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        if (num1 >= num2) {
            System.out.println("Los números, en orden decreciente, son: " + num1 + " y " + num2);
        } else {
            System.out.println("Los números, en orden decreciente, son: " + num2 + " y " + num1);
        }
    }
}
