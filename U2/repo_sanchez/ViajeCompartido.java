package repo_sanchez;

import java.util.Scanner;

public class ViajeCompartido {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        double precioPlaza = 0;
        String origen = "";
        String destino = "";
        double distancia = 0;
        int plazas = 0;
        byte tipoCombustible = 3;
        double consumoMedio = 0;
        boolean indicador = true;
        // Comprobar los datos introducidos globalmente
        while (indicador) {
            try {
                System.out.println("Introduce el origen del viaje");
                origen = sc.nextLine();
                System.out.println("Introduce el destino del viaje");
                destino = sc.nextLine();
                // Comprobar que se introduce bien distancia
                while (distancia < 1) {
                    System.out.println("Introduce la distancia en km del viaje");
                    distancia = sc.nextDouble();
                    if (distancia < 1) {
                        System.out.println("Has introducido datos fuera de rango ya que tiene que ser mayor o igual a 1");
                    }
                }
                // Comprobar que se introduce bien plazas
                while (plazas < 1 || plazas > 4) {
                    System.out.println("Introduce el numero de plazas del viaje");
                    plazas = sc.nextInt();
                    if (plazas < 1 || plazas > 4) {
                        System.out.println(
                                "Has introducido datos fuera de rango ya que tiene que ser mayor o igual a 1 y menor o igual a 4");
                    }
                }
                // Comprobar que se introduce bien tipoCombustible
                while (tipoCombustible != 0 && tipoCombustible != 1 && tipoCombustible != 2) {
                    System.out.println("Introduce el tipo de conbustible (0 = Gasolina, 1 = Diesel, 2 = Electricidad)");
                    tipoCombustible = sc.nextByte();
                    if (tipoCombustible != 0 && tipoCombustible != 1 && tipoCombustible != 2) {
                        System.out.println(
                                "Has introducido datos erroneos ya que solo puede ser 0, 1 y 2");
                    }
                }

                System.out.println("Introduce el consumo medio del vehículo");
                consumoMedio = sc.nextDouble();
                indicador = false;
            } catch (Exception e) {
                System.out.println("Introduciste datos del tipo erroneo vuelve a introducirlos");
            }
        }

        double costeViaje = CosteViaje.costeViaje(distancia, tipoCombustible, consumoMedio);

        System.out.println("=============================");
        System.out.println("El precio del viaje " + origen + "-" + destino + " sera " + String.format("%.2f", costeViaje) + " euros");
        System.out.println("=============================");
        // Comprobar que se introduce bien el precio por plaza
        while (precioPlaza <= 0 || precioPlaza > 0.05 * distancia) {
            System.out.println(
                    "Dime el precio por plaza contando que el máximo es: " + String.format("%.2f", 0.05 * distancia));
            precioPlaza = sc.nextDouble();
            if (precioPlaza <= 0 || precioPlaza > 0.05 * distancia) {
                System.out.println("El ingreso por plaza es incorrecto, vuelve a introducirlo");
            }
        }

        System.out.println("El conductor ingresara " + (precioPlaza * plazas) + " euros");
        sc.close();
    }

}