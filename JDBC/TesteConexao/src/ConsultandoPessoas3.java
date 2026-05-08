import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class ConsultandoPessoas3 {
    public static void main(String[] args) throws SQLException{

        Scanner sc = new Scanner(System.in);
        
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Digite o codigo da pessoa que voce deseja alterar o nome: ");
        int cod = sc.nextInt();
        sc.nextLine();

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, cod);

        ResultSet r = stmt.executeQuery();
        if(r.next()){
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
            
            System.out.println("O nome atual e : " + p.getNome());

            System.out.println("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome);
            stmt.setInt(2, cod);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        }else{
            System.out.println("Pessoa nao encontrada!");
        }
    
        
        sc.close();
        conexao.close();
        stmt.close();

    }
}
