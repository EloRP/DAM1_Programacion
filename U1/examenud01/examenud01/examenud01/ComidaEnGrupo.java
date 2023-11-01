/*Eloy Rodal Pérez DAM1 5-10-2023 */

package examenud01;

import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* sc.useLocale(Locale.US); */

        System.out.println("Escribe aquí el número de comensales");
        double numComensales = sc.nextDouble();

        System.out.println("Y aquí el importe de la comida");
        float importeComida = sc.nextFloat();

        double importePorPersona = importeComida / numComensales;
        
        /* DecimalFormat df = new DecimalFormat(pattern:null, symbols:null) */

        System.out.println("Número de personas: " + numComensales);
        System.out.println("Importe total de la comida (euros): " + importeComida);
        System.out.println("Cantidad total a pagar por comensal: " + (importePorPersona) + " euros");
                                                                      /* df.format(importePorPersona)); */
        sc.close();
    }
}
