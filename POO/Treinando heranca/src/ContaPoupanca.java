public class ContaPoupanca extends Conta{

    ContaPoupanca(int numero, double saldo){
        super(numero, saldo);
    }

    void sacar(double valor){
    if(valor > saldo){
        this.saldo -= valor + valor * 0.2;
        System.out.println("foi aplicado uma taxa de 0.2 no valor sacado pois voce nao tinha saldo sufisciente.");
    }else{
        this.saldo -= valor;
    }

}

}