package funcionesparaninfo;

/*
 *EP0415. Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo,
 *con el siguiente prototipo:
*static int diferenciaMin (int hora1, int minuto1, int hora2, int minuto2)
*La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.
*/
public class EP0415 {
    public static void main(String[] args) {
        int hora1 = 10;
        int minuto1 = 30;
        int hora2 = 13;
        int minuto2 = 45;

        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println("Diferencia medida en minutos: " + diferencia);
    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int totalMinutos1 = hora1 * 60 + minuto1;
        int totalMinutos2 = hora2 * 60 + minuto2;
        return Math.abs(totalMinutos1 - totalMinutos2);
    }
}
