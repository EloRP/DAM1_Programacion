package examenud02_CORREGIDO;

import java.util.Scanner;

public class ViajeCompartido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //preguntas misceláneas del programa.
        System.out.println("Introduce el lugar de salida del viaje.");
        String salida = sc.nextLine();
        System.out.println("Introduce el destino del viaje.");
        String destino = sc.nextLine();
        //datos relevantes del programa.
        System.out.println("¿Cuántos kilómetros vas a recorrer en este viaje?");
        double km = sc.nextDouble();
        System.out.println("¿Cuántas plazas tiene el coche? (entre 1 y 4)");
        byte plazas = sc.nextByte();
        System.out.println("¿Qué tipo de combustible usas? (0 = Gasolina, 1 = Diesel, 2 = Electricidad)");
        byte tipoCombustible = sc.nextByte();
        System.out.println("¿Cuál es el consumo medio de tu vehículo? (Litros de combustible o kWh de electricidad)");
        double consumoMedio = sc.nextDouble();
        System.out.println("El viaje desde " + salida + " con destino " + destino + " , que recorre " + km + " km, con "
                + plazas + " pasajeros costará: " + costeViaje(km, tipoCombustible, consumoMedio) + "euros.");
        sc.close();
    }

    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        final double PRECIO_LITRO_GASOLINA = 1.638;
        final double PRECIO_LITRO_DIESEL = 1.638;
        final double PRECIO_KWH = 0.1692;
        
        double costeViaje = -1;
        double consumo = km * consumoMedio / 100;
        switch (tipoCombustible) {
            case 0: costeViaje = consumo * PRECIO_LITRO_GASOLINA;
            case 1: costeViaje = consumo * PRECIO_LITRO_DIESEL;
            case 2: costeViaje = consumo * PRECIO_KWH;
        }
        return costeViaje;

}
}

/*
        if (tipoCombustible == 0) {
            precioCombustible = 1.638;
        } else if (tipoCombustible == 1) {
            precioCombustible = 1.638;
        } else if (tipoCombustible == 2) {
            precioCombustible = 0.1692; */