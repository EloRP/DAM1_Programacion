import java.util.Arrays;

public class Personaje implements Comparable {

    public enum Raza {
        HUMANO, ELFO, DROW, SEMIELFO, SEMIORCO, MEDIANO, ENANO, GNOMO, TIEFLING, GITHYANKI, DRACÓNIDO, AARACOCKRA, GOBLIN, 
    }

    public enum Clase {
        GUERRERO, BARDO, CLÉRIGO, DRUIDA, MAGO, MONJE, PALADÍN, EXPLORADOR, HECHICERO, BRUJO, PÍCARO, BÁRBARO, ARTIFICIERO, 
    }

    public String nombre;
    public Raza raza;
    public Clase clase;
    public int fuerza;
    public int destreza;
    public int constitución;
    public int inteligencia;
    public int sabiduría;
    public int carisma;

    public int nivel = 1;
    public int experiencia = 0;

    public int puntosVidaMax;
    public int puntosVidaActuales = puntosVidaMax;

    public Personaje(String nombre, Raza raza, Clase clase, int fuerza, int destreza, int constitución,
            int inteligencia,
            int sabiduría, int carisma, int nivel, int experiencia, int puntosVidaMax) {
        if (fuerza <= 0 || destreza <= 0 || constitución <= 0 || inteligencia <= 0 || sabiduría <= 0 || carisma <= 0
                || nivel <= 0 || experiencia < 0 || puntosVidaMax <= 0) {
            throw new IllegalArgumentException(
                    "Valores inválidos: los atributos numéricos deben ser mayores que cero, nivel y puntos de vida deben ser mayores o iguales a cero");
        } // PRIMER CONSTRUCTOR
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;
        this.fuerza = Math.max(1, fuerza); // A excepción del nombre y raza, se inicializan los valores a algo
                                           // mayor o
        // igual que 1.
        this.destreza = Math.max(1, destreza);
        this.constitución = Math.max(1, constitución);
        this.inteligencia = Math.max(1, inteligencia);
        this.sabiduría = Math.max(1, sabiduría);
        this.carisma = Math.max(1, carisma);
        this.nivel = Math.max(1, nivel);
        this.experiencia = Math.max(0, experiencia); // Es o 0 o el valor actual de la EXP.
        this.puntosVidaMax = (50 + constitución);
        this.puntosVidaActuales = this.puntosVidaMax;
    }

    public Personaje(String nombre, Raza raza, Clase clase, int fuerza, int destreza, int constitución,
            int inteligencia,
            int sabiduría, int carisma) {
        this(nombre, raza, clase, fuerza, destreza, constitución, inteligencia, sabiduría, carisma, 1, 0,
                50 + constitución);
        if (fuerza <= 0 || destreza <= 0 || constitución <= 0 || inteligencia <= 0 || sabiduría <= 0 || carisma <= 0
                || nivel <= 0 || experiencia < 0 || puntosVidaMax <= 0 || puntosVidaActuales <= 0) {
            throw new IllegalArgumentException(
                    "Valores inválidos: los atributos numéricos deben ser mayores que cero, nivel y puntos de vida deben ser mayores o iguales a cero");
        }

    }

