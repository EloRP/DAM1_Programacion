package practicas;

/* Diseñar un programa que simule el lanzamiento de un dado de 6 caras un
número de veces codificado como una constante NUM_LANZAMIENTOS.
El programa mostrará una estadística final que recoja el número de veces que ha salido
cada cara del dado y el porcentaje sobre el total de lanzamientos.
El porcentaje se mostrará como un número entero
o como un número real con un máximo de 2 decimales,
con una salida por pantalla similar a la siguiente:
 */
public class Dado {
    public static void main(String[] args) {
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;
        final int NUM_LANZAMIENTOS = 1000;

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int resultado = (int) (Math.random() * 6) + 1;
            switch (resultado) {
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
                    break;
            }
        }

        System.out.println("LANZANDO UN DADO " + NUM_LANZAMIENTOS + " VECES:");
        System.out.println("RESULTADOS:");
        mostrarResultado(1, cara1, NUM_LANZAMIENTOS);
        mostrarResultado(2, cara2, NUM_LANZAMIENTOS);
        mostrarResultado(3, cara3, NUM_LANZAMIENTOS);
        mostrarResultado(4, cara4, NUM_LANZAMIENTOS);
        mostrarResultado(5, cara5, NUM_LANZAMIENTOS);
        mostrarResultado(6, cara6, NUM_LANZAMIENTOS);
    }

    public static void mostrarResultado(int cara, int contador, int totalLanzamientos) {
        double porcentaje = (contador * 100.0) / totalLanzamientos;
        System.out
                .println("Ha salido " + cara + ": " + contador + " veces (" + String.format("%.1f", porcentaje) + "%)");
    }
}