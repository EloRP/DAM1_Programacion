package examenud05;

import java.time.LocalDateTime;

public class ObjetoElectronico extends Objeto{
    String marca;
    String modelo;

    public ObjetoElectronico(String nombre, String descripcion, String ubicacion, User usuarioPublicacion,
            LocalDateTime fechaHoraPublicacion, User usuarioRecogida, LocalDateTime fechaHoraRecogida, boolean recogido,
            String marca, String modelo) {
        super(nombre, descripcion, ubicacion, usuarioPublicacion, fechaHoraPublicacion, usuarioRecogida,
                fechaHoraRecogida, recogido);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "ObjetoElectronico [marca=" + marca + ", modelo=" + modelo + "]";
    }
    
    

    
}
