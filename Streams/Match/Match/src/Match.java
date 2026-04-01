import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >=7;
        System.out.println(alunos.stream().allMatch(aprovado)); // Verifica se todos os alunos estão de acordo com o Predicate;
        System.out.println(alunos.stream().anyMatch(aprovado)); // Verifica se tem pelo menos um aluno de acordo com o Predicate;
        System.out.println(alunos.stream().noneMatch(aprovado)); // Verifica se nenhum aluno está de acordo com o Predicate;




    }
}
