
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class anhadirNotaMedia {

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

        for (String nombre : lista) {
            Connection conBD = conectarBD();
            String sql = "UPDATE alumnos " +
                    "SET notamedia = ((nota1 + nota2 + nota3) / 3) " +
                    " WHERE nombre = '" + nombre + "'";
                    Statement consulta = conBD.createStatement();
                    consulta.executeUpdate(sql);
                }
            
    }

    public static void creacionMedia() throws SQLException {
        Connection conBD = conectarBD();
        if (conBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            Statement consulta = conBD.createStatement();
            String sql = "ALTER TABLE alumnos " +
                    "ADD notamedia double NULL";

            consulta.executeUpdate(sql);
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
