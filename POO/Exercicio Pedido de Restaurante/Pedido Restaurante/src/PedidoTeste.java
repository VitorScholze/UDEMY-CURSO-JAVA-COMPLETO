public class PedidoTeste {
    public static void main(String[] args) {
    
    Produto p1 = new Produto("Carne Assada", 60.0);
    itemPedido i1 = new itemPedido(p1, 2);
    Produto p2 = new Produto("Batata Frita", 25.00);
    itemPedido i2 = new itemPedido(p2, 3);


    Pedido pedido = new Pedido();
    pedido.adicionarItem(i1);
    pedido.adicionarItem(i2);

    System.out.println(pedido.valorTotal());
    }
}
