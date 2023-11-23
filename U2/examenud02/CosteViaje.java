package examenud02;
public class CosteViaje {
    public static void main(String[] args) {
    }

    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        costeViaje(km, tipoCombustible, consumoMedio);
        double precioCombustible = 0;

        if (tipoCombustible == 0) {
            precioCombustible = 1.638;
        } else if (tipoCombustible == 1) {
            precioCombustible = 1.638;
        } else if (tipoCombustible == 2) {
            precioCombustible = 0.1692;
        }
        double costeTotal = (precioCombustible * consumoMedio);

        return costeViaje(km, tipoCombustible, consumoMedio);
    }
}
