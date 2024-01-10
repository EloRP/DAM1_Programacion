package clasesparaninfo;

import java.util.Scanner;

/*
 * EP0711. Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro.
 * Deberá disponer de métodos para incrementar la página leída,
 * para obtener información de la última página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.
 */

public class EP0711 {
    private String libro;
    private int paginaActual;

    // Constructor
    public EP0711(String libro) {
        this.libro = libro;
        this.paginaActual = 0;
    }

    // Método para incrementar la página leída
    public void incrementarPagina() {
        paginaActual++;
    }

    // Método para obtener información de la última página leída
    public String obtenerInfoUltimaPagina() {
        return "Libro: " + libro + ", Página actual: " + paginaActual;
    }

    // Método para comenzar una nueva lectura desde el principio
    public void comenzarNuevaLectura() {
        paginaActual = 0;
    }

    // Método para obtener el número actual de página
    public int getPaginaActual() {
        return paginaActual;
    }

    // Método para establecer el número de página actual
    public void setPaginaActual(int nuevaPagina) {
        if (nuevaPagina >= 0) {
            paginaActual = nuevaPagina;
        } else {
            System.out.println("Número de página inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del libro: ");
        String nombreLibro = sc.nextLine();

        EP0711 marcaPagina = new EP0711(nombreLibro);

        int opcion;

        do {
            System.out.println("Escribe lo que quieras hacer (0 para terminar):");
            System.out.println("1. Incrementar página");
            System.out.println("2. Obtener información de la última página");
            System.out.println("3. Comenzar nueva lectura");
            System.out.print("Selecciona una acción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    marcaPagina.incrementarPagina();
                    break;
                case 2:
                    System.out.println(marcaPagina.obtenerInfoUltimaPagina());
                    break;
                case 3:
                    marcaPagina.comenzarNuevaLectura();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Número no válido.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
