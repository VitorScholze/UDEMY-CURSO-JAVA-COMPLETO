
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class App {
    public static void main(String[] args) throws Exception {
       Set<String> lista = new TreeSet<>();
       lista.add("Vitor");
       lista.add("Helo");
       lista.add("Bruno");
       lista.add("Bruna");

       for(String candidatos: lista){
        System.out.println(candidatos);
       }


       Set<Integer> nums = new HashSet<>();

       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(4);
       nums.add(5);

       for(int numeros :nums){
        System.out.println(numeros);
       }
        



        
    }
}
