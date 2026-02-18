import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double nota = 0;
        double total = 0;
        int cont = 0;
        
        while(nota != -1){
            System.out.println("Digite a sua nota ou -1 p/ sair");
            nota = sc.nextDouble();
            
            if (nota >= 0 && nota <=10){
            cont ++;
            total += nota;
            }
        }
        System.out.println("NOta Invalida");
        System.out.println("No total foram digitadas " + cont + " notas ");
        System.out.println("A media das notas da turma é " + total/cont);

        sc.close();
    }
}
