package com.vitor.teste.consulta;

import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Filme;

public class obterTodosFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);

        List<Filme> filmes = dao.consultar("obterTodosOsFilmes");

        for(Filme f: filmes){
            System.out.println("Nome do FIlme:" + f.getNome() + " / Nota do Filme:" + f.getNota());
        }
    }
}
