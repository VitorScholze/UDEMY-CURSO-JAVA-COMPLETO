import java.util.ArrayList;

public class Cliente {

ArrayList<Conta> contas = new ArrayList<>();

void adicionarConta(Conta conta){
    this.contas.add(conta);
}

void mostrarContas(){
    for(Conta conta: contas){
        System.out.println("Número da conta:" + conta.numero + " / Saldo da conta:" + conta.saldo);
    }
}






}







