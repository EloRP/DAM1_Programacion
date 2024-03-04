package herenciaapuntes;

public class HoraExacta extends Hora {
    byte segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        this.segundo = segundo == 60 ? 0 : (byte) segundo;

    }

    boolean setSegundo(int valor) {
        boolean segundoModificado = true;
        if (segundo > 59 || segundo < 0) {
            System.out.println("No ha sido posible cambiar el minuto.");
            segundoModificado = false;
        } else {
            segundo = (byte) valor;
        }

        return segundoModificado;
    }

    @Override
    void inc() {
        if (segundo < 59) {
            segundo++;
        } else {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        String str = String.format("%s:%02d", super.toString(), segundo);
        return str;
    }

  /*  @Override
    public boolean equals(Object otraHora) {
        boolean sonIguales = false;
        HoraExacta hora1 = new HoraExacta(hora, minuto, segundo);
        HoraExacta hora2 = (HoraExacta) otraHora;
        if (hora1.hora == hora2.hora && hora1.minuto == hora2.minuto && hora1.segundo == hora2.segundo) {
            sonIguales = true;
        }
        return sonIguales; 
    } */

    public static void main(String[] args) {
        HoraExacta h = new HoraExacta(22, 58, 58);
        HoraExacta ho = new HoraExacta(22, 58, 58);

        System.out.println(ho.equals(h));
    }
}