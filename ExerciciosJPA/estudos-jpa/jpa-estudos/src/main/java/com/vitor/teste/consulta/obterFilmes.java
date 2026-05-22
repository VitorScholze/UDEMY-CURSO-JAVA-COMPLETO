package com.vitor.teste.consulta;

import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Ator;
import com.vitor.modelo.muitospramuitos.Filme;

public class obterFilmes {
    public static void main(String[] args) {
        
        DAO<Filme> dao = new DAO<>(Filme.class);

        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5);

        System.out.println(filmes.size());

        for(Filme filme: filmes){
            System.out.println(filme.getNome() + " => " + filme.getNota());
            for(Ator ator: filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }








    }
}
