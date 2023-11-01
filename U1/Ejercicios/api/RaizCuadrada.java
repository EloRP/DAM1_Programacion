package api;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        try (Scanner in = new Scanner(System.in)) {
     System.out.print("Escribe el num. cuya sqrt quieras conocer: ");
        int numero = in.nextInt();
        double raiz = Math.sqrt(numero);
     System.out.println ("La sqrt de "+ numero +" es "+ raiz +"");
        }

      sc.close();


    }
    
}