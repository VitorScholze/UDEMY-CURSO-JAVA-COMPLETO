import java.util.ArrayList;

public class Conta {
int numero;
double saldo;

Conta(int numero, double saldo){
    this.numero = numero;
    this.saldo = saldo;
}

ArrayList<String> historico = new ArrayList<>();

void depositar(double valor){
    if(valor > 0){
        saldo += valor;
        System.out.println("Valor " + valor + " depositado com sucesso");
        historico.add("Depósito de " + valor);
    }else{
        System.out.println("ERRO, valor precisa ser maior que zero!");
    }
}

void sacar(double valor){
    double total = valor + valor * 0.05;
    if(this.saldo >= total){
        this.saldo -= total;
        System.out.println("Saque de "+ total + " reais Realizado!");
        historico.add("Saque realizado de " + total +  " realizado");
    }else{
        System.out.println("Saldo Insufisciente");
    }
}

void transferir(Conta conta, double valor){
    if(this.saldo < valor){
        System.out.println("Saldo Insufisciente!!");
    }else{
        this.saldo -= valor;
        conta.saldo += valor;
        System.out.println("Transferencia de " + valor + " reais concluida com sucesso!!");
        historico.add("Transferencia de " + valor + " concluida com sucesso!!");
    }
}

void mostrarSaldo(){
    System.out.println("Saldo atual: "+ saldo);
}

public String toString(){
    return "Seu saldo atual é de:" + saldo + " reais";
}

void mostrarHistorico(){
    int i = 1;
    for(String conta: historico){
        System.out.println("Transacao " + i++ + ":"+ conta);
    }
}

}
