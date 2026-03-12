public class lojaTeste {
    public static void main(String[] args) {
        
    Celular c1 = new Celular("Iphone", "15 pro", 5700);
    Celular c2 = new Celular("Iphone ","17 pro max" , 8200);
    Celular c3 = new Celular("Iphone", "16 ", 6100);


    Loja loja = new Loja();
    loja.adicionarCelular(c1);
    loja.adicionarCelular(c2);
    loja.adicionarCelular(c3);

    loja.celularMaisCaro();
    }
}
