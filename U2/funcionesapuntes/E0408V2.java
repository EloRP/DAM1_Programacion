package funcionesapuntes;

public class E0408V2 {
    public static void main(String[] args) {
        
    }

    static double calculadora(double a, double b, int operacion) {
        double resultado = 0;

        switch (operacion) {
            case 1 -> resultado = a + b;
            case 2 -> resultado = a - b;
            case 3 -> resultado = a * b;
            case 4 -> resultado = a / b;
        }

        return resultado;
    }
}
