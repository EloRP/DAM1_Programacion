/*Eloy Rodal Pérez DAM1 5-10-2023 */

package examenud01;

import java.util.Scanner;

public class NumerosOrdenados {

    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 números (pulsa ENTER después de cada uno): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Resultado");

        boolean ordenadosMenorMayor= a <= b && b <= c;
        boolean ordenadosMayorMenor = a >= b && b >= c;
        
        System.out.println(ordenadosMenorMayor ? "Ordenados de menor a mayor\n" : "");
        System.out.println(ordenadosMayorMenor ? "Ordenados de mayor a menor\n" : "");
        System.out.println(!ordenadosMenorMayor && !ordenadosMayorMenor ? "Números desordenados\n" : "");
    
        sc.close();
    
    }
}

