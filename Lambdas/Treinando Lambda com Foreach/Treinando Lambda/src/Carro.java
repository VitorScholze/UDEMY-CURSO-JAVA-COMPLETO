import java.util.ArrayList;

public class Carro {
    String nome;
    int velocidade;
    boolean ligado;

    Carro(String nome, int velocidade, boolean ligado){
        this.nome = nome;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }

    void acelerar(int valor){
        this.velocidade += 20;
    }
    
    public static void main(String[] args) throws Exception {
        ArrayList<Carro> carros = new ArrayList<>();
        
        Carro c1 = new Carro("BMW M4", 20,true );
        Carro c2 = new Carro("AUDI RS6", 60, true);
        Carro c3 = new Carro("LAMBORGHINI AVENTADOR", 80, false);
        Carro c4 = new Carro("MECERDES AMG", 100, false);

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);


        carros.forEach(c -> {
            System.out.println("Modelo do carro:" + c.nome + " // Está ligado? " + c.ligado);
        });
        System.out.println();

        carros.forEach(c -> {
            if(c.ligado == true){
                c.acelerar(20);
            }
        });
        System.out.println();


        carros.forEach(c -> {
            if(c.velocidade > 60 && c.ligado == true){
                System.out.println("Carros prontos para a corrida: " + c.nome);
            }
        });
        System.out.println();

        carros.forEach(c -> {
            if(c.velocidade > 100){
                System.out.println(c.nome + " é muito rapido");
            }else if(c.velocidade >= 50 && c.velocidade < 100){
                System.out.println(c.nome  + " é rapido");
            }else if(c.velocidade < 50){
                System.out.println(c.nome + " é lento");
            }
        });
        System.out.println();

        System.out.println("MOSTRAR STATUS FINAL:");
        carros.forEach(c -> {
            System.out.println("Modelo do carro :" + c.nome + "// Velocidade do carro:" + c.velocidade + "// Motor ligado?:" + c.ligado);
        });








        
    }
}
