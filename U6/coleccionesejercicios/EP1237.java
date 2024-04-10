package coleccionesejercicios;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EP1237 {

    /*
     * @author Eloy Rodal Pérez
     * EP1237. Queremos gestionar la plantilla de un equipo de fútbol, en la que a
     * cada jugador se le asigna un dorsal que no puede estar repetido. Para ello
     * vamos a crear una estructura de tipo Map cuyas entradas corresponden a los
     * jugadores, con el dorsal como clave y un objeto de la clase Jugador como
     * valor. De cada jugador se guarda el DNI, el nombre, la posición en el campo -
     * para simplificar, los jugadores pueden ser porteros, defensas,
     * centrocampistas y delanteros - y su estatura. Define la clase Jugador y un
     * enumerado para la posición en el campo, e implementa los siguientes métodos
     * estáticos:
     * 
     * static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal,
     * Jugador jugador), que añade una entrada al mapa con el dorsal pasado como
     * parámetro y el jugador creado dentro del método.
     * 
     * static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer
     * dorsal), que elimina la entrada correspondiente al jugador cuyo dorsal se
     * pasa como parámetro. Dicho dorsal desaparece del mapa hasta que se asigne a
     * otro jugador por medio de un alta. El método devuelve el jugador eliminado.
     * 
     * static void mostrar (Map<Integer, Jugador> plantilla), que muestra una lista
     * de los dorsales con los nombres de los jugadores correspondientes.
     * 
     * static void mostrar (Map<Integer, Jugador> plantilla, String posicion), que
     * muestra una lista de los jugadores que comparten una misma posición. Por
     * ejemplo, todos los defensas o todos los delanteros.
     * 
     * static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal,
     * Jugador jugador), que permite modificar los datos de un jugador, excepto su
     * dorsal y su DNI. Devuelve true si el dorsal existe y false en caso contrario.
     */

    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new TreeMap<>();

        Jugador jugador1 = new Jugador("12345678A", "Eloy", Posicion.Defensa, 1.80);
        Jugador jugador2 = new Jugador("87654321B", "Juan", Posicion.Defensa, 1.90);
        Jugador jugador3 = new Jugador("12348765C", "Pedro", Posicion.Defensa, 1.75);
        altaJugador(plantilla, 3, jugador3);
        altaJugador(plantilla, 1, jugador1);
        altaJugador(plantilla, 2, jugador2);

        mostrar(plantilla);

        System.out.println("\n");

        mostrarPorPosicion(plantilla, "Defensa");

        System.out.println("\n");

        editarJugador(plantilla, 3, jugador3);

        mostrar(plantilla);
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static void mostrarPorPosicion(Map<Integer, Jugador> plantilla, String posicion) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {        // entryset() devuelve un conjunto de pares clave-valor.
            if (entry.getValue().posicion.toString().equals(posicion)) {        // getValue() devuelve el valor de la entrada, y si coincide con la posición, se imprime.
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        boolean editado = false;
        if (dorsal != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre: ");
            jugador.nombre = sc.nextLine();
            System.out.println("Posición: ");
            jugador.posicion = Posicion.valueOf(sc.nextLine());
            System.out.println("Estatura: ");
            jugador.estatura = sc.nextDouble();
            editado = true;
        }
        return editado;
    }

    static class Jugador {
        String DNI;
        String nombre;
        Posicion posicion;
        double estatura;

        public Jugador(String DNI, String nombre, Posicion posicion, double estatura) {
            this.DNI = DNI;
            this.nombre = nombre;
            this.posicion = posicion;
            this.estatura = estatura;
        }

        @Override
        public String toString() {
            return "Jugador [DNI=" + DNI + ", estatura=" + estatura + ", nombre=" + nombre + ", posicion=" + posicion
                    + "]";
        }
    }

    enum Posicion {
        Portero, Defensa, Centrocampista, Delantero
    }
}