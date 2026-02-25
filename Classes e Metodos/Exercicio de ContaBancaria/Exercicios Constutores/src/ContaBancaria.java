public class ContaBancaria {

    String titular;
    double saldo;
    boolean ativa;

    ContaBancaria(String titular, double saldo , boolean ativa){
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    void depositar(double valor){
        if(!ativa){
            System.out.println("Conta Inativa");
        }else if(valor <= 0){
            System.out.println("Valor invalido");
        }else{
            saldo += valor;
        }
    }

    void sacar(double valor){
        if(!ativa){
             System.out.println("Conta inativa.");
            }else if(valor <= 0){
                System.out.println("Valor inválido.");
            }else if(valor > saldo){
                System.out.println("Saldo insuficiente.");
            }else{
                saldo -= valor;
            }
            }
        
            

   void desativarConta(){
        if(saldo == 0){
            ativa = false;
        }else{
            System.out.println("Não é possivel desativar.");
        }
    }
    
    void transferir(double valor, ContaBancaria destino){
        if(!ativa){
            System.out.println("Conta Inativa");
        }else if(valor <=0){
            System.out.println("Valor Invalido");
        }else if(valor > saldo){
            System.out.println("Saldo Insufisciente");
        }else{
            this.sacar(valor);
            destino.saldo += valor;
        }
        }
    String status(){
        return "Titular:"+ titular + "\n"+
                "Saldo:" + saldo +"\n"+
                "Status:" + (ativa ? "Conta Ativa" : "Conta Desativada")  ;
    }

    public static void main(String[] args) {


    ContaBancaria c1 = new ContaBancaria("Vitor Scholze", 0.0 , true);
    ContaBancaria c2 = new ContaBancaria("Heloisa Gomes", 0.0 , true);
    
        c1.depositar(600);
        c1.transferir(300, c2);
        System.out.println(c1.status());
        System.out.println(c2.status());

    }
}