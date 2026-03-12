public class BibliotecaTeste {

    public static void main(String[] args) {
        
    Livro l1 = new Livro("Pé de feijao", "Caio castro", 10.0);
    Livro l2 = new Livro("Carros", "Felipe luis", 15.0);
    Livro l3 = new Livro("Gato de Botas", "Fiona", 58.0);

    Biblioteca b1 = new Biblioteca();
    b1.adicionarLivro(l1);
    b1.adicionarLivro(l2);
    b1.adicionarLivro(l3);

    System.out.println(b1.valorLivros());




    }
}
