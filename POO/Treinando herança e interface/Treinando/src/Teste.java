public class Teste {
    public static void main(String[] args) {
        Formas f1 = new Quadrado(5);
        Formas f2 = new Circulo(5);
        Formas f3 = new Retangulo(3, 5);

        f1.calcularArea();
        f2.calcularArea();
        f3.calcularArea();

    }
}
