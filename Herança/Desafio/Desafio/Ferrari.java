package Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

private boolean ligarTurbo = true;
private boolean ligarAr = true;

public Ferrari() {
        super(300);
        setDelta(15);
    }

public void ligarturbo(){
    ligarTurbo = true;
}

public void desligarTurbo(){
    ligarTurbo = false;
}

public void ligarAr(){
    ligarAr = true;
}

public void desligarAr(){
    ligarAr = false;
}

@Override
public int getDelta() {
    if(ligarTurbo && !ligarAr){
        return 35;
    }else if(ligarTurbo && !ligarAr){
        return 30;
    }else if(!ligarTurbo && !ligarAr){
        return 20;
    }else{
        return 15;
    }
}

}
