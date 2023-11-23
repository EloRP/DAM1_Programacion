package pruebas;

public class sobrecarga {

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println(multiplicar(5, 4.0));
        System.out.println(multiplicar(9, 5));
        System.out.println(multiplicar(9, 9, 9));
    }

}
