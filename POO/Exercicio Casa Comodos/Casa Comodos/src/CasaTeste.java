public class CasaTeste{


public static void main(String[] args) {

Quarto q1 =  new Quarto("Quarto do vitor", 17.0);
Quarto q2 =  new Quarto("Quarto do bruno", 21.0);

Casa c1 = new Casa("Casa do Carlos");
c1.adicionarQuarto(q1);
c1.adicionarQuarto(q2);

Quarto q3 =  new Quarto("Quarto da helo", 28.0);
Quarto q4 =  new Quarto("Quarto do bruno", 18.5);

Casa c2 = new Casa("Casa do vitor");

c2.adicionarQuarto(q3);
c2.adicionarQuarto(q4);

System.out.println(c1.tamanhoTotalCasa());
System.out.println(c2.tamanhoTotalCasa());

Pessoa pessoa = new Pessoa("Vitor Scholze");
pessoa.adicionarCasa(c1);
pessoa.adicionarCasa(c2);

pessoa.maiorCasa();

Casa casaMaior = pessoa.maiorCasa();

System.out.println("A maior casa é: " + casaMaior.nome + " com o tamanho de " + casaMaior.tamanhoTotalCasa());








}
}