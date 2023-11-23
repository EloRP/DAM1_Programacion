package funcionesparaninfo;

public class EP0412 {

    /*
     * EP0412. Implementa la función
     *
     * static double distancia (double x1, double y1, double x2, double y2)
     *
     * que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y
     * (x2, y2). La fórmula para calcular esta distancia es:
     *
     * distancia = (x1 - x2)² + (y1 - y2)²
     */
    public static void main(String[] args) {
        double x1 = 2;
        double y1 = 3;
        double x2 = 5;
        double y2 = 7;

        double distancia = distanciaentrepuntos(x1, y1, x2, y2);
        System.out.println("La distancia entre los puntos es de: " + distancia);
    }

    static double distanciaentrepuntos(double x1, double y1, double x2, double y2) {
        double distanciaX = x1 - x2;
        double distanciaY = y1 - y2;
        double distanciaCuadrada = distanciaX * distanciaX + distanciaY * distanciaY;
        double distancia = Math.sqrt(distanciaCuadrada);
        return distancia;
    }
}
