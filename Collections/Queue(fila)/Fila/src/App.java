import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
       
        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // Lança uma exceção
        fila.offer("Vitor"); // Retorna Falso se a fila estiver cheia
        fila.offer("Helo");
        fila.offer("Bruno");
        fila.offer("Jackson");
        fila.offer("Carmen");
       
        //Peek e Elemente vao obter o proximo elemento da fila sem romover
        //A diferença ocorre quando a fila estiver vazia!
        System.out.println(fila.peek()); //Retorna null 
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma exceção
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty

        //Poll e Remove serve para retornar o elemento da fila ja removendo o próprio.
        System.out.println(fila.poll()); // Retorna Null
        System.out.println(fila.remove());// Lança uma exceção
        System.out.println(fila);

    
    
    
    
    }
}
