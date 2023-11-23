package practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

// Eloy Rodal Pérez y Xabier Cendón Pazos

public class supermercado {
    public static void main(String[] args) {
        // Declarar las variables y el Scanner
        Scanner sc = new Scanner(System.in);
        boolean facturaNueva = true; // Variable para determinar si se debe crear una nueva factura

        // Siempre se va a ejecutar al menos una vez, ya que la variable facturaNueva
        // comienza siendo true
        while (facturaNueva) {
            double total = procesarFactura(sc); // Procesa una factura y obtiene el total
            System.out.printf("El importe total a pagar es: %.2f euros.%n", total); // Muestra el importe total

            int metodoPago = obtenerMetodoPago(sc); // Obtiene el método de pago

            if (metodoPago == 1) {
                pagoEnEfectivo(total, sc); // Realiza el pago si el metodo es en efectivo
            } else {
                System.out.println("Método de pago: con tarjeta"); // Si es con tarjeta no se hace nada
            }

            // Pregunta al usuario si desea realizar otra factura
            System.out.println("¿Deseas realizar otra factura de cobro? si/no");
            String compraFinalizada = sc.next();

            // Comprueba la respuesta del usuario
            while (!compraFinalizada.equals("si") && !compraFinalizada.equals("no")) {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("¿Deseas realizar otra factura de cobro? si/no");
                compraFinalizada = sc.next();
            }

            // Si la respuesta es "no," a la variable se le da el valor falso, lo que
            // termina el ciclo
            if (compraFinalizada.equals("no")) {
                facturaNueva = false;
            }
        }
        // Cerrar el Scanner
        sc.close();
    }

    public static double procesarFactura(Scanner sc) {
        // Decalaración de variables
        double precio, importe;
        int cantidad;
        double total = 0.0;
        boolean pedirPrecios = true; // Variable para determinar si se deben ingresar precios

        while (pedirPrecios) {
            try {
                // Se le pide al usuario que introduzca los precios
                System.out.print(
                        "Introduce el precio del producto (en euros con hasta 2 decimales). Introduce 0 para terminar: ");
                precio = sc.nextDouble();

                // Si se ingresa 0, le da el valor falso la variable pedriPrecios para finalizar
                // la entrada de precios
                if (precio == 0) {
                    pedirPrecios = false;
                } else {
                    // Se le pide al usuario que introduzca la cantidad del producto del precio
                    // anterior
                    System.out.print("Introduce la cantidad de unidades del producto (número entero): ");
                    cantidad = sc.nextInt();

                    // Comprueba si la cantidad y el precio son positivos
                    if (precio < 0 || cantidad < 0) {
                        System.out.println("El precio y la cantidad deben ser valores positivos.");
                    } else {
                        importe = precio * cantidad;
                        total += importe; // Se le suma al total el precio multiplicado por la cantidad del producto
                        System.out.println("Importe parcial: " + importe + " euros"); // Muestra el importe parcial
                    }
                }
                // Salta si el valor introducido en precio o en cantidad es inválido
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Asegúrate de introducir valores válidos (con , decimal).");
                sc.next(); // Vuelve a pedir un valor
            }
        }

        return total; // Devuelve el total de la factura
    }

    public static int obtenerMetodoPago(Scanner sc) {
        int metodoPago = 0;

        while (metodoPago != 1 && metodoPago != 2) {
            System.out.println("Pagar en efectivo -> 1");
            System.out.println("Pagar con tarjeta -> 2");
            metodoPago = sc.nextInt();

            if (metodoPago != 1 && metodoPago != 2) {
                System.out.println("Has introducido un método de pago incorrecto. Vuelve a introducir un valor.");
            }
        }

        return metodoPago; // Devuelve el método de pago seleccionado
    }

    public static void pagoEnEfectivo(double total, Scanner sc) {
        double importePagado;
        double cambio;

        System.out.println("Método de pago: en efectivo");
        System.out.print("Introduce el importe pagado por el cliente (en euros): ");
        importePagado = sc.nextDouble();

        // Comprueba si la cantidad dada por el usuario es suficiente o no
        while (importePagado < total) {
            System.out.println("El importe pagado es insuficiente.");
            System.out.print("Introduce el nuevo importe pagado por el cliente (en euros): ");
            importePagado = sc.nextDouble();
        }

        cambio = importePagado - total;
        System.out.println("Cambio a devolver: " + cambio + " euros");
        // Cálculo de billetes y monedas
        int euros = (int) cambio;
        int centimos = (int) ((cambio - euros) * 100);

        int billetes50 = euros / 50;
        euros %= 50;

        int billetes20 = euros / 20;
        euros %= 20;

        int billetes10 = euros / 10;
        euros %= 10;

        int billetes5 = euros / 5;
        euros %= 5;

        int monedas2 = euros / 2;
        euros %= 2;

        int monedas1 = euros;

        int monedas50 = centimos / 50;
        centimos %= 50;

        int monedas20 = centimos / 20;
        centimos %= 20;

        int monedas10 = centimos / 10;
        centimos %= 10;

        int monedas5 = centimos / 5;
        centimos %= 5;

        int monedas2cent = centimos / 2;
        centimos %= 2;

        int monedas1cent = centimos;

        // Imprime el cambio
        System.out.println("Cambio:");
        System.out.println(billetes50 + " billetes de 50 euros");
        System.out.println(billetes20 + " billetes de 20 euros");
        System.out.println(billetes10 + " billetes de 10 euros");
        System.out.println(billetes5 + " billetes de 5 euros");
        System.out.println(monedas2 + " monedas de 2 euros");
        System.out.println(monedas1 + " monedas de 1 euro");
        System.out.println(monedas50 + " monedas de 50 céntimos");
        System.out.println(monedas20 + " monedas de 20 céntimos");
        System.out.println(monedas10 + " monedas de 10 céntimos");
        System.out.println(monedas5 + " monedas de 5 céntimos");
        System.out.println(monedas2cent + " monedas de 2 céntimos");
        System.out.println(monedas1cent + " monedas de 1 céntimo");
    }
}
