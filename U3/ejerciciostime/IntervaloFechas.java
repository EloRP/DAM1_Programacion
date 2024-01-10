package ejerciciostime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IntervaloFechas {

public static void main(String[] args) {
// Crear un objeto Scanner para la entrada del usuario
Scanner scanner = new Scanner(System.in);

// Solicitar la primera fecha al usuario
System.out.print("Ingrese la primera fecha (AAAA-MM-DD): ");
String fechaStr1 = scanner.next();
LocalDate fecha1 = LocalDate.parse(fechaStr1);

// Solicitar la segunda fecha al usuario
System.out.print("Ingrese la segunda fecha (AAAA-MM-DD): ");
String fechaStr2 = scanner.next();
LocalDate fecha2 = LocalDate.parse(fechaStr2);

// Calcular el período entre las dos fechas
Period periodo = Period.between(fecha1, fecha2);

// Mostrar el resultado
System.out.println("\nResultado:");
System.out.println("Días: " + periodo.getDays());
System.out.println("Meses: " + periodo.getMonths());
System.out.println("Años: " + periodo.getYears());

// Cerrar el Scanner
scanner.close();
}
}