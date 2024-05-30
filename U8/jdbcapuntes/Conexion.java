
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {

        String sql = "CREATE TABLE alumnos ("
        + "id int(11) NOT NULL AUTO_INCREMENT, "
        + "nombre varchar(75) NOT NULL, "
        + "nota1 double DEFAULT NULL, "
        + "nota2 double DEFAULT NULL, "
        + "nota3 double DEFAULT NULL, "
        + "createdAt datetime NOT NULL DEFAULT current_timestamp(), "
        + "PRIMARY KEY (id)"
        + ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";


        Connection conBD = conectarBD();
        if (conBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            // Trabajar con la BD..
            try {
                Statement consulta = conBD.createStatement();
                consulta.executeUpdate(sql);
                System.out.println("Tabla creada correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
