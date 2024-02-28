package herenciaejercicios;

public class EP0822 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Recolectando objeto " + this);
        super.finalize();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            Object obj = new Object();
            obj = null;
        }
    }
}
