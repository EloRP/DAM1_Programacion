package examenud02_CORREGIDO;

public class MinutosTranscurridos {
    public static void main(String[] args) {
    }

    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        if (minutoA >= 60 || minutoB >= 60 || horaA >= 24 || horaB >= 24) {
            return -1;
        } else {
            int totalMinutosA = horaA * 60 + minutoA;
            int totalMinutosB = horaB * 60 + minutoB;
            return Math.abs(totalMinutosA - totalMinutosB);
        }
    }
}

/*
        int horaA = ;
        int minutoA = ;
        int horaB = ;
        int minutoB = ;

        System.out.println(minutosTranscurridos(horaA, minutoA, horaB, minutoB));


        He testeado esta función invocándola de la siguiente forma.
*/