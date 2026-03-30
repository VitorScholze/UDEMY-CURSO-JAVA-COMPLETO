import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) throws Exception {
       
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);
    
        String[] maislangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        
        Stream.of(maislangs).forEach(print);
        Arrays.stream(maislangs).forEach(print);
        Arrays.stream(maislangs, 1, 4).forEach(print);

        List<String> outraslangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outraslangs.forEach(print);

        outraslangs.parallelStream().forEach(print);
        
        //Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n+1).forEach(println);

    
    
    
    }
}
