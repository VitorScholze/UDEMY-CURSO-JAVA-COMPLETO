public class Produto {
    String nome;
static double desconto = 0.25;
double preco;

Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
}

double Desconto(){
return preco * (1 - desconto);

}
public static void main(String[] args) throws Exception {
       
Produto.desconto = 0.29;
Produto p = new Produto("Caneta Preta" ,4356.89);

System.out.println(p.Desconto());




    }
    }