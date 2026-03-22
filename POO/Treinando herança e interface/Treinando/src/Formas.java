public abstract class Formas implements Calculos {
    double lado;

    Formas(double lado){
        this.lado = lado;
    }
    
    void mostrarNome(String nome){
        System.out.println("Forma calculada:" + nome);
    }
}
