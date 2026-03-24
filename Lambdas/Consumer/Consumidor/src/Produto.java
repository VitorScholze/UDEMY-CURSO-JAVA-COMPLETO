public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }


    public String toString(){
        double total = preco * (1 - desconto);
        return "Nome:" + nome + " tem preço de R$ "  + total;
    }
}
