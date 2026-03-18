public class Banco{
    public static void main(String[] args) {
        
   Cliente cliente = new Cliente();

   Conta c1 = new Conta(12345, 5000);
   Conta c2 = new Conta(5432, 2000);
   Conta c3 = new Conta(9876, 10000);


    cliente.adicionarConta(c1);
    cliente.adicionarConta(c2);
    cliente.adicionarConta(c3);
    cliente.mostrarContas();

    c1.depositar(1200);
    System.out.println(c1.saldo);

    c2.transferir(c1, 500);
    System.out.println(c1.saldo);

    c1.sacar(4000);
    c3.sacar(5500);
    c3.mostrarSaldo();

    cliente.mostrarContas();
    c1.mostrarHistorico();





    }
}