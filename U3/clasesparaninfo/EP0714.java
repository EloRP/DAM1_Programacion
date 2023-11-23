package clasesparaninfo;

/*
 * EP0714. Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al realizar una compra, con el menor número de monedas y billetes posibles.
 */

public class EP0714 {
    // Definición de los valores de monedas y billetes disponibles
    private static final int[] VALORES_MONEDAS_Y_BILLETES = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };

    // Método para calcular el cambio con el menor número de monedas y billetes
    // posibles
    public static void calcularCambio(double precioCompra, double dineroRecibido) {
        // Convertir los valores de dinero a centavos para evitar problemas con decimales
        int cambioCentavos = (int) Math.round((dineroRecibido - precioCompra) * 100);

        // Iterar sobre los valores de monedas y billetes
        for (int valor : VALORES_MONEDAS_Y_BILLETES) {
            // Verificar si el valor actual puede ser utilizado para el cambio
            if (cambioCentavos >= valor) {
                // Calcular la cantidad de monedas o billetes necesarios
                int cantidad = cambioCentavos / valor;

                // Imprimir la cantidad de monedas o billetes necesarios
                System.out.println("Billetes/Monedas de " + valor + ": " + cantidad);

                // Actualizar el cambio restante
                cambioCentavos %= valor;
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double precioCompra = 78.50;
        double dineroRecibido = 100.0;

        System.out.println("Cambio:");
        // Calcular e imprimir el cambio
        calcularCambio(precioCompra, dineroRecibido);
    }
}