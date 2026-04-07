import java.util.Scanner;

public class FInally {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(7 / sc.nextInt());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally #01...");
        }

        try{
            System.out.println(7 / sc.nextInt());
        }finally {
            System.out.println("Finally #02 ...");
            sc.close();
        }

        System.out.println("Fim :)");
    }
}
