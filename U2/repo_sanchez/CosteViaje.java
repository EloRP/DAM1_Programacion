package repo_sanchez;

public class CosteViaje {
    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        double coste = 0;
        final double PRECIOGASOLINA = 1.638;
        final double PRECIODIESEL = 1.638;
        final double PRECIOELECTRICO = 0.1692;
        double consumo = consumoMedio * km / 100.0;

        switch (tipoCombustible) {
            case 0 -> {
                coste = consumo * PRECIOGASOLINA;
            }
            case 1 -> {
                coste = consumo * PRECIODIESEL;
            }
            case 2 -> {
                coste = consumo * PRECIOELECTRICO;
            }
        }

        return coste;
    }

}