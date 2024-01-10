package identificadores;

public class Constantes {
    public static void main(String[] args) {

        /*
         * Constantes requeridas:
         * Número de alumnos matriculados en el módulo de Programación (32 según el
         * listado del aula virtual)
         * Número total de sesiones del módulo de Programación en el curso lectivo.
         * Número de sesiones semanales del módulo de Programación.
         * Número de meses del año.
         */

        final byte alumnosDam = 33;

        System.out.println("Alumnos matriculados en el mod. de Programación:");
        System.out.println(alumnosDam);

        final short sesionesAnualesProgramación = 288;

        System.out.println("Sesiones del módulo de Programación al año:");
        System.out.println(sesionesAnualesProgramación);

        final byte sesionesSemanalesProgramación = 9;

        System.out.println("Sesiones semanales del módulo de Programación:");
        System.out.println(sesionesSemanalesProgramación);

        final byte mesesAño = 12;

        System.out.println("Meses del año:");
        System.out.println(mesesAño);
    }
}
