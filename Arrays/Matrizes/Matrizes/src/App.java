import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Quantos alunos serão consultados?:");
        int qtdAlunos = sc.nextInt();

        System.out.print("Quantas notas por aluno serão digitadas?:");
        int qtdNotas = sc.nextInt();

        double [][] notas = new double[qtdAlunos][qtdNotas];

        double soma = 0;
        for(int i = 0; i < qtdAlunos; i++){
            for(int j = 0; j < qtdNotas; j ++){
                System.out.println("Digite a " + (j + 1)  + "a nota do aluno" + (i + 1) + ":");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }
        }

    System.out.println("A média de notas de todos os alunos é:" + soma / (qtdAlunos * qtdNotas));

    sc.close();
    }
}
