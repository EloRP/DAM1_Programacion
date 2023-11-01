package calculosoperadores;


import java.util.Scanner;

public class CalculoBeneficios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita las ventas de manzanas para cada semestre y almacena los valores.
        System.out.print("Ventas de manzanas en el primer semestre (en kilos): ");
        double ventasManzanasSemestre1 = sc.nextDouble();

        System.out.print("Ventas de manzanas en el segundo semestre (en kilos): ");
        double ventasManzanasSemestre2 = sc.nextDouble();

        // Solicita las ventas de peras para cada semestre y almacena los valores.
        System.out.print("Ventas de peras en el primer semestre (en kilos): ");
        double ventasPerasSemestre1 = sc.nextDouble();

        System.out.print("Ventas de peras en el segundo semestre (en kilos): ");
        double ventasPerasSemestre2 = sc.nextDouble();

        // Define los precios por kilo de manzanas y peras.
        double precioManzanasPorKilo = 2.35;
        double precioPerasPorKilo = 1.95;

        // Calcula el importe total de ventas para cada fruta y para todo el año.
        double importeVentasManzanas = (ventasManzanasSemestre1 + ventasManzanasSemestre2) * precioManzanasPorKilo;
        double importeVentasPeras = (ventasPerasSemestre1 + ventasPerasSemestre2) * precioPerasPorKilo;
        double importeTotalAnual = importeVentasManzanas + importeVentasPeras;

        // Muestra los resultados.
        System.out.println("Importe total de ventas de manzanas: " + importeVentasManzanas + " €");
        System.out.println("Importe total de ventas de peras: " + importeVentasPeras + " €");
        System.out.println("Importe total de ventas anuales: " + importeTotalAnual + " €");

        sc.close();
    }
}
