package condicionalesapuntes;


import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {

        // solicitar día de la semana

        int díaSemana;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número equivalente a un día de la semana (de 1 a 7)");
        díaSemana = sc.nextInt();
        sc.close();

        switch (díaSemana) {
            case 1:
                System.out.println("El día 1 de la semana es lunes.");
                break;
            case 2:
                System.out.println("El día 2 de la semana es martes.");
                break;
            case 3:
                System.out.println("El día 3 de la semana es miércoles.");
                break;
            case 4:
                System.out.println("El día 4 de la semana es jueves.");
                break;
            case 5:
                System.out.println("El día 5 de la semana es viernes.");
                break;
            case 6:
                System.out.println("El día 6 de la semana es sábado");
                break;
            case 7:
                System.out.println("El día 7 de la semana es domingo.");
                break;
            default:
                System.out.println("El valor de los números debe ser de 1 a 7.");
        }
    }
}
