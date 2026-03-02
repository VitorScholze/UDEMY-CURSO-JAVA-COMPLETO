public class Pessoa {
    String nomePessoa;
    double pesoPessoa = 78.2;
    
    
    Pessoa(String nome, double peso){
        this.nomePessoa = nome;
        

    }

    void Comer(Comida comida){
        pesoPessoa += comida.pesoComida;  
    }
public static void main(String[] args) {

   
}
}
