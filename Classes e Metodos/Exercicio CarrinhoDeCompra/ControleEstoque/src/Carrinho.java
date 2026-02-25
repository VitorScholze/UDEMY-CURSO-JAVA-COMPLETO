public class Carrinho {
    String cliente;
    double total;
    boolean aberto;
    int estoqueProduto;
    double precoProduto;

    Carrinho(String cliente){
        this.cliente = cliente;
        this.total = 0.0;
        this.aberto = true;
        this.estoqueProduto = 10;
        this.precoProduto = 100.0;
    }


    void adicionarProduto(int quantidade){
       
      if (aberto) {
        if (quantidade > 0) {
           if (estoqueProduto >= quantidade) {
                total += quantidade * precoProduto;
                 estoqueProduto -= quantidade;
            } else {
               System.out.println("Estoque insuficiente!");
        }
    }
}
    }

    void fecharCarrinho(){
        if(total > 0){
            aberto = false;
        }
    }

    String status(){
    return "Cliente:" + cliente + '\n' +
            "Total:" + total + '\n' +
            "Estoque restante:" + estoqueProduto + '\n' +
            "Status:" + (aberto ? "Carrinho Aberto" : "Carrinho fechado");
    }

    public static void main(String[] args) throws Exception {
    
    
    Carrinho c1 = new Carrinho("Vitor Scholze");
    
    c1.adicionarProduto(64);
    c1.adicionarProduto(100);
    c1.fecharCarrinho();
    c1.adicionarProduto(29);
    System.out.println(c1.status());

    
    }
}
