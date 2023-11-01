package condicionalesapuntes;


import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {

        double precio;
        int unidades;
        double precioSinIva;
        double iva;
        double precioConIva;
        double precioFinal;
        final double IVA = 0.21;
        final double UMBRAL_DESCUENTO = 100;
        final double DESCUENTO = 0.05;

        // Introducción de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Ahora introduce el número de unidades: ");
        unidades = sc.nextInt();
        sc.close();

        // Cálculos
        precioSinIva = precio * unidades;
        iva = precioSinIva * IVA;
        precioConIva = precioSinIva + iva;

        if (precioConIva > UMBRAL_DESCUENTO) {
            double descuento = precioConIva * DESCUENTO;
            precioFinal = precioConIva - descuento;
            System.out.println("Se aplica el descuento, y el precio total es de: " + (precioFinal) + " euros");

        } else {

            System.out.println("No se aplica el descuento, y el precio total es de: " + (precioConIva) + " euros");

        }
    }
}
