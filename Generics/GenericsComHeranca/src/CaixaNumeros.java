public class CaixaNumeros<N extends Number> extends Caixa<N> {
    public static void main(String[] args) {
        CaixaNumeros<Double> caixaA = new CaixaNumeros<>();

        caixaA.guardar(10.0);
        System.out.println(caixaA.abrir());

        CaixaNumeros<Integer> caixaB = new CaixaNumeros<>();

        caixaB.guardar(15);
        System.out.println(caixaB.abrir());


    }
}
