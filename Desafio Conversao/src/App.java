
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeiro salario");
        String pSalario = sc.next().replace(",", ".");;

        System.out.println("Digite seu segundo salario:");
        String sSalario = sc.next().replace(",", ".");;

        System.out.println("Digite seu terceiro salario:");
        String tSalario = sc.next().replace(",", ".");;


        Double salario1 = Double.parseDouble(pSalario);
        Double salario2 = Double.parseDouble(sSalario);
        Double salario3 = Double.parseDouble(tSalario);

        double soma = salario1 + salario2 + salario3 ;

        System.out.println("A media dos ultimos 3 salarios dessa pessoa é  " + soma / 3 );


        sc.close();
            
    }
}
