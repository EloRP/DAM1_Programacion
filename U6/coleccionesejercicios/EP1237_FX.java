package coleccionesejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Set;
import java.util.TreeMap;

public class EP1237 extends Application {

    /*
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
     * static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer
     * dorsal), que elimina la entrada correspondiente al jugador cuyo dorsal se
     * pasa como parámetro. Dicho dorsal desaparece del mapa hasta que se asigne a
     * otro jugador por medio de un alta. El método devuelve el jugador eliminado.
     * static void mostrar (Map<Integer, Jugador> plantilla), que muestra una lista
     * de los dorsales con los nombres de los jugadores correspondientes.
     * dorsal - jugador
     * dorsal2 - jugador2
     * …
     * 
     * static void mostrar (Map<Integer, Jugador> plantilla, String posicion), que
     * muestra una lista de los jugadores que comparten una misma posición. Por
     * ejemplo, todos los defensas o todos los delanteros.
     * static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal,
     * Jugador jugador), que permite modificar los datos de un jugador, excepto su
     * dorsal y su DNI. Devuelve true si el dorsal existe y false en caso contrario.
     */

    static Map<Byte, Jugador> plantilla = new TreeMap<>();

    public static void main(String[] args) {
        altaJugador(plantilla, 1, new Jugador("111111", "Pepe", Posicion.PORTERO));
        altaJugador(plantilla, 5, new Jugador("333333", "María", Posicion.DEFENSA));
        altaJugador(plantilla, 11, new Jugador("222222", "Lola", Posicion.DELANTERO));
        altaJugador(plantilla, 8, new Jugador("444444", "Manuel", Posicion.CENTROCAMPISTA));
        altaJugador(plantilla, 11, new Jugador("222222", "Lola", Posicion.DELANTERO));
        altaJugador(plantilla, 10, new Jugador("777777", "Fermín", Posicion.DELANTERO));
        altaJugador(plantilla, 9, new Jugador("999999", "Juanchito", Posicion.DELANTERO));
        editarJugador(plantilla, 9, new Jugador("999999", "Juancho", Posicion.DEFENSA));

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Plantilla de Fútbol");
        ListView<Jugador> listView = new ListView<>();

        listView.getItems().addAll(new ArrayList<>(plantilla.values()));

        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");
        MenuBar menuBar = new MenuBar(menuArchivo, menuEditar, menuAyuda);

        VBox vbox = new VBox(menuBar, listView);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main2(String[] args) {
        Map<Byte, Jugador> plantilla = new TreeMap<>();

        altaJugador(plantilla, 1, new Jugador("111111", "Pepe", Posicion.PORTERO));
        altaJugador(plantilla, 5, new Jugador("333333", "María", Posicion.DEFENSA));
        altaJugador(plantilla, 11, new Jugador("222222", "Lola", Posicion.DELANTERO));
        altaJugador(plantilla, 8, new Jugador("444444", "Manuel", Posicion.CENTROCAMPISTA));

        mostrar(plantilla);

        int dorsal = 11;
        Jugador jugadorEliminado = eliminarJugador(plantilla, dorsal);
        if (jugadorEliminado != null) {
            System.out.println("Se ha eliminado el jugador " + jugadorEliminado);
        } else {
            System.out.println("No existe jugador en el dorsal " + dorsal);
        }

        jugadorEliminado = eliminarJugador(plantilla, dorsal);
        if (jugadorEliminado != null) {
            System.out.println("Se ha eliminado el jugador " + jugadorEliminado);
        } else {
            System.out.println("No existe jugador en el dorsal " + dorsal);
        }

        altaJugador(plantilla, 11, new Jugador("222222", "Lola", Posicion.DELANTERO));
        altaJugador(plantilla, 10, new Jugador("777777", "Fermín", Posicion.DELANTERO));
        altaJugador(plantilla, 9, new Jugador("999999", "Juanchito", Posicion.DELANTERO));

        mostrar(plantilla);

        mostrar(plantilla, "DELANTERO");

        editarJugador(plantilla, 9, new Jugador("999999", "Juancho", Posicion.DEFENSA));

        mostrar(plantilla);

        mostrar(plantilla, (j1, j2) -> j1.posicion.toString().compareTo(j2.posicion.toString()));

        mostrar(plantilla, (j1, j2) -> j1.posicion.ordinal() - j2.posicion.ordinal());

    }

    private static void mostrar(Map<Byte, Jugador> plantilla, Comparator<Jugador> c) {
        List<Jugador> listaJugadores = new ArrayList<>(plantilla.values());
        listaJugadores.sort(c);
        System.out.println(listaJugadores);

    }

    private static boolean editarJugador(Map<Byte, Jugador> plantilla, int dorsal, Jugador jugador) {
        boolean editarJugador = false;
        if (plantilla.containsKey((byte) dorsal)) {
            if (jugador.equals(plantilla.get((byte) dorsal))) {
                plantilla.put((byte) dorsal, jugador);
                editarJugador = true;
            }
        }

        return editarJugador;
    }

    private static void mostrar(Map<Byte, Jugador> plantilla, String posicion) {

        try {
            Posicion pos = Posicion.valueOf(posicion.toUpperCase());

            Set<Entry<Byte, Jugador>> entradas = plantilla.entrySet();

            System.out.println("Jugadores en la posición " + posicion + ": ");
            int i = 0;
            for (Entry<Byte, Jugador> entrada : entradas) {
                if (entrada.getValue().posicion == pos) {
                    i++;
                    System.out.println(entrada.getKey() + " - " + entrada.getValue().nombre);
                }
            }
            if (i == 0)
                System.out.println("No hay jugadores esa posición");

        } catch (IllegalArgumentException e) {
            System.out.println(posicion + " no es una posición válida.");
        }

    }

    private static Jugador eliminarJugador(Map<Byte, Jugador> plantilla, int dorsal) {
        Jugador jugadorEliminado = null;
        if (plantilla.containsKey((byte) dorsal)) {
            jugadorEliminado = plantilla.remove((byte) dorsal);
        }
        return jugadorEliminado;
    }

    private static void mostrar(Map<Byte, Jugador> plantilla) {
        Set<Entry<Byte, Jugador>> entradas = plantilla.entrySet();
        Iterator<Entry<Byte, Jugador>> it = entradas.iterator();
        while (it.hasNext()) {
            Entry<Byte, Jugador> entrada = it.next();
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }

    private static void altaJugador(Map<Byte, Jugador> plantilla, int dorsal, Jugador jugador) {
        if (!plantilla.containsKey((byte) dorsal)) {
            plantilla.put((byte) dorsal, jugador);
        }
    }
}

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO, LATERAL_IZQUIERDO
}

class Jugador {
    String dni;
    String nombre;
    Posicion posicion;
    int estatura;

    public Jugador(String dni, String nombre, Posicion posicion) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ")";
    }
}