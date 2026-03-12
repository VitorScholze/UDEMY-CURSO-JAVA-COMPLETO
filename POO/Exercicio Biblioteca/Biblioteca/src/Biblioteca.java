import java.util.ArrayList;

public class Biblioteca{
    ArrayList<Livro> livros = new ArrayList<>();


    void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }


    double valorLivros(){
        double total = 0;
        for(Livro livro: livros){
            total += livro.preco;
        }
        return total;
    }
}