    public Personaje(String nombre, Raza raza, Clase clase, int nivel, int experiencia, int puntosVidaMax) { // Constructor
                                                                                                             // que
        // establece las
        // estadísticas como
        // aleatorias.
        this(nombre, raza, clase, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1,
                (int) (Math.random() * 100) + 1,
                (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVidaMax = this.constitución;
    }

    public Personaje(String nombre, Raza raza) {
        if (fuerza <= 0 || destreza <= 0 || constitución <= 0 || inteligencia <= 0 || sabiduría <= 0 || carisma <= 0
                || nivel <= 0 || experiencia < 0 || puntosVidaMax <= 0 || puntosVidaActuales <= 0) {
            throw new IllegalArgumentException(
                    "Valores inválidos: los atributos numéricos deben ser mayores que cero, nivel y puntos de vida deben ser mayores o iguales a cero");
        }
        this.nombre = nombre;
        this.raza = Raza.HUMANO; // Suponemos que es un humano
        this.clase = Clase.GUERRERO;
        this.fuerza = (int) (Math.random() * 100) + 1; // Genera un valor aleatorio entre 1 y 100 para cada atributo
                                                       // numérico
        this.destreza = (int) (Math.random() * 100) + 1;
        this.constitución = (int) (Math.random() * 100) + 1;
        this.inteligencia = (int) (Math.random() * 100) + 1;
        this.sabiduría = (int) (Math.random() * 100) + 1;
        this.carisma = (int) (Math.random() * 100) + 1;
        this.nivel = 1; // Nivel inicial
        this.experiencia = 0; // Experiencia inicial
        this.puntosVidaMax = 50 + constitución; // Puntos de vida iniciales
        this.puntosVidaActuales = puntosVidaMax;
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosVidaActuales + "/" + puntosVidaMax + ")";
    }

    void mostrar() {
        System.out.println("Nombre del PC: " + nombre);
        System.out.println("Raza del PC: " + raza);
        System.out.println("Clase del PC: " + clase);
        System.out.println("Fuerza del PC: " + fuerza);
        System.out.println("destreza del PC: " + destreza);
        System.out.println("Constitución del PC: " + constitución);
        System.out.println("Inteligencia del PC: " + inteligencia);
        System.out.println("sabiduría del PC: " + sabiduría);
        System.out.println("carisma del PC: " + carisma);
        System.out.println("Nivel del PC: " + nivel);
        System.out.println("Puntos de experiencia actuales del PC: " + experiencia);
        System.out.println("Puntos de vida totales del PC: " + puntosVidaMax);
    }

    /**
     * Suma al personaje la experiencia indicada y sube de nivel si es necesario.
     * 
     * @param puntos
     * @return número de niveles subidos.
     */
    byte sumarExperiencia(int puntos) {
        int uExpAntes = experiencia / 1000;
        experiencia += puntos;
        int uExpDespues = experiencia / 1000;

        byte nivelesQueSube = (byte) (uExpDespues - uExpAntes);

        nivel += nivelesQueSube;

        return nivelesQueSube;
    }

    void subirNivel() {
        fuerza += (fuerza * 0.05);
        destreza += (destreza * 0.05);
        constitución += (constitución * 0.05);
        inteligencia += (inteligencia * 0.05);
        sabiduría += (sabiduría * 0.05);
        carisma += (carisma * 0.05);
        nivel++;
    }

    void curar() {
        if (puntosVidaActuales < puntosVidaMax) {
            puntosVidaActuales = puntosVidaMax;
        }
    }

    boolean perderVida(int Puntos) {
        boolean muertePC = false;
        puntosVidaActuales -= Puntos;
        if (puntosVidaActuales <= 0) {
            muertePC = true;
        }
        return muertePC;
    }

    public boolean estaVivo() {
        boolean pcConVida = true;
        if (puntosVidaActuales <= 0) {
            pcConVida = false;
            System.out.println("Tu personaje ya está muerto.");
        } else {
            System.out.println("Tu personaje aún no está criando malvas.");
        }
        return pcConVida;
    }

    int atacar(Personaje enemigo) {
        int dañoAtaque = (int) ((Math.random() * 100 + 1) + fuerza);
        int armorClass = (int) ((Math.random() * 100 + 1) + destreza);
        int vidaPerdida = dañoAtaque - armorClass;
        if (vidaPerdida > 0) {
            puntosVidaActuales -= vidaPerdida;
            enemigo.experiencia += vidaPerdida;
            experiencia += vidaPerdida;
        }
        return vidaPerdida;
    }

    @Override
    public int compareTo(Object o) {
        Personaje otro = (Personaje) o;
        return nombre.compareTo(otro.nombre);
    }

    public Raza getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Minsc", Raza.HUMANO, Clase.EXPLORADOR, 3, 8, 9, 4, 3, 5, 3, 293, 50);

        Personaje p2 = new Personaje("Jaheira", Raza.ELFO, Clase.DRUIDA, 3, 8, 3, 4, 3, 5, 1, 293, 50);

        Personaje p3 = new Personaje("Wyll Ravengard", Raza.HUMANO, Clase.GUERRERO, 3, 8, 7, 4, 3, 5, 8, 293, 90);

        Personaje p4 = new Personaje("Minthara Baenre", Raza.ELFO, Clase.PALADÍN, 3, 8, 13, 4, 3, 5, 10, 293, 120);

        Personaje p5 = new Personaje("Gale Dekarios", Raza.HUMANO, Clase.MAGO, 3, 8, 5, 4, 3, 5, 9, 293, 48);

        Personaje p6 = new Personaje("Enver Gortash", Raza.HUMANO, Clase.PÍCARO, 5, 13, 10, 20, 15, 15, 12, 3000, 250);

        Personaje p7 = new Personaje("Lae'zel", Raza.GITHYANKI, Clase.GUERRERO, 18, 15, 16, 8, 10, 8, 11, 3000, 120);

        Personaje p8 = new Personaje("Astarion Ancunín", Raza.ELFO, Clase.PÍCARO, 10, 16, 12, 16, 18, 13, 11, 6455, 70);

        System.out.println(p4.compareTo(p5));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());

        p1.atacar(p3);

        Personaje[] party = { p1, p2, p3, p4, p5, p6, p7, p8 };

        System.out.println("-----------------");

        for (Personaje p : party) {
            System.out.println(p);
        }
        System.out.println("---------------");

        Arrays.sort(party, new ComparadorNivel());

        for (Personaje p : party) {
            System.out.println(p);
        }

        System.out.println("---------------");

        Arrays.sort(party, new comparadorFuerza());

        for (Personaje p : party) {
            System.out.println(p);
        }

        /*
         * p4.atacar(p1);
         * System.out.println(p1.toString());
         * System.out.println(p4.toString());
         */
    }
}