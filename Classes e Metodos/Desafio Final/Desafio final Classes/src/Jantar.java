public class Jantar {

public static void main(String[] args) {
     
    System.out.println("RESUMINDO JANTAR DA PRIMEIRA PESSOA:");
    Pessoa p1 = new Pessoa("Vitor", 78.2);
    Comida c1= new Comida("Arroz", 0.2);
    System.out.println("Nome da comida: " + c1.nomeComida + " // Peso da comida :" + c1.pesoComida);
    
    System.out.println("Pessoa da pessoa antes de comer:" + p1.pesoPessoa);
    p1.Comer(c1);
    System.out.println("Pessoa da pessoa depois de comer:" + p1.pesoPessoa);

    System.out.println();
    
    System.out.println("RESUMINDO JANTAR DA SEGUNDA PESSOA:");
    Pessoa p2 = new Pessoa("Carlos", 89.2);
    Comida c2 = new Comida("Feijao ", 0.4);
    System.out.println("Nome da comida: " + c2.nomeComida + " // Peso da comida :" + c2.pesoComida);
    
    System.out.println("Pessoa da pessoa antes de comer:" + p2.pesoPessoa);
    p2.Comer(c2);
    System.out.printf("Peso da pessoa depois de comer: %.2f" , p2.pesoPessoa);

    
    
}
}
