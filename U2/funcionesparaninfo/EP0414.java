package funcionesparaninfo;

/*
 * EP0414. Escribe una función a la que se pase como parámetros de entrada una cantidad de
 * días, horas y minutos.
 * La función calculará y devolverá el número de segundos que existen en los datos de entrada.
 */
public class EP0414 {
    public static void main(String[] args) {
        int dias = 2;
        int horas = 5;
        int minutos = 30;

        long segundos = calculoSegundos(dias, horas, minutos);
        System.out.println("Total de segundos: " + segundos);
    }

    static long calculoSegundos(int dias, int horas, int minutos) {
        final int SEGUNDOSMINUTO = 60;
        final int MINUTOSHORA = 60;
        final int HORASDIA = 24;

        long totalSegundos = SEGUNDOSMINUTO * minutos;
        totalSegundos += SEGUNDOSMINUTO * MINUTOSHORA * horas;
        totalSegundos += SEGUNDOSMINUTO * MINUTOSHORA * HORASDIA * dias;

        return totalSegundos;
    }
}
