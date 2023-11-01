package condicionalesapuntes;


import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una hora (0 - 23):");
        int horas = sc.nextInt();

        if (horas >= 24 || horas < 0) {
            System.out.println("Hora no válida. Revisa y asegúrate de que el valor esté entre 0 y 23.");
            sc.close();
            return;
        }
        System.out.println("Introduce una cantidad de minutos (0 - 59):");
        int minutos = sc.nextInt();
        if (minutos >= 60 || minutos < 0) {
            System.out.println("Minutos no válidos. Revisa y asegúrate de que el valor esté entre 0 y 59.");
            sc.close();
            return;
        }

        System.out.println("Introduce una cantidad de segundos (0 - 59):");
        int segundos = sc.nextInt();
        if (segundos >= 60 || segundos < 0) {
            System.out.println("Segundos no válidos. Revisa y asegúrate de que el valor esté entre 0 y 59.");
            sc.close();
            return;
        }

        segundos++;

        if (segundos >= 60) {
            segundos = 0;
            minutos++;

            if (minutos >= 60) {
                minutos = 0;
                horas++;

                if (horas >= 24) {
                    horas = 0;
                }
            }
        }

  
        System.out.print("La hora siguiente es: ");
        System.out.print(horas);
        System.out.print(":");
        System.out.print(minutos);
        System.out.print(":");
        System.out.print(segundos);
        System.out.println();

        sc.close();
    }

}
