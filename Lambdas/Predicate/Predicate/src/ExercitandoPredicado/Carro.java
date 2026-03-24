package ExercitandoPredicado;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Carro {
    String modelo;
    int velocidade;

    Carro(String modelo, int velocidade){
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        Carro c1 = new Carro("BMw M4", 80);
        Carro c2 = new Carro("AUDI RS6", 72);
        Carro c3 = new Carro("CIVIC SI", 60);
        Carro c4 = new Carro("CHEVETTE", 120);
        Carro c5 = new Carro("GOLF GTI", 45);
        Carro c6 = new Carro("CORVETTE", 25);
        Carro c7 = new Carro("DODGE", 35);


        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);
        carros.add(c6);
        carros.add(c7);

        System.out.println("-------CARROS RÁPIDOS:---------");

        Predicate<Carro> carroRapido = c ->
            c.velocidade > 70;
        
        carros.forEach(c -> {
            if(carroRapido.test(c)){
                System.out.println(c.modelo);
            }
        });

        System.out.println("-------CARROS LENTOS:---------");

        Predicate<Carro> carroLento = c -> 
            c.velocidade < 40;

        carros.forEach(c -> {
            if(carroLento.test(c)){
                System.out.println(c.modelo);
            }
        });

        Predicate<Carro> carroMedio = c -> c.velocidade >= 40 && c.velocidade <=70;

        
        System.out.println("-------CARROS MÉDIOS:---------");
        carros.forEach(c -> {
            if(carroMedio.test(c)){
                System.out.println(c.modelo);
            }
        }
        );



    }
}
