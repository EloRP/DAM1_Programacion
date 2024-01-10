package repo_sanchez;

public class MinutosTranscurridos {
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        // Declaracion de variables
        int numMinutos = 0;
        int diferenciaHoras = 0;
        int diferenciaMinutos = 0;
        final int MINUTOSDEUNAHORA = 60;

        // Condicionales por si horaA es mayor que horaB
        if (horaA > horaB) {
            diferenciaHoras = horaA - horaB;
            if (minutoA > minutoB) {
                diferenciaMinutos = minutoA - minutoB;
            } else if (minutoB > minutoA) {
                diferenciaHoras--;
                diferenciaMinutos = minutoA + 60 - minutoB;
            }

        }
        // Condicionales por si horaB es mayor que horaA
        if (horaA < horaB) {
            diferenciaHoras = horaB - horaA;
            if (minutoB > minutoA) {
                diferenciaMinutos = minutoB - minutoA;
            } else if (minutoB < minutoA) {
                diferenciaHoras--;
                diferenciaMinutos = minutoB + 60 - minutoA;
            }
        }

        // Condicionales por si horaA es igual que horaB
        if (horaA == horaB) {
            if (minutoA > minutoB) {
                diferenciaMinutos = minutoA - minutoB;
            } else if (minutoA < minutoB) {
                diferenciaMinutos = minutoB - minutoA;
            }
        }

        numMinutos = diferenciaHoras * MINUTOSDEUNAHORA + diferenciaMinutos;

        //Comprobar si los datos son correctos
        if (minutoB >= 60 || minutoB < 0 || minutoA >= 60 || minutoA < 0 || horaA >= 24 || horaA < 0 || horaB >= 24
                || horaB < 0) {
            numMinutos = -1;
        }
        return numMinutos;
    }

    
}