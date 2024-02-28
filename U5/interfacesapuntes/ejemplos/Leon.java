package interfacesapuntes.ejemplos;

public class Leon extends Animal implements Sonido {

    public void voz() {
        System.out.println("¡GRRRRR!");
    }

    @Override
    public void vozDurmiendo() {
        System.out.println("¡grrrrr!");
    }

}
