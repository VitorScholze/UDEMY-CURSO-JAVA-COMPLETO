package com.vitor.teste.consulta;

import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Ator;
import com.vitor.modelo.muitospramuitos.Filme;

import jakarta.persistence.TypedQuery;

public class BuscarAtorPorFilme {
    public static void main(String[] args) {
        DAO<Ator> dao = new DAO<>(Ator.class);

        dao.abrirTransicao();
        TypedQuery<Filme> query = dao.getEm().createQuery("ObterFilmePorAtor", Filme.class);
        query.setParameter("nome", "O Fugitivo");

        List<Filme> filmes = query.getResultList();

        if(filmes.size() > 0){
            System.out.println("INFORMACOES:");
        }

        for(Filme f : filmes){
            System.out.println("Nome do filme: " + f.getNome());
            
            f.getAtores().forEach(a -> System.out.println("Nome dos autores: " + a.getNome()));
        }
        
    }
}
