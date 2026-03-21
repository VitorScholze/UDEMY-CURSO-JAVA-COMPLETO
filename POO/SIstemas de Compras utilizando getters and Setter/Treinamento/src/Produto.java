public class Produto {
private String nome;
private double preco;
private int quantidade;

Produto(String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}

String getNome(){
    return nome;
}

double getPreco(){
    return preco;
}
int getQuantidade(){
    return quantidade;
}

void setPreco(double preco){
    if(preco >0){
        this.preco = preco;
    }else{
        System.out.println("ERRO, o preço precisa ser maior que 0.0");
    }
}

void setQuantidade(int quantidade){
    if(quantidade > 0){
        this.quantidade = quantidade;
    }else{
        System.out.println("Quantidade invalida!");
    }
}

@Override
public boolean equals(Object obj){
    if(this == obj) return true;

    if(obj == null || getClass() != obj.getClass()) return false;

    Produto outro = (Produto) obj;

    return this.nome.equals(outro.nome);
}



}
