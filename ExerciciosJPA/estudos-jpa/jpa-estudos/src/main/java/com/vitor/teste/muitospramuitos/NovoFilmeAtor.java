package com.vitor.teste.muitospramuitos;

import com.vitor.dao.DAO;
import com.vitor.modelo.muitospramuitos.Ator;
import com.vitor.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        
        Filme filmeA = new Filme("Star Wars Ep4", 8.9);
        Filme filmeB = new Filme("O Fugitivo", 8.1 );

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fischer");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);
        


        







    }
}
