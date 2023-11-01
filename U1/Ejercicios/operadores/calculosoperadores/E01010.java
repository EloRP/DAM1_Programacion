package calculosoperadores;



import java.util.Scanner;

public class E01010 {
public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);

    // pregunta si llueve o no y toma el valor booleano dado por el user
    System.out.print("¿Está lloviendo?  (true/false): ");
    boolean estaLloviendo = sc.nextBoolean();


    // pregunta si se han terminado las tareas o no y toma el valor booleano dado por el user
    System.out.print("¿Has terminado tus tareas? (true/false): ");
    boolean tareasTerminadas = sc.nextBoolean();


    // pregunta si se debe hacer algún recado o no y toma el valor booleano dado por el user

    System.out.print("¿Tienes que hacer algún recado? (true/false): ");
    boolean recadosHacer = sc.nextBoolean();

    // se valora si se puede salir basándose en las respuestas anteriores:

    boolean puedesSalir = (!estaLloviendo && tareasTerminadas) || recadosHacer;

    System.out.print("¿Puedes salir? " + (puedesSalir));
    sc.close();


    }
    
}
