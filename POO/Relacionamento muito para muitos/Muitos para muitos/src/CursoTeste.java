public class CursoTeste {
    public static void main(String[] args) {
        
    Aluno a1 = new Aluno("Vitor");
    Aluno a2 = new Aluno("Arthur");
    Aluno a3 = new Aluno("Carlos");

   

    Curso c1 = new Curso("Java Completo");
    Curso c2 = new Curso("HTML e CSS");
    Curso c3 = new Curso("PYTHON");
   
    c1.adicionarAluno(a1);
    c1.adicionarAluno(a2);

    c2.adicionarAluno(a1);
    c2.adicionarAluno(a3);

    a1.adicionarCurso(c3);
    a2.adicionarCurso(c3);
    a3.adicionarCurso(c3);

    for(Aluno a: c1.alunos){
        System.out.println("Estou matriculado no curso " + c1.nome + "....");
        System.out.println("E o meu nome e :" + a.nome);
        System.out.println();
    }

    System.out.println(a1.cursos.get(0).alunos);


    }
}
