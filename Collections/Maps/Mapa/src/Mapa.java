import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

    public static void main(String[] args) throws Exception {
    
        Map<Integer , String > usuarios = new HashMap<>();
        usuarios.put(1, "Vitor");
        usuarios.put(2, "Helo");
        usuarios.put(3, "Bruno");
        usuarios.put(4, "Bruna");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Vitor"));
        
        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(3));

        for(int chave:usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Entry<Integer , String> registro: usuarios.entrySet()){ //entrySet (Retorna todas as entradas)
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
   
   
    }
}
