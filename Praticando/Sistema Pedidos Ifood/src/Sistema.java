import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Pedido> pedidos = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();


    Sistema(){
    executar();
    }

    Scanner sc = new Scanner(System.in);

    void executar(){
        

        while(true){
            System.out.println("\n=== SISTEMA ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Produto");
            System.out.println("3 - Criar Pedido");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Listar Pedidos");
            System.out.println("6 - Alternar Status do Pedido");
            System.out.println("7 - Valor total do Pedido");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();
            

            switch(opcao){
                case 1:
                    cadastrarClientes();
                    break;

                case 2:
                    cadastrarProdutos();
                    break;

                case 3:
                    criarPedido();
                    break;

                case 4:
                    listarProdutos();
                    break;

                case 5:
                    listarPedidos();
                    break;

                case 6:
                    alterarStatusPedido();
                    break;

                case 7:
                    mostrarTotalPedido();
                    break;

                case 0:
                    return;
            }
        }
             
    }

    Pedido buscarPedidoPorId(int id){
    for(Pedido p : pedidos){
        if(p.id == id){
            return p;
        }
    }
    return null;
    }

    void mostrarTotalPedido(){
    System.out.println("Digite o ID do pedido:");
    int id = sc.nextInt();

    Pedido pedido = buscarPedidoPorId(id);

    if(pedido != null){
        double total = pedido.calcularTotal();
        System.out.println("Total: R$" + total);
    } else {
        System.out.println("Pedido não encontrado");
    }
}

    void alterarStatusPedido() {
    listarPedidos();

    System.out.println("Escolha o índice do pedido:");
    int i = sc.nextInt();

    if(i >= 0 && i < pedidos.size()){
        System.out.println("1 - Pendente");
        System.out.println("2 - Em preparo");
        System.out.println("3 - Finalizado");

        int op = sc.nextInt();

        String status = "";

        switch(op){
            case 1: status = "Pendente"; break;
            case 2: status = "Em preparo"; break;
            case 3: status = "Finalizado"; break;
        }

        pedidos.get(i).alterarStatus(status);
        System.out.println("STATUS ATUALIZADO");
    }
}

    void criarPedido(){
        Pedido pedido = new Pedido();
        listarProdutos();
        System.out.println("Escolha um indice da lista de produtos ou Digite -1 para SAIR");
        int index = sc.nextInt();
        sc.nextLine();

        if(index >= 0 && index < produtos.size()){
            System.out.println("Qual a quantidade do produto?");
            int qtd = sc.nextInt();
            sc.nextLine();
            
            pedido.adicionarItem(produtos.get(index), qtd);
        }else{
            System.out.println("Produto Invalido.");
        }

        pedidos.add(pedido);
        System.out.println("Pedido Criado Com Sucesso.");
    }

    void listarProdutos(){
        produtos.stream()
                .forEach(System.out::println);
    }

    void listarPedidos(){
        pedidos.stream()
               .forEach(System.out::println);
    }

    void cadastrarClientes(){
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu telefone:");
        Integer telefone = sc.nextInt();
        sc.nextLine();

        if(nome != null){  
            clientes.add(new Cliente(nome, telefone));
            System.out.println("Cliente Cadastrado");
        }else{
            System.out.println("Informacoes Invalidas");
        }
    }



    void cadastrarProdutos(){
        System.out.println("Nome do Produto: ");
        String nome = sc.nextLine();

        System.out.println("Preço do Produto: ");
        Double preco = sc.nextDouble();
        sc.nextLine();

        System.out.println("Qtd em estoque:");
        Integer estoque = sc.nextInt();
        sc.nextLine();

        if(nome != null && preco != null && estoque != null){
            produtos.add(new Produto(nome, preco, estoque));
            System.out.println("Produto Cadastrado");
        }else{
            System.out.println("Informacoes Invalidas");
        }
    }

    public static void main(String[] args) {
        new Sistema();

        
    }
}
