public class CompraTeste {


    public static void main(String[] args) {
        System.out.println("COMPRAS REALIZADAS");
        Compra c1 = new Compra();
        c1.cliente = "vitor scholze";
        c1.adicionarItem(new Item("Caneta azul", 4.19, 4));
        c1.adicionarItem(new Item("Pao", 0.89, 15));
        c1.adicionarItem(new Item("Borracha", 3.19, 4));
        c1.adicionarItem(new Item("Bolacha", 3.55, 5));



      
        
        System.out.println(c1.itens.size());
        System.out.println(c1.calcularTotal());
    }
}
