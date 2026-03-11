import java.util.ArrayList;

public class Curso {
final String nome;

Curso(String nome){
    this.nome = nome;
}

final ArrayList<Aluno> alunos = new ArrayList<>();


void adicionarAluno( Aluno aluno){
    this.alunos.add(aluno);
    aluno.cursos.add(this);
}
    public static void main(String[] args) throws Exception {
       
    }
}
