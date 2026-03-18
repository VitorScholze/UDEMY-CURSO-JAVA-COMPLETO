package Desafio;

public class Carro {

final int velocidadeMaxima;
int velocidade = 0 ;
int delta = 5;

Carro(int velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
}
void acelerar(){
    if(velocidade + delta > velocidadeMaxima){
        velocidade = velocidadeMaxima;
    }else{
    this.velocidade += delta;
    }
}

void frear(){
 if(this.velocidade >= 5){
        this.velocidade -= 5;
}else{
    this.velocidade = 0;
}

}
public String toString(){
    return "Velocidade atual é de " + velocidade + "km/h";

}
}
