
import java.util.Arrays;
import java.util.List;
public class Foreach {
    public static void main(String[] args) throws Exception {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);
        }


        System.out.println("\nLambda #01...");
        aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

        System.out.println("\nMethods Reference #03...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach((nome) -> meuImprimir(nome));

        System.out.println("\nMethods Reference #02...");
        aprovados.forEach(Foreach:: meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("oi meu nome é " + nome);
    }
}
