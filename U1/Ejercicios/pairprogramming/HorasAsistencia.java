// Eloy Rodal Pérez (Driver) , Gonzalo Rodríguez Aguilar (Navigator)

package pairprogramming;

import java.util.Scanner;

public class HorasAsistencia {

     public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

     final String MÓDULO = "Programación";
     final double HORASPRO = 240;
     final double MINSESPRO = HORASPRO * 60 / 50;
     final double PORCAPERC = 0.06; //6%
     final double PORCEVAL = 0.10; //10%
     double numFaltas;
     
     System.out.println("Número de sesiones de " + MÓDULO + ": " + (MINSESPRO));
     
     System.out.println("Número de faltas sin justificación de " + MÓDULO + " para recibir un apercibimiento: " + Math.round(MINSESPRO * PORCAPERC));

     System.out.println("Número de faltas sin justificación de " + MÓDULO + " para recibir la pérdida de la ev. continua: " + Math.round(MINSESPRO * PORCEVAL)); 


     System.out.println("Inserta tu número de faltas: " );
     numFaltas = sc.nextDouble();

     String j;
     j = numFaltas >= Math.round (MINSESPRO * PORCAPERC) ? "Apercibimiento":"No hay apercibimiento";
     System.out.println(j);

     String k;
     k = numFaltas >= Math.round (MINSESPRO * PORCEVAL) ? "Pérdida de ev. cont.":"No hay pérdida de ev. cont.";
     System.out.println(k);

     String l;
     l = numFaltas < 17 ? "No hay problema ☺":"";
     System.out.println(l);

     sc.close();

}
}
     
