package puntos;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AppAddPuntos implements Serializable {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Escribe el nombre del jugador: ");
            String nombre = sc.nextLine();

            System.out.println("Escribe la puntuación que obtuvo: ");
            int puntuacionTotal = sc.nextInt();

            LocalDateTime horaPuntuacion = LocalDateTime.now();

            sc.close();

            Puntuacion.guardarPuntuacion(nombre, puntuacionTotal, horaPuntuacion, "puntuaciones.dat");
    }
}
