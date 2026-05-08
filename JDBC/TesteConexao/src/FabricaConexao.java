import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

    public static Connection getConexao() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String stringConexao =
                    "jdbc:mysql://**************";

            String usuario = "*****";
            String senha = "**********";

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
