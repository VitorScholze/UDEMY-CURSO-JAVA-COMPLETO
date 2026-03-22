public class Circulo extends Formas{
    double raio;
    String nome = "Circulo";
    Circulo(double raio){
        super(raio);
        this.raio = raio;
    }

    public void calcularArea(){
        mostrarNome(nome);
        double total = 3.14 * raio * raio;
        System.out.println("Area calculado do circulo é de:" + total);
    }
}
