public class AlunoTeste {
    public static void main(String[] args) {
        Curso c1 = new Curso("JAVA ", 2);
        Curso c2 = new Curso("PYTHON", 1);
        Curso c3 = new Curso("JAVASCRIPT", 4);

        Aluno aluno = new Aluno("Vitor Scholze");

        aluno.adicionarCurso(c1);
        aluno.adicionarCurso(c2);
        aluno.adicionarCurso(c3);

        System.out.println(aluno.totalHoras());
    }
}
