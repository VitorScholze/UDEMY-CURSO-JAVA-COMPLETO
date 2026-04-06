import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carro {
    String modelo;
    int ano;
    double preco;
    int cavalos;

    Carro(String modelo, int ano, double preco, int cavalos) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.cavalos = cavalos;
    }

    public String toString() {
        return modelo + " | Ano: " + ano + " | Preço: " + preco + " | CV: " + cavalos;
    }

    public static void main(String[] args) {

        List<Carro> carros = Arrays.asList(
            new Carro("Civic", 2020, 120000, 155),
            new Carro("Gol", 2018, 40000, 75),
            new Carro("BMW", 2022, 300000, 250),
            new Carro("Corolla", 2020, 130000, 170),
            new Carro("HB20", 2022, 80000, 100),
            new Carro("Onix", 2020, 80000, 116),
            new Carro("Audi", 2022, 300000, 220)
        );

        System.out.println("Carros filtrados e ordenados:");
        carros.stream()
            .filter(c -> c.ano >= 2020 && c.cavalos > 120)
            .sorted(Comparator.comparingDouble(c -> c.preco))
            .forEach(System.out::println);

        System.out.println("\nMELHOR CARRO:");
        carros.stream()
            .max(
                Comparator
                    .comparingInt((Carro c) -> c.ano)
                    .thenComparingInt(c -> c.cavalos)
                    .thenComparing(Comparator.comparingDouble((Carro c) -> c.preco).reversed())
            )
            .ifPresent(System.out::println);

        Map<Integer, List<Carro>> porAno =
            carros.stream()
                .collect(Collectors.groupingBy(c -> c.ano));

        System.out.println("\nCarros agrupados por ano:");
        porAno.forEach((ano, lista) -> {
            System.out.println("Ano: " + ano);
            lista.forEach(System.out::println);
        });

        
        Map<Integer, Optional<Carro>> maisCaroPorAno =
            carros.stream()
                .collect(
                    Collectors.groupingBy(
                        c -> c.ano,
                        Collectors.maxBy(Comparator.comparingDouble(c -> c.preco))
                    )
                );

        System.out.println("\nCarro mais caro por ano:");
        maisCaroPorAno.forEach((ano, carroOpt) -> {
            System.out.println("Ano: " + ano);
            carroOpt.ifPresent(System.out::println);
        });
    }
}