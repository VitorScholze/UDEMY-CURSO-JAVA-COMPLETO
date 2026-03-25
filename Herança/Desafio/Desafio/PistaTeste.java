package Desafio;

public class PistaTeste {
public static void main(String[] args) {
    Carro c = new Civic();
    c.acelerar();
    c.acelerar();
    c.acelerar();
    c.acelerar();
    c.frear();
    c.frear();
    System.out.println(c);

    Ferrari ferrari = new Ferrari();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.frear();
    ferrari.frear();
    ferrari.ligarturbo();
    ferrari.desligarTurbo();
    ferrari.ligarAr();
    ferrari.acelerar();
    ferrari.ligarturbo();
    ferrari.desligarAr();
    ferrari.acelerar();
    

    System.out.println(ferrari);




}  
}
