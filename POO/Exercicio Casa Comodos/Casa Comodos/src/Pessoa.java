import java.util.ArrayList;

public class Pessoa {
String nome;

Pessoa(String nome){
    this.nome = nome;
}
ArrayList<Casa> casas = new ArrayList<>();

void adicionarCasa(Casa casa){
    this.casas.add(casa);
}

Casa maiorCasa(){
double maior = 0;
Casa maiorCasa = null;
for(Casa casa: casas){
    double valor = casa.tamanhoTotalCasa();
    if(valor > maior){
        maior = valor;
        maiorCasa = casa;
    }
}
return maiorCasa;

}






}
