package buclesapuntes;

public class E0310 {

    public static void main(String[] args) {
        int sumaImpares = 0;

        for (int i = 1, contador = 0; contador < 10; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
                contador++;
            }
        }

        System.out.println("La suma de los primeros 10 números impares del 1 al 10 es: " + sumaImpares);
    }
}
