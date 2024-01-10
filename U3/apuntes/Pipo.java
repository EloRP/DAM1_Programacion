package apuntes;

public class Pipo {
        
    String popapo;
    int popopo;
    double asd;

    void añadirPopopo() {
        popopo++;
    }

    public Pipo(String popapo, int popopo, double asd) {
        this.popapo = popapo;
        this.popopo = popopo;
        this.asd = asd;
    }

    public static void main(String[] args) {
    Pipo p;
    p = new Pipo("yoquese", 213, 5434);
    p.popapo = "xdxd";
    p.popopo = 4324;
    p.asd = 7432482;

    p.añadirPopopo();
    System.out.println(p.popopo);

    }
}

    