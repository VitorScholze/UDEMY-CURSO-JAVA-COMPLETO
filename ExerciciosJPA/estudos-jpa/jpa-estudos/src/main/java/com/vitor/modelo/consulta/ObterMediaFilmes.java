package com.vitor.modelo.consulta;

import com.vitor.dao.DAO;


public class ObterMediaFilmes {
    public static void main(String[] args) {
        
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);

        //NotaFilme nota = dao.consultarUm("MediaGeralFilmes");



        dao.fechar();



    }
}
