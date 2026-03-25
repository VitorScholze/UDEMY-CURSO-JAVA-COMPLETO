import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio{
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1-produto.desconto);
        
        UnaryOperator<Double> imposto = produto -> produto >=2500 ? produto * 1.085 : produto;

        UnaryOperator<Double> frete = produto -> produto >= 3000 ? produto + 100 : produto + 50;

        UnaryOperator<Double> arredondar = produto -> Math.round(produto * 100.0) / 100.0;

        Function<Double , String> formatar = produto -> "R$" + produto;

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String precoReal = (precoFinal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));
        System.out.println("R$" + precoReal);

    }

}