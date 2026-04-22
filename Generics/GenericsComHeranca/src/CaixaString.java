public class CaixaString extends Caixa<String>{
    
    public static void main(String[] args) {
        CaixaString caixaA = new CaixaString();

        caixaA.guardar("Neymar");
        System.out.println(caixaA.abrir());


        CaixaString caixaB = new CaixaString();
        
        caixaB.guardar("Ronaldinho");
        System.out.println(caixaB.abrir());


        CaixaString caixaC = new CaixaString();
        
        caixaC.guardar("Pele");
        System.out.println(caixaC.abrir());

    }
}
