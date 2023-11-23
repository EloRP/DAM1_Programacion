package clasesparaninfo;

/*
 * EP0716. Escribe la clase Punto que representa un punto en el plano (con un componente x y un componente y), con los métodos:
*Punto(double x, double y): construye un objeto con los datos pasados como parámetros.
*void desplazaX(double dx): incrementa el componente x en la cantidad dx..
*void desplazaY(double dy): incrementa el componente y en la cantidad dy.
*void desplaza(double dx, double dy): desplaza ambos componentes según las cantidades dx (en el eje x) y dy (en el componente y).
*double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclidea entre el punto invocante y el punto otro.
*void muestra(): muestra por consola la información relativa al punto. Ejemplo: (1.5, 4.6)
 */

public class EP0716 {
    private double x;
    private double y;

    // Constructor
    public EP0716(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar el componente x en la cantidad dx
    public void desplazaX(double dx) {
        x += dx;
    }

    // Método para desplazar el componente y en la cantidad dy
    public void desplazaY(double dy) {
        y += dy;
    }

    // Método para desplazar ambos componentes según las cantidades dx y dy
    public void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // Método para calcular la distancia euclidiana entre dos puntos
    public double distanciaEuclidea(EP0716 otro) {
        double distanciaX = otro.x - this.x;
        double distanciaY = otro.y - this.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    // Método para mostrar la información relativa al punto
    public void muestra() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        EP0716 punto1 = new EP0716(1.5, 4.6);
        punto1.muestra();

        punto1.desplazaX(2.0);
        punto1.muestra();

        punto1.desplazaY(-1.5);
        punto1.muestra();

        EP0716 punto2 = new EP0716(3.0, 2.0);

        System.out.println("Distancia entre los puntos: " + punto1.distanciaEuclidea(punto2));
    }
}