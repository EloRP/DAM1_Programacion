package apuntes;

class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Error. La hora no es válida.");;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }
        

    public void setSegundo(int segundo) {
        if (segundo > 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void imprimirHora () {
        System.out.printf("Según los datos proporcionados, la hora actual es: " + "%02d:%02d:%02d%n" + getHora(), getMinuto(), getSegundo());
    }

    public void segundoSiguiente() {
        int segundoActual = getSegundo();
        int minutoActual = getMinuto();
        int horaActual = getHora();

        if (segundoActual < 59) {
            setSegundo(segundoActual + 1);
        } else if (minutoActual < 59) {
            setSegundo(0);
            setMinuto(minutoActual + 1);
        } else if (horaActual < 23) {
            setSegundo(0);
            setMinuto(0);
            setHora(horaActual + 1);
        } else {
            setSegundo(0);
            setMinuto(0);
            setHora(0);
    }
}
}