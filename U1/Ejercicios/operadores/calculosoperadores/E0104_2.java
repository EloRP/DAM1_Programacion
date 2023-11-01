package calculosoperadores;

    
import java.time.LocalDate;
import java.util.Scanner;

public class E0104_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anhoActual = 0;
        
       anhoActual = LocalDate.now().getYear();      // esta variante de E0104 emplea LocalDate.now().getYear, un plugin de la API, para sacar el año actual.

        System.out.print(" Introduce tu año de nacimiento: ");
        int anhoNacimiento;
        anhoNacimiento = sc.nextInt();

        int edad = anhoActual - anhoNacimiento;

        System.out.println("Tu edad es de " + edad + " años suponiendo que ya hayas cumplido años.");
    
        sc.close();
    }
    
}

    

