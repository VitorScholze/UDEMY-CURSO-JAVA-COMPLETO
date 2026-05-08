import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        
        String stringConexao = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "12345678";

        Connection conexao = DriverManager
        .getConnection(stringConexao, usuario, senha);

        System.out.println("Conexao efetuada com sucesso!");
        conexao.close();


    }
}
