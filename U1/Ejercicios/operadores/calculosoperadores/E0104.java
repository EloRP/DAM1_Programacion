package calculosoperadores;

import java.util.Scanner;

public class E0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int anhoActual;
        anhoActual = sc.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int anhoNacimiento;
        anhoNacimiento = sc.nextInt();

        int edad = anhoActual - anhoNacimiento;

        System.out.println("Tu edad es de " + edad + " años suponiendo que ya hayas cumplido años.");
    
        sc.close();
    }
    
}
