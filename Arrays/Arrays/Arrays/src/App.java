import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas notas voce ira digitar?:");
    int qtd = sc.nextInt();

    double [] notasAluno = new double[qtd];

    for(int i = 0; i < qtd ; i++){
        System.out.println("Digite a "+ (i + 1) +"a nota:");
        notasAluno[i] = sc.nextDouble();
    }

    double soma = 0;

    for(int i = 0; i < qtd ; i++){
        soma += notasAluno[i];
    }


    System.out.println("A sua média é:" + soma / 3 );









    sc.close();
    }
}
