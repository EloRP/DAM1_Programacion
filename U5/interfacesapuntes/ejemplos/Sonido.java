package interfacesapuntes.ejemplos;

public interface Sonido {
    int version = 1;
    void voz();
    
    default void vozDurmiendo() {
        System.out.println("zzzzzzzzzzzz");
    }

    static void bostezo() {
        System.out.println("¡Auuuuh!");     //MÉTODO ESTÁTICO PERTENECE SOLO A LA INTERFAZ
    }
}

