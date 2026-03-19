import java.util.ArrayList;

public class Carrinho {

ArrayList<Produto> produtos = new ArrayList<>();

void adicionarProduto(Produto produto){
    this.produtos.add(produto);
}


void removerProduto(Produto produto){
    if(produtos.contains(produto)){
       this.produtos.remove(produto);
    }else{
        System.out.println("O produto precisa estar adicionado ao carrinho para remove-lo.");
    }
}

void mostrarCarrinho(){
    for(Produto produto: produtos){
        System.out.println("Nome:" + produto.getNome() + " -- Preço: " + produto.getPreco()+ " -- Quantidade:" + produto.getQuantidade());
    }
}

double totalCompra(){
    double total = 0;
    for(Produto produto : produtos){
        total += produto.getPreco() * produto.getQuantidade();
    }
    return total;
}

void finalizarCompra(){
    System.out.println("PRODUTOS DE SUA COMPRA:");
    for(Produto produto: produtos){
        System.out.println("Nome:" + produto.getNome() + " -- Preço: " + produto.getPreco() + " -- Quantidade:" + produto.getQuantidade());
    }
    double total = totalCompra();
    System.out.println("Total da sua compra é de:" + total + " reais");
    if(total > 100){
        total -= total * 0.1;
        System.out.println("Desconto de 10% aplicado.");
    }

    System.out.println();
    System.out.println("O total do valor do seu carrinho é de:" + total);
    System.out.println("Compra realizada com sucesso!!");
    produtos.clear();
    
    if(produtos.isEmpty()){
    System.out.println("Carrinho vazio!");
    return;
}
}







}
