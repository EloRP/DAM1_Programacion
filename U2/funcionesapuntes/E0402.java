package funcionesapuntes;

public class E0402 {
    public static void main(String[] args) {
        int num1 = 6, num2 = 18;

        imprimirNumerosEntre(num1, num2);

        imprimirNumerosEntre(13, 27);
    }

    static void imprimirNumerosEntre(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i);
        }
    }
}
