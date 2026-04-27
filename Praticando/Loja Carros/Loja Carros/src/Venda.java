public class Venda {
    int id; 
    Cliente cliente;
    Carro carro;
    double valor;
    private static int cont = 0;

    public Venda( Cliente cliente, Carro carro, double valor) {
        this.id = cont++;
        this.cliente = cliente;
        this.carro = carro;
        this.valor = valor;
    }


    public String toString(){
        return "Cliente: " + cliente + "/ / Informacoes do Carro-> -- Carro: " + carro + "// Valor:: "+ valor;
    }
    
}
