import java.util.Date;
public class Usuario {
    String nome;
    String email;

   
    public boolean equals(Object objeto) {
        
        if( objeto instanceof Usuario){
        Usuario outro = (Usuario) objeto;
        
        boolean NomeIgual = outro.nome.equals(this.nome);
        boolean EmailIgual = outro.email.equals(this.email);
        return NomeIgual && EmailIgual;
        }else{
            return false;
        }
        // Ainda falta o HashCode.
    }
    public static void main(String[] args) throws Exception {
    
        Usuario u1 = new Usuario();
        u1.nome = "Vitor Scholze";
        u1.email = "vitorscholze@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Vitor Scholze";
        u2.email = "vitorscholze@gmail.com";
    

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));


    }
}
