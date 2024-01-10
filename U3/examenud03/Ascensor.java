package examenud03;

//Eloy Rodal Pérez

//Clase inicial.
public class Ascensor {
    private int pisoActual;
    public final int PLANTA_MAS_BAJA;
    public final int PLANTA_MAS_ALTA;

    public Ascensor(int pisoInicial, int plantaMasBaja, int plantaMasAlta) {
        this.pisoActual = pisoInicial;
        this.PLANTA_MAS_ALTA = plantaMasBaja;
        this.PLANTA_MAS_BAJA = plantaMasAlta;

    }

    

    // Indicador de pisos. Lanza excepciones según el supuesto.
    public void Indicador(int pisoActual, int plantaMasBaja, int plantaMasAlta) {
        if (plantaMasBaja >= plantaMasAlta) {
            throw new IllegalArgumentException();
        }

        if (pisoActual < plantaMasBaja || pisoActual > plantaMasAlta) {
            throw new IllegalArgumentException();
        }

        this.pisoActual = pisoActual;
    }

    /*Constructor que indica el piso actual como la planta más baja y lanza una excepción en caso de
    que esta sea mayor que la planta más alta. */
    public void IndicadorAltaBaja(int pisoActual, int plantaMasBaja, int plantaMasAlta) {
    if (plantaMasBaja >= plantaMasAlta) {
    throw new IllegalArgumentException();
    }
    pisoActual = plantaMasBaja;
    }

    /*Constructor que sitúa al ascensor en la planta baja de un edificio con 9 plantas y dos sótanos,
    o sea, la planta -2.*/

    public void PisosPorDefecto(int pisoActual, int plantaMasBaja, int plantaMasAlta) {
    pisoActual = 0;
    plantaMasBaja = -2;
    plantaMasAlta = 9;
    this.pisoActual = pisoActual;
    }

    // Getter de pisoActual.
    public int getPisoActual() {
        return pisoActual;
    }

    // Método que aumenta un piso.
    public int subir(int pisoActual) {
        pisoActual++;
        return pisoActual;
    }

    // Método que disminuye un piso.
    public int bajar(int pisoActual) {
        pisoActual--;
        return pisoActual;
    }

    //Subir N pisos.  El número N debería ser indicado por el usuario mediante un Scanner.
    public int subirN(int n, int pisoActual, int pisoInicial, int plantaMasAlta) {
        if (n > plantaMasAlta) {
            System.out.println("Suma de pisos no válida.");
        } else {
            pisoActual = pisoInicial + n;
        }
        return pisoActual;
    }

    //Bajar N pisos. El número N debería ser indicado por el usuario mediante un Scanner.
    public int bajarN(int n, int pisoInicial, int pisoActual, int plantaMasBaja) {
        if (n < plantaMasBaja) {
            System.out.println("Resta de pisos no válida.");
        } else {
            pisoActual = pisoInicial - n;
            this.pisoActual = pisoActual;
        }
        return pisoActual;
    }

    //Ir al piso. El usuario proporciona un destino el cual se convierte en el "pisoActual".
    public int irAlPiso(int destino) {
        pisoActual = destino;
        return pisoActual;
    }

    public static void main(String[] args) {
        
    }
}