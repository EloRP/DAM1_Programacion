package buclesejercicios;

public class E0310 {

    /*
     * E0310. Diseñar un programa que muestre la suma de los 10 primeros números
     * impares./*
     */
    public static void main(String[] args) {
        int sumaImpares = 0; // Variable para almacenar la suma de los primeros 10 números impares.

        for (int i = 1, contador = 0; contador < 10; i++) {
            if (i % 2 != 0) { // Comprobamos si un número es impar.
                sumaImpares += i;
                contador++;
            }
        }

        System.out.println("La suma de los primeros 10 números impares del 1 al 10 es: " + sumaImpares);
    }
}
