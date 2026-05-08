import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException{
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo: ");
        int codigo = sc.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa deletada com sucesso!");
        }else{
            System.out.println("Pessoa nao encontrada!");
        }

        sc.close();
        conexao.close();
    }
}
