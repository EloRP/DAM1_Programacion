package examenrecud02;
//Eloy Rodal Pérez
public class SumaPrimosEntre {
    public static void main(String[] args) {

        int min = 5;
        int max = 15;
        int resultado = sumaPrimosEntre(min, max);

        System.out.println("El resultado de la suma de los primos entre ambos números es de: " + resultado);

    }

        public static boolean esPrimo (int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++)
        if (num % i == 0) {
            return false;
        }
        return true;
    }

    public static int sumaPrimosEntre(int min, int max) {
        if (min >=  max || min < 0) {
            return 0;
        }

        int sumaPrimos = 0;
        for (int i = min + 1; i < max; i++) {
            if (esPrimo(i)) {
                sumaPrimos += i;
            }
        }

        return sumaPrimos;
    }
    }