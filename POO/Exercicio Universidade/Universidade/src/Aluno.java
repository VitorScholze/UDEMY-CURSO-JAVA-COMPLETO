import java.util.ArrayList;

public class Aluno {
String nome;

Aluno(String nome){
    this.nome = nome;
}
ArrayList<Curso> cursos = new ArrayList<>();

void adicionarCurso(Curso curso){
    this.cursos.add(curso);
}


int totalHoras(){
 int total = 0;

 for(Curso curso: cursos){
    total += curso.cargaHoraria;
 }

 return total;
}









}
