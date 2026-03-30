import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = new Carro("BMW M2", 450 , true);
        Carro c2 = new Carro("AUDI RS4", 570, false);
        Carro c3 = new Carro("MERCEDES A45 AMG", 340, true);
        Carro c4 = new Carro("LAMBORGHINI AVENTENTADOR SVJ", 780, true);
        Carro c5 = new Carro("FERRARI 488 PISTA", 796, true);
        Carro c6 = new Carro("PORSCHE 911 TURBO S", 570, false);

        List<Carro> carros= Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Carro> filtroEsportivo = c -> c.cavalos >= 350;
        Predicate<Carro> promocao = c -> c.promocao;

        System.out.println("CARROS COM DESCONTO E MAIS DE 350CV:");
        carros.stream()
              .filter(filtroEsportivo)
              .filter(promocao)
              .map(c -> "-" + c.modelo + " com " + c.cavalos + " de potencia")
              .forEach(System.out::println);
    }
}

