import java.util.ArrayList;

public class Loja {
    
ArrayList<Celular> celulares = new ArrayList<>();


void adicionarCelular(Celular celular){
    this.celulares.add(celular);
}

void celularMaisCaro(){
    double maior = 0;
    double celularMaisCaro = 0;

    for(Celular celular : celulares){
        double valor = celular.preco;
        if(valor > maior){
            maior = valor;
        }
    }
    celularMaisCaro = maior;
    System.out.println(celularMaisCaro);
}
}
