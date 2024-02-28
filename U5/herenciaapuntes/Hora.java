package herenciaapuntes;

public class Hora {
    public int hora;
    public int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora == 24 ? 0 : hora;
        this.minuto = minuto == 60 ? 0 : minuto;
    }

    void inc() {
        if (hora == 23 && minuto == 59) {
            hora = 0;
            minuto = 0;
        } else if (minuto == 59) {
            hora++;
            minuto = 0;
        } else {
            minuto++;
        }
    }

    boolean setMinuto(int valor) {
        boolean minModificado = true;
        if (minuto > 59 || minuto < 0) {
            System.out.println("No ha sido posible cambiar el minuto.");
            minModificado = false;
        } else {
            minuto = valor;
        }

        return minModificado;
    }

    boolean setHora(int valor) {
        boolean horaModificada = true;
        if (hora > 23 || hora < 0) {
            System.out.println("No ha sido posible cambiar la hora.");
            horaModificada = false;
        } else {
            hora = valor;
        }
        return horaModificada;
    }

    @Override
    public String toString() {
        String str = String.format("%02d:%02d", hora, minuto);
        return str;
    }

    @Override
    public boolean equals(Object otraHora) {
        boolean sonIguales = false;
        Hora hora1 = new Hora(hora, minuto);
        Hora hora2 = (Hora) otraHora;
        if (hora1.hora == hora2.hora && hora1.minuto == hora2.minuto) {
            sonIguales = true;
        }
        return sonIguales;
    }

    public static void main(String[] args) {
        Hora h = new Hora(22, 58);
        h.setMinuto(59);

        for (int i = 0; i < 70; i++) {
            h.inc();
            System.out.println(h.toString());
        }

    }
}
