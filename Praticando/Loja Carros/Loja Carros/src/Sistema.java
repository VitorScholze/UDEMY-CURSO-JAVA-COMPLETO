import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Venda> vendas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Sistema(){
        executar();
    }

    void executar(){
    int opcao;

    do{
        System.out.println("\n=== SISTEMA ===");
        System.out.println("1 - Cadastrar Carro");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Realizar Venda");
        System.out.println("4 - Listar Carros");
        System.out.println("5 - Listar Clientes");
        System.out.println("6 - Listar Vendas");
        System.out.println("0 - Sair");

        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1: cadastrarCarro(); break;
            case 2: cadastrarCliente(); break;
            case 3: realizarVenda(); break;
            case 4: listarCarros(); break;
            case 5: listarClientes(); break;
            case 6: listarVendas(); break;
        }

        }while(opcao != 0);
        }
    


    void cadastrarCarro(){
        System.out.println("Digite a marca do carro:");
        String marca = sc.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.println("Valor do carro: R$");
        double valor = sc.nextDouble();
        sc.nextLine();

        Carro carro = new Carro(marca, modelo, ano, valor);
        carros.add(carro);

        System.out.println("Carro cadastrado com sucesso!");
    }

    void listarCarros(){

        if(carros.isEmpty()){
            System.out.println("Nenhum carro cadastrado.");
            return;
        }
        for(Carro c: carros){
            System.out.println(c);
        }
    }

    void cadastrarCliente(){
        System.out.println("Nome do cliente:");
        String nome = sc.nextLine();

        System.out.println("Telefone:");
        String telefone = sc.nextLine();

        if(nome != null && !nome.isEmpty()){
            Cliente cliente = new Cliente(nome, telefone);
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }else{
            System.out.println("Um dos campos ou os dois estão invalidos!");
        }

    }

    void listarClientes(){

        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado");
        }
        for(Cliente c: clientes){
                 System.out.println(c);
        }
    }

    
    void realizarVenda(){
    Carro carro;
    Cliente cliente;
    double valorVenda = 0;

        System.out.println("Para adicionar uma venda digite +, para sair digite -.");
        String resp = sc.nextLine();

        while(resp.equals("+")){
            for(Carro c: carros){
            System.out.println(c);
        }
        carro = null;
        System.out.println("-------------\n");

        System.out.println("Digite o ID do carro que ira ser vendido:");
        int id = sc.nextInt();
        sc.nextLine();

        for(Carro c: carros){
            if(c.id == id){
            carro = c;
            valorVenda = c.preco;
            break;
            }
        }

        if(carro == null){
        System.out.println("ID INEXISTENTE!");
        return;
        }   
        System.out.println("--------------------------\n");
        for(Cliente c : clientes){
            System.out.println(c);
        }

        System.out.println("Digite o id do cliente que ira comprar:");
        int idCliente = sc.nextInt();
        sc.nextLine();

        cliente = null;

        for(Cliente c: clientes){
            if(c.id == idCliente){
            cliente = c;
            break;
            }
        }   

        carros.remove(carro);
        if(cliente == null){
        System.out.println("ID INEXISTENTE!");
        return;
        }
        
        
        System.out.println("Cliente:" + cliente);
        System.out.println("Carro Vendido:" +  carro);
        System.out.println("Valor da venda: " + valorVenda);

        Venda venda = new Venda(cliente, carro, valorVenda);
        vendas.add(venda);

        while(resp.equals("+")){

        System.out.println("Digite + para continuar ou - para sair:");
        resp = sc.nextLine();
}
        }
    }


    void listarVendas(){
        if(vendas.isEmpty()){
            System.out.println("Ainda nao tem nenhuma venda cadastrada.");
        }else{
            for(Venda v: vendas){
                System.out.println(v);
            }
        }
    }


    void buscarCarroPorId(){

        boolean encontrado = false;
        System.out.println("Digite o id do carro que voce procura:");
        int id = sc.nextInt();

        for(Carro carro: carros){
            if(carro.id == id){
                System.out.println(carro);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Nenhum carro com esse ID foi encontrado.");
        }
    }


    void buscarClientePorId(){

        boolean encontrado = false;
        System.out.println("Digite o id do cliente:");
        int id = sc.nextInt();

        for(Cliente cliente: clientes){
            if(cliente.id == id){
                System.out.println(cliente);
                encontrado = true;
                break;
        }
        
    }
    if(!encontrado){
        System.out.println("Nenhum cliente com esse ID foi encontrado.");
    }

}
public static void main(String[] args) {
    Sistema sistema = new Sistema();
    sistema.executar();
}


}
