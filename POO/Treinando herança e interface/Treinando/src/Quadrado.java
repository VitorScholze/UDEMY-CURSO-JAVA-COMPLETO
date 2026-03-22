public class Quadrado extends Formas {
    double lados;
    String nome = "Quadrado";
    Quadrado(double lados){
        super(lados);
        this.lados = lados;
    }

    public void calcularArea(){
        mostrarNome(nome);
        double total = lado * lado;
        System.out.println("O total da area desse quadrado é de:" + total);
    }
}   
