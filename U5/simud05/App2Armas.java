package simud05;

public class App2Armas {

    public static void main(String[] args) {
        System.out.println("\n2. Armas y Armaduras");
        System.out.println("====================\n");

        PersonajeEx valkiria = new PersonajeEx("Valkiria", practicasherencias.Personaje.Raza.HUMANO);

        valkiria.equipar(new Armadura("Cota de Malla", 10, 2000, 20, Armadura.Tipo.ARMADURA ));
        valkiria.equipar(new Arma("Espada larga", 3, 10000, 60, false));
        valkiria.equipar(new Arma("Espadón a dos manos", 5, 1000, 50, true));
        valkiria.equipar(new Armadura("Yelmo de hierro", 10, 200, 5, Armadura.Tipo.YELMO));
        valkiria.equipar(new Armadura("Escudo de madera", 10, 100, 10, Armadura.Tipo.ESCUDO));

        valkiria.mostrarEquipo();

        PersonajeEx arturo = new PersonajeEx("Arturo", practicasherencias.Personaje.Raza.HUMANO);

        arturo.equipar(new Armadura("Coraza", 15, 3000, 30, Armadura.Tipo.ARMADURA));
        arturo.equipar(new Armadura("Armadura de cuero", 5, 500, 10, Armadura.Tipo.ARMADURA));
        arturo.equipar(new Arma("Espadón a dos manos", 5, 1000, 50, true));
        arturo.equipar(new Arma("Espada larga", 3, 10000, 60, false));
        arturo.equipar(new Armadura("Yelmo de plata", 2, 2000, 5, Armadura.Tipo.YELMO));
        arturo.equipar(new Armadura("Escudo de madera", 10, 100, 10, Armadura.Tipo.ESCUDO));

        arturo.mostrarEquipo();

    }
}
