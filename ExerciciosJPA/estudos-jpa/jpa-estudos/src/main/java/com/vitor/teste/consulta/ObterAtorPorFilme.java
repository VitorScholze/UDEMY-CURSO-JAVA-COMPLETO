package com.vitor.teste.consulta;

import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Ator;
import com.vitor.modelo.muitospramuitos.Filme;

public class ObterAtorPorFilme {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);

        List<Filme> filmes = dao.consultar("ObterAtorPorFilme", "nome", "O Fugitivo");

        if(filmes.size() > 0){
            System.out.println("INFORMACOES:");
        }
        for(Filme f: filmes){
            System.out.println("NOME DO FILME: " + f.getNome());

            for(Ator a : f.getAtores()){
                System.out.println("ATORES -->" + a.getNome());
            }
        }
    }



}
