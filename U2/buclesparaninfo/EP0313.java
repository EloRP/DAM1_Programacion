package buclesparaninfo;

/* EP0313. Escribe un programa que incremente la hora de un reloj.
Se pedirán por teclado la hora, minutos y segundos, así como cuántos segundos se desea incrementar la hora introducida.
La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01. */
import java.util.Scanner;

public class EP0313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos, minutos, hora;

        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        segundos = sc.nextInt();
        System.out.print("Introduce cuántos segundos deseas añadir: ");
        int segundosIncremento = sc.nextInt();
        sc.close();

        int totalSegundos = hora * 3600 + minutos * 60 + segundos;
        totalSegundos += segundosIncremento;

        hora = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        System.out.println("La nueva hora es: " + hora + ":" + minutos + ":" + segundos);
    }
}
