package examenud04;

import java.util.Scanner;

public class RecorridoRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instrucciones;
        instrucciones = sc.nextLine();
        System.out.println(recorridoRobot(instrucciones, 0, 0));
    }

    static String[] creacionMapa() {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };

        return mapa;
    }

    static boolean recorridoRobot(String instrucciones, int xA, int yA) {
        boolean llegada = false;
        char direccion = 'U';

        for (int i = 0; i < instrucciones.length(); i++) {
            if (instrucciones.charAt(i) == 'A') {
                switch (direccion) {
                    case 'A':
                        yA--;
                        break;
                    case 'R':
                        yA++;
                        break;
                    case 'L':
                        xA++;
                        break;
                    default:
                        System.out.println("Error de input, vuelve a intentarlo.");
                        break;
                }
            } else if (instrucciones.charAt(i) == 'R') {
                switch (direccion) {
                    case 'U':
                        direccion = 'R';
                        break;
                    case 'D':
                        direccion = 'L';
                        break;
                    case 'L':
                        direccion = 'U';
                        break;
                    default:
                        System.out.println("Error de input, vuelve a intentarlo.");
                        break;
                }
            }
        }
        return llegada;
    }


}