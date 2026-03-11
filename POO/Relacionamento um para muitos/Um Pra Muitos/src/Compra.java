import java.util.ArrayList;

public class Compra {
    String cliente;

    ArrayList<Item> itens = new ArrayList<>();

    double calcularTotal(){
        double total = 0;

        for(Item item: itens){
            return total =+ item.quantidade * item.preco;
        }
        return total;
    }


    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, double preco, int quantidade){
        this.adicionarItem(new Item(nome, preco, quantidade));
    }

}

