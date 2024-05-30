import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class E14a {
    /* @author Eloy Rodal Pérez
     * E14a. Crea un programa que inserte en la base de datos un registro para cada
     * alumno contenido en la siguiente lista:
     */
    public static void main(String[] args) throws SQLException {

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
        lista.add("Diego P");
        lista.add("Rodrigo");
        lista.add("Miguel");
        lista.add("Eloy");
        lista.add("Gonzalo");
        lista.add("Victoria");
        lista.add("David");
        lista.add("Yoel");
        lista.add("Diego");

        Connection conBD = conectarBD();
        if (conBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            // Trabajar con la BD..

            Statement consulta = conBD.createStatement();

            for (String nombre : lista) {
                String sql = "INSERT INTO alumnos (nombre) VALUES ('" + nombre + "')";
                consulta.executeUpdate(sql);
            }
            System.out.println("Consulta realizada con éxito.");
            conBD.close();
        }
    }

    static private Connection conectarBD() {
        Connection con;
        String url = "jdbc:mysql://" + BD.HOST + "/" + BD.DATABASE;
        try {
            return DriverManager.getConnection(url, BD.USER, BD.PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
