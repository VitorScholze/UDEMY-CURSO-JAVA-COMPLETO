public class Produto {
String nome;
double preco;

Produto(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
}

String verificarDesconto(){
    return  (preco >= 100 ? "Produto com desconto " : "Produto sem desconto");
}




public static void main(String[] args) throws Exception {
        
  
   Produto p1= new Produto("Tenis", 115.0);
   Produto p2= new Produto("Chinelo", 65.0);

   System.out.println(p1.verificarDesconto());
   System.out.println(p2.verificarDesconto());

    
    



    }
}