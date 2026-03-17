public class ContaCorrente extends Conta{

ContaCorrente(int numero, double saldo){
    super(numero , saldo);

}

void sacar(double valor){
    if(saldo - valor < -500){
        System.out.println("Limite de saldo atingido(-500)");
    }else{
        this.saldo -= valor;
    }
}




}