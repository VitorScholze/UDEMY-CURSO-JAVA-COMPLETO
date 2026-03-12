public class itemPedido {
int quantidade;
Produto produto;


itemPedido(Produto produto, int quantidade){
    this.produto = produto;
    this.quantidade = quantidade;
}

itemPedido(String nome, double preco, int quantidade){
    var pedido = new Produto("Batata Frita", 15.00);
    new itemPedido(pedido, quantidade);
}

}
