import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero de 0 - 100: ");
    int num = sc.nextInt();
    int correto = 54;
    int tentativa = 9;
    
    while(num != correto){
        if(tentativa !=0){
            System.out.println("Numero incorreto, voce tem " + tentativa-- 
            +"tentativas restantes");
            System.out.println("Digite outro numero novamente");
            num = sc.nextInt();
    }else{
        System.out.println("Acabou seu numero de tentativas.");
        return;
    }
    }

    if(num == correto){
        System.out.println("Numero correto e sobrou " +tentativa + " tentativas");
    }

   
      sc.close();  
    }
}
