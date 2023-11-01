package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class RaizCuadradaHoras {
    public static void main(String[] args) {
        int numero = 25;

        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
        
        System.out.println("La hora del sistema es: " + LocalTime.now());

        System.out.println("La fecha del sistema es: " + LocalDate.now());

        System.out.println("La fecha y hora del sistema es: " + LocalDateTime.now());
        
        sc.close();
    }
}
