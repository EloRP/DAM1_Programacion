package interfacesapuntes.ejemplos;

public class Perro extends Animal implements Sonido {          //Código para implementar interfaz.

    @Override
    public void voz() {
        System.out.println("Guau, guau");
    }
    

}
