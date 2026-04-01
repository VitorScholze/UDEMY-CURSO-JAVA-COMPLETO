import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Produto {
    String nome; 
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String toString(){
        return  nome + " Preco: "+  preco;
    }


    public static void main(String[] args) throws Exception {
        
        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", 3500, 5),
            new Produto("Mouse", 80, 20),
            new Produto("Teclado", 150, 10),
            new Produto("Monitor", 900, 3),
            new Produto("Cabo USB", 25, 50)
        );

         produtos.stream()
            .filter(p -> p.preco > 100)
            .map(p -> p.nome)
            .toList()
            .forEach(System.out::println);

        double total = produtos.stream()
            .filter(p -> p.preco > 100)
            .map(p -> p.preco)
            .reduce(0.0 , (acc, n) -> acc + n);
            System.out.println("O total é: " + total);

        boolean estoqueMaior0 = produtos.stream()
                .allMatch(p -> p.estoque > 0);
        System.out.println(estoqueMaior0);

        boolean precoMenor50 = produtos.stream()
                .anyMatch(p -> p.preco < 50);
        System.out.println(precoMenor50);

        boolean estoque0 = produtos.stream()
                .noneMatch(p -> p.estoque == 0);
        System.out.println(estoque0);

        Comparator<Produto> maisCaro = (produto1, produto2) ->{
                if(produto1.preco > produto2.preco) return 1;
                if(produto1.preco < produto2.preco) return -1;
                return 0;
        };

        System.out.println("O mais caro: " + produtos.stream().max(maisCaro).get());
        System.out.println("O mais barato: " + produtos.stream().min(maisCaro).get());
        

        System.out.println(produtos.stream()
                .filter(p -> p.estoque > 0)
                .max(maisCaro).get()
                );
        
        System.out.println("Mais caro ao mais barato: ");
        produtos.stream()
                .sorted(Comparator.comparing((Produto p) -> p.preco).reversed())
                .forEach(System.out::println);

        System.out.println("Mais barato ao mais caro: ");
        produtos.stream()  
                .sorted(Comparator.comparing(p -> p.preco))
                .forEach(System.out::println);
            
        Map<String, List<Produto>> grupos = produtos.stream()
        .collect(Collectors.groupingBy(p -> {
        if (p.preco < 100) return "Barato";
        else if (p.preco <= 1000) return "Médio";
        else return "Caro";
        }));

        System.out.println(grupos);

        
                
                
                



    }
}
