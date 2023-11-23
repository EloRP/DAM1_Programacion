package funcionesparaninfo;

/*
*EP0416. Implementa la función divisoresPrimos() que muestra, por consola,
*todos los divisores primos del número que se le pasa como parámetro.
*/
public class EP0416 {
    public static void main(String[] args) {
        int numero = 30;
        DivisoresPrimos(numero);
    }

    static void DivisoresPrimos(int numero) {
        System.out.print("Divisores primos de " + numero + ": ");
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && numeroPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean numeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
