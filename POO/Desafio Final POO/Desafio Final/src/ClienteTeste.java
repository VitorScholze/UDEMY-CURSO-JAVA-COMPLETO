public class ClienteTeste {
        public static void main(String[] args) {   //DUAS COMPRAS COM DOIS ITENS E PRODUTOS DIFERENTES
            
        
        Compra c1 = new Compra();

        c1.adicionarItem("Caneta", 1, 100);
        c1.adicionarItem(new Produto("Notebook", 2000), 2);

        Compra c2 = new Compra();
        c2.adicionarItem(new Produto("Caderno", 10.0), 10);
        c2.adicionarItem(new Produto("Notebook", 1000), 1);

        Cliente cliente1 = new Cliente("Vitor");
        cliente1.compras.add(c1);
        cliente1.compras.add(c2);

        System.out.println(cliente1.obterValorTotal());

        




        }
}
