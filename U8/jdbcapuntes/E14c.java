import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class E14c {
    /*
     * @author Eloy Rodal Pérez
     * E14c. Crea un nuevo campo en la tabla Alumno, curso, de tipo Varchar 20, con
     * NULL como valor predeterminado.
     * Crea un programa que inicialice ese campo para cada alumno de manera
     * aleatoria entra los siguientes valores: “1A, 1B, 2A, 2B”.
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

        crearCurso();
        Connection conBD = conectarBD();

        for (String nombre : lista) {
            String curso = "";
            int opcionCurso = (int) (Math.random() * 4) + 1;
            Statement consulta = conBD.createStatement();

            switch (opcionCurso) {
                case 1 -> curso = "1A";
                case 2 -> curso = "1B";
                case 3 -> curso = "2A";
                case 4 -> curso = "2B";
            }
            String sql = "UPDATE alumnos set curso = '" + curso + "' WHERE nombre = '" + nombre + "'";
            consulta.executeUpdate(sql);
        }
    }

    public static void crearCurso() throws SQLException {
        Connection conBD = conectarBD();
        if (conBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            Statement consulta = conBD.createStatement();
            String sql = "ALTER TABLE alumnos " +
                    "ADD curso varchar(23) NULL";
            String borrarCurso = "ALTER TABLE `alumnos` " +
                                 "DROP `curso`";

            consulta.executeUpdate(borrarCurso);
            consulta.executeUpdate(sql);
        }

    }

    static private Connection conectarBD() {
        String url = "jdbc:mysql://" + BD.HOST + "/" + BD.DATABASE;
        try {
            return DriverManager.getConnection(url, BD.USER, BD.PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
