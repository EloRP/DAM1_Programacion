package ejerciciosmath;

import java.math.BigInteger;

public class Factorial {

    /*
     * Factorial. Podrías hacer un programa que calcule, por ejemplo, el factorial
     * de 50 (50!)?
     */
    public static void main(String[] args) {
        int numero = 50;

        BigInteger factorialDe50 = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es " + numero + "! = " + factorialDe50);
    }

    public static BigInteger calcularFactorial(int n) {
        BigInteger resultado = BigInteger.ONE;

    for(

    int i = 1;i<=n;i++)
    {
        resultado = resultado.multiply(BigInteger.valueOf(i));
    }

    return resultado;
}
}
