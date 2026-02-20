public class Data {
    int dia;
    int mes;
    int ano;
    public static void main(String[] args) throws Exception {
       
    Data d1 = new Data();
    d1.dia = 15;
    d1.mes = 05;
    d1.ano = 2007;

    Data d2 = new Data();
    d2.dia = 02;
    d2.mes = 05;
    d2.ano = 2007;


    System.out.println("Hoje é dia "+ d1.dia + " mes "+ d1.mes +" e ano "+ d1.ano);
    System.out.println("Hoje é dia "+ d2.dia + " mes "+ d2.mes +" e ano "+ d2.ano);

    }
}
