package coleccionesejercicios.EP1211_12_13_14;

import java.util.Arrays;

import coleccionesapuntes.Util;

public class Contenedor<T> {
    private T objeto;

    public Contenedor() {
    }

    public T extraer() {
        T res = objeto;
        objeto = null;
        return res;
    }

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    /*
     * public void setObjeto(T objeto) {
     * this.objeto = objeto;
     * }
     */
    public static void main(String[] args) {
        /*
         * / Contenedor<Integer> cInt = new Contenedor<>();
         * cInt.guardar(5);
         * 
         * Contenedor<Double> cDou = new Contenedor<>();
         * cDou.guardar(5.5);
         * 
         * Contenedor<Persona> cPer = new Contenedor<>();
         * cPer.guardar(new Persona("Juan"));
         * 
         * Contenedor c = new Contenedor<>();
         * c.guardar(7);
         * c.guardar("Piedra");
         * 
         * Double d = (Double) c.extraer();
         * Double dd = (Double) cInt.extraer();
         */
        Integer[] tInt = { 5, null, 3, null, 5, 7, null };
        String[] tStr = { "Hola", null, "Adiós", null, "A", "Fin", null };

        System.out.println(Util.numeroNulos(tInt));
        System.out.println(Util.numeroNulos(tStr));

        tInt = Util.add(7, tInt);
        tInt = Util.add(null, tInt);
        tStr = Util.add("7", tStr);
        tStr = Util.add(null, tStr);

        System.out.println(Arrays.toString(tInt));
        System.out.println(Arrays.toString(tStr));

        Integer[] tabla1 = { 3, 6, 9 };
        Integer[] tabla2 = { 4, 8, 438};

        System.out.println(Arrays.toString(Util.concatenarTablas(tabla1, tabla2)));
        System.out.println(Arrays.toString(Util.concatenarTablasArrayscopy(tabla1, tabla2)));

    }
}
