package E0710.maquinaria;

public class Vagon {
    int numero;
    final double CARGA_MAXIMA;
    double cargaActual;
    String tipoMercancia;

    public Vagon(int numero, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.numero = numero;
        CARGA_MAXIMA = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        String str = String.valueOf(numero);

        str += "; Carga máxima=" + cargaActual + "/" + CARGA_MAXIMA;
        str += tipoMercancia != null ? "; Tipo de mercancía=" + tipoMercancia : "";

        return str;
    }

    

}
