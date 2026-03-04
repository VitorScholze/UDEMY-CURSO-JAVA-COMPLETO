import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    
    
    public static void main(String[] args) throws Exception {
    
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O menino de pijama listrado");
        livros.add("Don Quixote");
        livros.push("O Hobbit");

        for(String livro: livros){
            System.out.println(livro);
        }
        System.out.println(livros.peek());
        System.out.println(livros.element());
       
        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.remove());



    }
}
