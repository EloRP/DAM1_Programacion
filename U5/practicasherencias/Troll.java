package practicasherencias;

public class Troll extends Monstruo {

    public Troll(String nombre) {
        this.nombre = nombre;
        ataque = random(60, 120);
        defensa = random(50, 70);
        velocidad = random(20, 40);
        puntosVida = random(100, 200);
    }

    public Troll() {     //PARA TROLLS SIN NOMBRE
        this(null);
    }

}
