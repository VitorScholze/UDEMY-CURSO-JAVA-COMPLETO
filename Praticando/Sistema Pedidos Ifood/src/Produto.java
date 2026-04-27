public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    

    
    public String toString(){
        return "Produto: " + nome + " // Preço: R$" + preco;
    }
}
