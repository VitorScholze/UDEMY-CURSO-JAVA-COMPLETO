public class Jantar {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2= new Feijao(0.1);

        System.out.println(p1.getPeso());

        p1.comer(ingrediente1);
        p1.comer(ingrediente2);

        System.out.println(p1.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);
        p1.comer(sobremesa);

        System.out.println(p1.getPeso());






    }
}
