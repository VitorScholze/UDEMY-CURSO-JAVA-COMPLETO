import java.util.HashSet;
public class Usuario{
String nome;

Usuario(String nome){
    this.nome = nome;
}
    

    
    @Override
public int hashCode() {
    //final int prime = 31;
    //int result = 1;
    //result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    //return result;
    return nome.length();
}




@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Usuario other = (Usuario) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    return true;
}




    public static void main(String[] args) throws Exception {
        
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Vitor"));
        usuarios.add(new Usuario("Helo"));
        usuarios.add(new Usuario("Bruno"));

        boolean resultado = usuarios.contains(new Usuario("Vitor"));
        System.out.println(resultado);

    }
}
