package ejerciciospoo;

public class PuntoGeografico {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            PuntoGeografico punto = PuntoGeografico.generarAleatorio();
            punto.mostrarGradosDecimales();
            System.out.println(punto.urlGoogleMaps());
            System.out.println(punto.urlOpenStreetMaps());
            System.out.println(punto.urlNominatimXml());
        }
        System.out.println("Fin del programa");

    }

    public static PuntoGeografico generarAleatorio() {
        PuntoGeografico punto = new PuntoGeografico();
        punto.latitud = Math.random() * 180 - 90;
        punto.longitud = Math.random() * 360 - 180;
        return punto;
    }
    //METODOS INFO
    public void mostrarGradosDecimales() {
        System.out.println("Latitud: " + latitud + ", Longitud: " + longitud);
    }

    @Override
    public String toString() {
        return "PuntoGeografico [nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud;
    }

    //GETTERS SETTERS
    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String urlGoogleMaps() {
        return "https://www.google.es/maps/@" + latitud + "," + longitud + ",12z ";

    }

    public String urlOpenStreetMaps() {
        return "https://www.openstreetmap.org/#map=14/" + latitud + "/" + longitud;
    }

    public String urlNominatimXml() {
        return "https://nominatim.openstreetmap.org/reverse?format=xml&lat=" + latitud + "&lon=" + longitud
                + "&zoom=14";
    }

    public String nombre;
    public double latitud;
    public double longitud;

    public PuntoGeografico(String nombre, double latitud, double longitud) {
        if (latitud < -90 || latitud > 90 || longitud < -180 || longitud > 180) {
            throw new IllegalArgumentException("Coordenadas no válidas.");
        }
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public PuntoGeografico(double latitud, double longitud) {
        this(null, latitud, longitud);
    }

    public PuntoGeografico() {
        this.longitud = 0;
        this.latitud = 0;
    }




    
}