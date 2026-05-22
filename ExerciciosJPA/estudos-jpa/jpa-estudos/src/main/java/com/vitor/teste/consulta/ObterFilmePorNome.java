package com.vitor.teste.consulta;


import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Filme;

public class ObterFilmePorNome {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>();

        List<Filme>filmes = dao.consultar("ObterAtoresPorFilme", "nome", "O Fugitivo");

        for(Filme f: filmes){
            System.out.println("FILME ENCONTRADO: " + f.getNome());
        }
    }
}
