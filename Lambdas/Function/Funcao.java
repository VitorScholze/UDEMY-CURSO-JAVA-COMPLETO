import java.util.function.Function;

public class Funcao{
    public static void main(String[] args) {
        //Neste caso o Function está recebdno um Integer e retornando um valor String.
        
        Function<Integer, String> parOuImpar = n -> n % 2 ==0 ? " Par" : "Impar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE = valor -> "O resultado é:" + valor;

        Function<String, String> empolgado = valor -> valor + "!!!!";

        Function<String, String> duvida = valor -> valor + "???";

        String resultadoFinal1 = (parOuImpar
            .andThen(oResultadoE)
            .andThen(empolgado)
            .apply(32));
        
        System.out.println(resultadoFinal1);

        String resultadoFinal2 = (parOuImpar
            .andThen(oResultadoE)
            .andThen(duvida)
            .apply(32));

        System.out.println(resultadoFinal2);

        
        


    }
}