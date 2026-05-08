import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

    public static Connection getConexao() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String stringConexao =
                    "jdbc:mysql://localhost:3306/curso_java";

            String usuario = "root";
            String senha = "12345678";

            return DriverManager.getConnection(
                    stringConexao,
                    usuario,
                    senha
            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}