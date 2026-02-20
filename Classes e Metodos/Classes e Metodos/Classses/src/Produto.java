
public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoDesconto(){
      return preco * ( 1 - desconto);
    
    }
    public static void main(String[] args) throws Exception {
    
    

    Produto p1 = new Produto();
      p1.nome = "Notebook";
      p1.preco = 4356.89;
      p1.desconto = 0.25;

    Produto p2 = new Produto();
      p2.nome = "Caneta Preta";
      p2.preco = 12.56;
      p2.desconto = 0.29;
   
    System.out.println(p1.nome);
    double PrecoFinal1 = p1.precoDesconto();

    System.out.println(p2.nome);
    double PrecoFinal2 = p2.precoDesconto();

    double MediaCompra = (PrecoFinal1 + PrecoFinal2) /2;

    System.out.printf("Média do carrinho de compras: %.2f" , MediaCompra);






    }
}
