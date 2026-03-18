public class TesteBanco {
    public static void main(String[] args) {
        
    Conta c1 = new ContaCorrente(123456, 5000);
 
    c1.depositar(200);
    System.out.println(c1.saldo);
    c1.sacar(200);
    System.out.println(c1.saldo);
    c1.sacar(5600);
    System.out.println(c1.saldo);
    c1.sacar(5499);
    System.out.println(c1.saldo);

    c1.depositar(100000);
    System.out.println(c1.saldo);


    ContaPoupanca c2 = new ContaPoupanca(4321, 1000);

    c2.sacar(500);
    System.out.println(c2.saldo);
    c2.sacar(1000);
    System.out.println(c2.saldo);


    Conta c3 = new Conta(3214, 0);
    c3.depositar(1000);
    System.out.println(c3.saldo);
    c3.sacar(500);
    System.out.println(c3.saldo);
    




}
}
