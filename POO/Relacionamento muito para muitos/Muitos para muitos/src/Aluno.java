import java.util.ArrayList;

public class Aluno {
    final String nome;
    
    Aluno(String nome){
    this.nome = nome;

}

final ArrayList<Curso> cursos = new ArrayList<>();
    
void adicionarCurso(Curso curso){
    this.cursos.add(curso);
    curso.alunos.add(this);
}

public String toString(){
    return nome;
}
    public static void main(String[] args) {
        
    }
}
