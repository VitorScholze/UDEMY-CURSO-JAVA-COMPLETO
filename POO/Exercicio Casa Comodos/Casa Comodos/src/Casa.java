import java.util.ArrayList;

public class Casa {
String nome;

Casa(String nome){
    this.nome = nome;
}

ArrayList<Quarto> quartos = new ArrayList<>();

void adicionarQuarto(Quarto quarto){
    this.quartos.add(quarto);
}

double tamanhoTotalCasa(){
    double tamanhoTotal= 0;

    for(Quarto quarto: quartos){
        tamanhoTotal += quarto.tamanho;
    }

    return tamanhoTotal;
}

}
