public class Retangulo extends Formas {
    double altura;
    double base;
    String nome = "Retangulo";
    Retangulo(double base,double altura){
        super(base);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        mostrarNome(nome);
        double total = this.lado * this.altura;
        System.out.println("A area total do seu retangulo e de:" + total);
    }
}
