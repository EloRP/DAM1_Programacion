package examenud01;

import java.util.Scanner;

public class CajeroAutomatico {
    
    public static void main(String[] args) {
        
        int importe;
        final int BILLETE_50 = 50;
        final int BILLETE_20 = 20;
        final int BILLETE_10 = 10;
        final int BILLETE_5 = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Importe en efectivo que desea retirar (€)");
        importe = sc.nextInt();

        int importeRetirado = importe - importe % BILLETE_5;
        System.out.println("Se retirarán " + importeRetirado + " €");

        int billetes50 = importe / BILLETE_50;
        System.out.println(billetes50 != 0 ? billetes50 + "billetes de 50 €\n" : "");
        
        int billetes20 = importe % BILLETE_20 / BILLETE_10;
        System.out.println(billetes20 != 0 ? billetes20 + "billetes de 20 €\n" : "");
    
        int billetes10 = importe % BILLETE_20 / BILLETE_10;
        importe = importe % BILLETE_10;
        System.out.println(billetes10 != 0 ? billetes10 + " billetes de 10 €\n" : "");
        
        
    
    
    
    
    
        sc.close();
    }
}
