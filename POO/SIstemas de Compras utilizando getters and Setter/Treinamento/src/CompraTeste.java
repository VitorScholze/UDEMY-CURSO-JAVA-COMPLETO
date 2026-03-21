public class CompraTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Parafuso", 1.99, 15);
        Produto p2 = new Produto("Bola de futebol", 10.0, 2);
        Produto p3 = new Produto("HotWheels", 19.99, 2);
        Produto p4 = new Produto("Pao Frances" , 1.20 , 10);

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);

        carrinho.mostrarCarrinho();

        carrinho.removerProduto(p3);
        carrinho.mostrarCarrinho();
        carrinho.adicionarProduto(p3);

        System.out.println(carrinho.totalCompra());
        carrinho.finalizarCompra();

    }
}
