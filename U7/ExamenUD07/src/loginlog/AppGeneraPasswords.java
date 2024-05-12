package loginlog;
import java.util.ArrayList;
import java.util.List;

public class AppGeneraPasswords {
    public static void main(String[] args) throws Exception {
                List<String> lista = new ArrayList<>();
        lista.add("Alberto");
        lista.add("Angel");
        lista.add("Alejandro");
        lista.add("Borja");
        lista.add("Xabier");
        lista.add("Marcos");
        lista.add("Óscar");
        lista.add("Carla");
        lista.add("Alfonso");
        lista.add("Jorge");
        lista.add("Jonathan");
        lista.add("Pedro");
        lista.add("Yeray");
        lista.add("Alex");
        lista.add("DiegoP");
        lista.add("Rodrigo");
        lista.add("Miguel");
        lista.add("Eloy");
        lista.add("Gonzalo");
        lista.add("Victoria");
        lista.add("David");
        lista.add("Yoel");
        lista.add("Diego");

        for (String nombre : lista) {
            System.out.println(nombre + ": " + CifradoBcrypt.generarHash2Y(nombre));
        }
    }
}
