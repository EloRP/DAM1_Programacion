package clasesparaninfo;

/*
 * EP0712. Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes pueden indicarse en el constructor y modificarse a posteriori.
 * Es fundamental que la clase disponga de un método que devuelva las distintas soluciones y de un método que nos informe si el discriminante es positivo.
 */

public class EP0712 {
    private double a;
    private double b;
    private double c;

    // Constructor
    public EP0712(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter y Setter para a
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    // Getter y Setter para b
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Getter y Setter para c
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Método para calcular el discriminante
    public double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Método para verificar si el discriminante es positivo
    public boolean discriminanteEsPositivo() {
        return calcularDiscriminante() > 0;
    }

    // Método para obtener las soluciones de la ecuación
    public double[] obtenerSoluciones() {
        double discriminante = calcularDiscriminante();

        if (discriminante < 0) {
            // No hay soluciones reales
            return new double[] {};
        } else if (discriminante == 0) {
            // Una solución real
            double solucion = -b / (2 * a);
            return new double[] { solucion };
        } else {
            // Dos soluciones reales
            double raizDiscriminante = Math.sqrt(discriminante);
            double solucion1 = (-b + raizDiscriminante) / (2 * a);
            double solucion2 = (-b - raizDiscriminante) / (2 * a);
            return new double[] { solucion1, solucion2 };
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        EP0712 ecuacion = new EP0712(1, -3, 2);

        System.out.println("Discriminante es positivo: " + ecuacion.discriminanteEsPositivo());

        double[] soluciones = ecuacion.obtenerSoluciones();
        System.out.println("Soluciones:");
        for (double solucion : soluciones) {
            System.out.println(solucion);
        }
    }
}