package com.vitor.teste.heranca;

import com.vitor.dao.DAO;
import com.vitor.modelo.heranca.Aluno;
import com.vitor.modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {
        
        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "Joao");
        AlunoBolsista aluno2= new AlunoBolsista(345L, "Maria", 1000);
        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);
        alunoDAO.fechar();
    }
}
