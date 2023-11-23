package examenud02_CORREGIDO;
public class CosteViaje {
    public static void main(String[] args) {
    }
    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        final double PRECIO_LITRO_GASOLINA = 1.638;
        final double PRECIO_LITRO_DIESEL = 1.638;
        final double PRECIO_KWH = 0.1692;
        
        double costeViaje = -1;
        double consumo = km * consumoMedio / 100;
        switch (tipoCombustible) {
            case 0: costeViaje = consumo * PRECIO_LITRO_GASOLINA;
            case 1: costeViaje = consumo * PRECIO_LITRO_DIESEL;
            case 2: costeViaje = consumo * PRECIO_KWH;
        }
        return costeViaje;

}
}
