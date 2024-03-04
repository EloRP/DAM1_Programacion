package interfacesapuntes.ejemplos;

public class App {

    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Caracol caracol = new Caracol();
        Leon leon = new Leon();
    

        Sonido son = new Sonido() {         //VARIABLE DE TIPO INTERFAZ Y ANÓNIMA
            public void voz() {
                System.out.println("¡Jajejijojuuuuuu!");
            }
        };

        son.voz();
        son.vozDurmiendo();

        son = perro;

        son.voz();

        son = gato;

        son.voz();

        gato.bufar();

        Sonido[] animales = {perro, gato, leon};
    
        for (Sonido a : animales) {
            a.voz();
            a.vozDurmiendo();
        }
    /*
        perro.voz();
        gato.voz();
        leon.voz();
        System.out.println(Sonido.version);
        perro.vozDurmiendo();
        gato.vozDurmiendo();
        leon.vozDurmiendo();

        Sonido.bostezo();
     */
    }
}
