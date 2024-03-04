package PRUEBAS;

public class Instanceofprueba {
    public static void main(String[] args) {
        Complejo c = new ComplejoAmpliado(12.4, -1);
        boolean corresto = false;
        if (c instanceof Object) {
            corresto = true;
            }
        if (c instanceof Complejo) {
            corresto = true;
        }
        if (c instanceof ComplejoAmpliado) {
            corresto = true;
        }

        //ComplejoAmpliado ca = new Complejo(12.4, 3)

        System.out.println(corresto);
    }
}
