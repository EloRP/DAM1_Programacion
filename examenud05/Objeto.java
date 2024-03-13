package examenud05;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class Objeto implements Comparable {
    String nombre;
    String descripcion;
    String ubicacion;
    User usuarioPublicacion;
    LocalDateTime fechaHoraPublicacion;
    User usuarioRecogida;
    LocalDateTime fechaHoraRecogida;
    boolean recogido;

    public Objeto(String nombre, String descripcion, String ubicacion, User usuarioPublicacion,
            LocalDateTime fechaHoraPublicacion, User usuarioRecogida, LocalDateTime fechaHoraRecogida,
            boolean recogido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.usuarioPublicacion = usuarioPublicacion;
        this.fechaHoraPublicacion = fechaHoraPublicacion;
        this.usuarioRecogida = usuarioRecogida;
        this.fechaHoraRecogida = fechaHoraRecogida;
        this.recogido = recogido;
    }

    @Override
    public int compareTo(Object o) {
        Objeto objeto2 = (Objeto) o;
        return nombre.compareTo(objeto2.nombre);
    }

    public static void mostrarObjetos(Objeto[] objetos) {
        System.out.println("N.  Nombre  Recog.  Usuario  Fecha Publicación");
        System.out.println("------ -----  -----  -----    ----------------");
        Arrays.sort(objetos);
        for (int i = 0; i < objetos.length; i++) {
            System.out.println(i + 1 + "." + " " + objetos[i].nombre + " " + objetos[i].recogido + "    "
                    + objetos[i].usuarioPublicacion + "   " + objetos[i].fechaHoraPublicacion);
        }
    }

    static Objeto[] sortFechaPublicacion(Objeto[] objetos) {
        Arrays.sort(objetos, new ComparadorPublicacion());
        return objetos;
    }

    static Objeto[] sortFechaRecogida(Objeto[] objetos) {
        Arrays.sort(objetos, new ComparadorFechaRecogida());
        return objetos;
    }

    static Objeto[] sortRecogidosUsuariosFecha(Objeto[] objetos) {
        Arrays.sort(objetos, new ComparadorPublicacion());
        return objetos;
    }

    public static void mostrarDetalles() {
        Objeto[] objetos = new Objeto[10];
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + objetos.descripcion);
        System.out.println("Ubicación: " + objetos.ubicacion);
        System.out.println("Fecha y Hora de publicación: " + objetos.fechaHoraPublicacion);
        System.out.println("Usuario Publicación: " + objetos[i].usuarioPublicacion);
        System.out.println("Recogido: " + objetos.recogido);
        System.out.println("Fecha y Hora de Recogida: " + objetos.fechaHoraRecogida);
        System.out.println("Usuario Recogida: " + objetos.usuarioRecogida);
        System.out.println();
    }
}
