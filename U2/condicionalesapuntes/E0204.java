package condicionalesapuntes;

import java.util.Scanner;

public class E0204 {

    // Implementar un programa que pida por teclado un número decimal e indique si
    // es un número casi-cero, que son aquellos, positivos o negativos, que se
    // acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera
    // un número casi-cero. Ejemplos de números casi-cero son el 0,3, el -0,99 o el
    // 0,123; algunos números que no se consideran casi-ceros son: el 12,3, el 0 o
    // el -1.
    public static void main(String[] args) {

        System.out.println("Escribe un número decimal. ");
        double numDecimal;
        Scanner sc = new Scanner(System.in);
        numDecimal = sc.nextDouble();
        sc.close();
        if (numDecimal < 1 && numDecimal != 0) {
            System.out.println("Se trata de un número casi-cero.");
        } else {
            System.out.println("No es un número casi-cero.");
        }
    }
}
