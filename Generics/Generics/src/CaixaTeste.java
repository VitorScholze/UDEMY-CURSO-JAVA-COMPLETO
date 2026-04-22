public class CaixaTeste {
    public static void main(String[] args) {

        //Guardando String
        Caixa<String> caixaA = new Caixa<>();

        caixaA.guardar("Neymar");
        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        //Guardando Double
        Caixa<Double> caixaB = new Caixa<>();

        caixaB.guardar(10.0);
        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);

        //Guardando Integer
        Caixa<Integer> caixaC = new Caixa<>();

        caixaC.guardar(15);
        Integer coisaC = caixaC.abrir();
        System.out.println(coisaC);


    }
}
