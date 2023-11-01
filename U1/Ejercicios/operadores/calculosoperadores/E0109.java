package calculosoperadores;

import java.util.Scanner;

public class E0109 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escribe un número entero:");
    int num = sc.nextInt();


    System.out.print("¿Es par? " + (num % 2 == 0));

    sc.close();
    }
}
