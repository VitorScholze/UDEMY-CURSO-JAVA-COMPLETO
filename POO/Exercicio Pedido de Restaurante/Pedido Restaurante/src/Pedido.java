import java.util.ArrayList;

public class Pedido {

ArrayList<itemPedido> itens = new ArrayList<>();

void adicionarItem(itemPedido item){
    this.itens.add(item);
}

double valorTotal(){
    double total = 0;
    for(itemPedido item: itens){
        total += item.quantidade *item.produto.preco;
    }
    return total;
}




}
