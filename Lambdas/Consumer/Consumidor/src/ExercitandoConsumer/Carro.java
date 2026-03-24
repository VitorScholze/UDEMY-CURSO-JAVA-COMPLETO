package ExercitandoConsumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Carro {
    String modelo;
    int velocidade;
    boolean ligado;

    Carro(String modelo, int velocidade, boolean ligado){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.ligado = ligado;
    }
    public static void main(String[] args) {
        
        ArrayList<Carro> carros = new ArrayList<>();

        Carro c1 = new Carro ("BMW M4", 70, true);
        Carro c2 = new Carro ("AUDI RS6", 50, false);
        Carro c3 = new Carro ("CIVIC SI", 140, true);
        Carro c4 = new Carro ("CHEVETTE", 110, true);
        Carro c5 = new Carro ("BMW M2", 60, false);
        
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);

        Predicate<Carro> prontoCorrida = c -> c.velocidade > 60 && c.ligado;
        
        Consumer<Carro> mostrar = c -> {
            System.out.println( c.modelo + " Velocidade:" + c.velocidade + " Pronto para a corrida?" + prontoCorrida.test(c));
        };

        carros.forEach(c -> {
            if(prontoCorrida.test(c)){
                mostrar.accept(c);
            }
        });


        Consumer<Carro> desligar = c -> c.ligado = false;

        carros.forEach(c -> {
            if(c.velocidade > 100){
                desligar.accept(c);
            }
        });

    }
}
