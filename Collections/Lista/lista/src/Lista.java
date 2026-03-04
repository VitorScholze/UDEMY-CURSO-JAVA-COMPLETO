import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Vitor"));
        lista.add(new Usuario("Helo"));
        lista.add(new Usuario("Bruno"));
        lista.add(new Usuario("Bruna"));
        lista.add(new Usuario("Carmen"));

        System.out.println(lista.get(3).nome); // Acessar pelo índice
        lista.remove(1); // Remove o elemento 1 ( Ana)
        System.out.println(lista.remove(new Usuario("Bruna")));
        System.out.println("Tem? " + lista.contains(new Usuario("Helo")));
        
        for(Usuario u : lista){
            System.out.println(u);
        }
        

        
               

   
   
   
   
   
   
   
   
    }
}
