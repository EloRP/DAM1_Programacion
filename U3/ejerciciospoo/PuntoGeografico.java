package ejerciciospoo;

public class PuntoGeografico {
    public static void main(String[] args) {

    }

    private double latitud;
    private double longitud;

    // Constructor estándar
    public PuntoGeografico() {
        this.latitud = 0.0;
        this.longitud = 0.0;
    }
    //Constructor con validación

    public PuntoGeografico(double latitud, double longitud) {
        if (latitud > 90 && latitud < -90 && longitud > 180 && longitud < -180) {
            this.latitud = latitud;
            this.longitud = longitud;
        } else {
            throw new IllegalArgumentException("Coordenadas inválidas, comprueba sus valores.");
        }
    }
    //Método para enseñar los valores de las coordenadas con punto decimal.
    public void coordenadasDecimales(){
        System.out.println("Latitud: " + latitud + " grados.");
        System.out.println("Longitud: " + longitud + " grados.");
    }
    
    //Coordenadas aleatorias.

    public static PuntoGeografico generacionPuntoAleatorio(){
        double latitudAleatoria = -90 + (90 - (-90)) * Math.random();
        double longitudAleatoria = -180 + (180 - (-180)) * Math.random();
        return new PuntoGeografico(latitudAleatoria, longitudAleatoria);
    }
    }

