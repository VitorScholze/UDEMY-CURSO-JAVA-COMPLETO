import java.util.ArrayList;
import java.util.List;

public class Usuario {
String email;
String nome;

Usuario(String email, String nome){
    this.email = email;
    this.nome= nome;
}


public boolean equals(Object obj) {

    if (obj instanceof Usuario) {
        Usuario outro = (Usuario) obj;
        return outro.email.equals(this.email);
       
    } else {
        return false;
    }
}


    public static void main(String[] args) throws Exception {
    
    Usuario u1 = new Usuario("vitorscholze@gmail.com" , "vitor");
    Usuario u2 = new Usuario("vitorscholze@gmail.com", "bruno");

    List<Usuario> lista = new ArrayList<>();
    
    lista.add(u1);

    System.out.println(lista.contains(u2));


    }
}
