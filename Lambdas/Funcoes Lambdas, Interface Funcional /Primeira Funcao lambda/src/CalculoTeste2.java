public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (a, b) -> {
        return a + b;
    };
    System.out.println(calc.executar(2, 3));

    calc = (a, b) -> a * b; // Sem as chaves quer dizer que o a * b sera retornado( e nao pode ter mias de uma linha de codigo) Se tiver chaves, precisa adicionar o "return".(e pode ter mias de uma linha de codigo;

    System.out.println(calc.executar(2, 3));



    }
    
    
}
