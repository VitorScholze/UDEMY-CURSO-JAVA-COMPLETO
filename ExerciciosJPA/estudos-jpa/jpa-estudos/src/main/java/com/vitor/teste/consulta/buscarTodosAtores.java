package com.vitor.teste.consulta;

import java.util.List;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Ator;

public class buscarTodosAtores {
    public static void main(String[] args) {
        DAO<Ator> dao = new DAO<>();
    
        List<Ator> atores = dao.consultarSemParam("obterTodosAtores");

        System.out.println("ATORES DOS FILMES:");
        for(Ator a : atores){
            System.out.println("NOME: " + a.getNome());
        }
    }
}
