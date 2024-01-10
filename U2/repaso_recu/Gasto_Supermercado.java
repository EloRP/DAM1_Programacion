package repaso_recu;

import java.util.Scanner;

public class Gasto_Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        System.out.print("Introduce el tipo de producto (0 = Alimentación, 1 = Higiene, 2 = Limpieza): ");
        byte tipoProducto = scanner.nextByte();

        double totalGasto = calcularGasto(cantidad, tipoProducto);

        System.out.println("El gasto total es: " + totalGasto + " €");

        scanner.close();

    }

    static double calcularGasto(int cantidad, byte tipoProducto) {
        double precioPorUnidad = 0;
        switch (tipoProducto) {
            case 0:
                precioPorUnidad = 1.5;
                break;
            case 1:
                precioPorUnidad = 1.5;
                break;
            case 2:
                precioPorUnidad = 2;
                break;
            default:
                break;
        }
        double precioTotal = precioPorUnidad * cantidad;
        return precioTotal;

    }
}
