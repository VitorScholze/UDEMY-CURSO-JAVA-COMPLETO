import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {
    public static void main(String[] args) throws Exception {
         Aluno a1 = new Aluno("Gui", 7.8);
         Aluno a2 = new Aluno("Bia", 5.8);
         Aluno a3 = new Aluno("Daniel", 9.8);
         Aluno a4 = new Aluno("Rebeca", 6.8);
         Aluno a5 = new Aluno("Pedro", 7.1);
         Aluno a6 = new Aluno("Leo", 8.8);

         List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

         Predicate<Aluno> aprovados = a -> a.nota >= 7;
         alunos.stream()
                .filter(aprovados)
                .map(a -> "Parabens " + a.nome + "! Voce foi aprovado!")
                .forEach(System.out::println);
    }
}
