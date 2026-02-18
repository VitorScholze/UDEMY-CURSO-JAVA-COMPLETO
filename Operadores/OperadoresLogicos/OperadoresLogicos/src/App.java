import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Digite o primeiro numero:");
    int numero1 = sc.nextInt();
    System.out.println("Digite o segundo numero:");
    int numero2 = sc.nextInt();
    System.out.println("Qual forma de calcula voce deseja utilizar?");
    String sinal = sc.next();
    
    //Logica

    double resultado = "+".equals(sinal) ? numero1 + numero2 : 0;
    resultado = "-".equals(sinal) ? numero1 - numero2 : resultado;
    resultado = "*".equals(sinal) ? numero1 * numero2 : resultado;
    resultado = "/".equals(sinal) ? numero1 / numero2 : resultado;
    resultado = "%".equals(sinal) ? numero1 % numero2 : resultado;

    System.out.printf(" %d %s %d = %.2f", numero1, sinal, numero2,resultado);
   
    sc.close();
}
}
