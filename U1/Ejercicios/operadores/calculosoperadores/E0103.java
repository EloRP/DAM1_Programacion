package calculosoperadores;

import java.util.Scanner;

public class E0103 {
     ;
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          byte edad;

          System.out.print("¿Cuántos años tienes?");

          edad = sc.nextByte();

          byte año = 1;
          int nueva_edad = (edad + año);
          System.out.println("Si tienes " + edad + " años, entonces el año que viene tendrás " + nueva_edad);

          sc.close();
     }
}
