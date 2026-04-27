public class Carro {
    String marca;
    String modelo;
    int ano;
    double preco;
    int id;
    private static int cont = 0;

    public Carro(String marca, String modelo, int ano, double preco) {
        this.id = cont ++;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String toString(){
        return "ID: " + id + "// Marca: " + marca + "// Modelo: " + modelo + "// Ano: " + ano + "// Preço: " + preco;
    }

    
}
