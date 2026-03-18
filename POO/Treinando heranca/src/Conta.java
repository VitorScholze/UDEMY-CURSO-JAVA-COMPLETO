public class Conta {
int numero;
double saldo;

Conta(int numero, double saldo){
    this.numero = numero;
    this.saldo = saldo;
}

void depositar(double valor){
this.saldo += valor;
}

void sacar(double valor){
    if(valor > saldo){
        System.out.println("Saldo insufisciente");
    }else{
        this.saldo -= valor;
    }
}
public String toString(){
    return "Seu saldo atual é de " + saldo;
}
}
