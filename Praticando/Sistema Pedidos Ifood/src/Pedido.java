import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    
    int id;
    String status;

    Scanner sc = new Scanner(System.in);

    private static int cont = 1;
    Pedido(){
        this.id = cont++;
        this.status = "Pendente";
    }

    ArrayList<ItemPedido> itensPedido = new ArrayList<>();

   void adicionarItem(Produto p, int quantidade){

        if(p != null && quantidade > 0){
            ItemPedido item = new ItemPedido(p, quantidade);
            itensPedido.add(item);
        }else{
            System.out.println("Produto invalido ou quantidade menor que 0");
        }
    }

    

    double calcularTotal(){
        double total = 0;

    for(ItemPedido p : itensPedido){
        total += p.produto.preco * p.quantidade;
    }

    return total;
}

   void alterarStatus(String novoStatus){
    if(novoStatus.equals("Pendente") || 
       novoStatus.equals("Em preparo") || 
       novoStatus.equals("Finalizado")) {

        this.status = novoStatus;

    } else {
        System.out.println("Status inválido");
    }
}
    @Override
public String toString() {
    return "Pedido ID: " + id + " | Status: " + status;
}



}
