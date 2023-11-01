// Eloy Rodal Pérez (Driver) , Gonzalo Rodríguez Aguilar (Navigator)
/* 1 hectárea = 100 x 100 m = 10000 m^2 , 1 campo de fútbol = 105 x 70 m = 7350 m^2,  1 cancha de baloncesto = 28 x 15 m = 420 m^2,
1 pista de tenis (dobles) = 23,77 x 10.97 m = 260.7569 m^2, Parque retiro = 125 hectáreas = 125000 m^2*/

package pairprogramming;

import java.util.Scanner;

public class UnidadesMedida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double M2_CAMPO_FUT = 7350.0;
        final double M2_CANCHA_BASK = 420;
        final double M2_PISTA_TEN = 260.7569;
        final double M2_PARQ_RET = 1250000;
        double numHect;

        System.out.print("Introduce el número de hectáreas: ");
        numHect = sc.nextDouble();

        double m2Hect = numHect * 10000.0;

        double hectFut = m2Hect / M2_CAMPO_FUT;

        System.out.println("El número de campos de fútbol al que equivalen las hectáreas es de: " + Math.round(hectFut));

        double hectBask = m2Hect / M2_CANCHA_BASK;

        System.out.println("El número de canchas de basket a las que equivalen las hectáreas es de: " + Math.round(hectBask));

        double hectTen = m2Hect / M2_PISTA_TEN;

        System.out.println("El número de pistas de tenis a las que equivalen las hectáreas es de: " + Math.round(hectTen));

        double hectParRet = M2_PARQ_RET / M2_CAMPO_FUT;

        System.out.println("El número de campos de fútbol al que equivale el Parque del Retiro es de: " + Math.round(hectParRet));
        sc.close();
    }

}

    

