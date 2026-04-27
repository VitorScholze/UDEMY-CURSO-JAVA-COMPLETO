public class Cliente {
    String nome;
    String telefone;
    int id;
    private static int cont = 0;

    public Cliente(String nome, String telefone) {
        this.id = cont ++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString(){
        return "ID: " + id + "// Nome: " + nome + "// Telefone: " + telefone;
    }

    
}
