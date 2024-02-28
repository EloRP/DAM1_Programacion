package interfacesapuntes.ejemplos;

public class Gato extends Animal implements Sonido {
    
    @Override
    public void voz() {
        System.out.println("Miau, miau");
    }

    public void bufar() {
        System.out.println("FFFFFFFFFF");
    }

    public static void main(String[] args) {
        Sonido son = new Perro();
        son.voz();
    }
}
