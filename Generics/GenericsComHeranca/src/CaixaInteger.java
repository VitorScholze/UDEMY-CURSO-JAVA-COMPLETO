public class CaixaInteger extends Caixa<Integer>{
    
    public static void main(String[] args) {
        CaixaInteger caixaA = new CaixaInteger();
        caixaA.guardar(10);
        System.out.println(caixaA.abrir());


        CaixaInteger caixaB = new CaixaInteger();
        caixaB.guardar(20);
        System.out.println(caixaB.abrir());

        CaixaInteger caixaC = new CaixaInteger();
        caixaC.guardar(20);
        System.out.println(caixaC.abrir());
    }
}
