package examenud05CORREG;

import java.time.LocalDateTime;

public class Libro extends Objeto{
    String titulo;
    String autor;
    public Libro(String nombre, String descripcion, String ubicacion, User usuarioPublicacion,
            LocalDateTime fechaHoraPublicacion, User usuarioRecogida, LocalDateTime fechaHoraRecogida, boolean recogido,
            String titulo, String autor) {
        super(nombre, descripcion, ubicacion, usuarioPublicacion, fechaHoraPublicacion, usuarioRecogida,
                fechaHoraRecogida, recogido);
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
    }

    
}
