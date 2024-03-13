package examenud05CORREG;

import java.time.LocalDateTime;

public class Mueble extends Objeto {
    String material;
    double alto;
    double ancho;
    double fondo;
    double peso;

    public Mueble(String nombre, String descripcion, String ubicacion, User usuarioPublicacion,
            LocalDateTime fechaHoraPublicacion, User usuarioRecogida, LocalDateTime fechaHoraRecogida, boolean recogido,
            String material, double alto, double ancho, double fondo, double peso) {
        super(nombre, descripcion, ubicacion, usuarioPublicacion, fechaHoraPublicacion, usuarioRecogida,
                fechaHoraRecogida, recogido);
        this.material = material;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mueble [material=" + material + ", alto=" + alto + ", ancho=" + ancho + ", fondo=" + fondo + ", peso="
                + peso + "]";
    }

    

}
