package Desafio;

public class Carro {

final int velocidadeMaxima;
int velocidade = 0 ;
private int delta = 5;

Carro(int velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
}
void acelerar(){
    if(velocidade + getDelta() > velocidadeMaxima){
        velocidade = velocidadeMaxima;
    }else{
    this.velocidade += getDelta();
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
public int getDelta() {
    return delta;
}
public void setDelta(int delta) {
    this.delta = delta;
}


}
