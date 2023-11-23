package buclesejercicios;

/*NumerosEnTexto. Adapta el ejercicio propuesto EP0214 para imprimir por pantalla los todos los números del 1 al 99 en formato en formato numérico y en formato texto. Por ejemplo:

…
89. ochenta y nueve
…
*/

import java.util.Scanner;

public class NumerosEnTexto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Los números del 1 al 99 escritos en formato numérico y textual:");

        for (int numero = 1; numero <= 99; numero++) {
            System.out.print(numero + ". ");
            if (numero >= 10 && numero <= 19) {
                switch (numero) {
                    case 10:
                        System.out.println("Diez");
                        break;
                    case 11:
                        System.out.println("Once");
                        break;
                    case 12:
                        System.out.println("Doce");
                        break;
                    case 13:
                        System.out.println("Trece");
                        break;
                    case 14:
                        System.out.println("Catorce");
                        break;
                    case 15:
                        System.out.println("Quince");
                        break;
                    default:
                        int unidad = numero % 10;
                        System.out.print("Dieci");
                        if (unidad == 1) {
                            System.out.println("uno");
                        } else if (unidad == 2) {
                            System.out.println("dos");
                        } else if (unidad == 3) {
                            System.out.println("tres");
                        } else if (unidad == 4) {
                            System.out.println("cuatro");
                        } else if (unidad == 5) {
                            System.out.println("cinco");
                        } else if (unidad == 6) {
                            System.out.println("seis");
                        } else if (unidad == 7) {
                            System.out.println("siete");
                        } else if (unidad == 8) {
                            System.out.println("ocho");
                        } else if (unidad == 9) {
                            System.out.println("nueve");
                        }
                        break;
                }
            } else {
                int decena = numero / 10;
                int unidad = numero % 10;

                switch (decena) {
                    case 2:
                        System.out.print("Veinti");
                        break;
                    case 3:
                        System.out.print("Treinta");
                        break;
                    case 4:
                        System.out.print("Cuarenta");
                        break;
                    case 5:
                        System.out.print("Cincuenta");
                        break;
                    case 6:
                        System.out.print("Sesenta");
                        break;
                    case 7:
                        System.out.print("Setenta");
                        break;
                    case 8:
                        System.out.print("Ochenta");
                        break;
                    case 9:
                        System.out.print("Noventa");
                        break;
                }

                if (unidad > 0) {
                    System.out.print(" y ");
                    switch (unidad) {
                        case 1:
                            System.out.println("uno");
                            break;
                        case 2:
                            System.out.println("dos");
                            break;
                        case 3:
                            System.out.println("tres");
                            break;
                        case 4:
                            System.out.println("cuatro");
                            break;
                        case 5:
                            System.out.println("cinco");
                            break;
                        case 6:
                            System.out.println("seis");
                            break;
                        case 7:
                            System.out.println("siete");
                            break;
                        case 8:
                            System.out.println("ocho");
                            break;
                        case 9:
                            System.out.println("nueve");
                            break;
                    }
                } else {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}
