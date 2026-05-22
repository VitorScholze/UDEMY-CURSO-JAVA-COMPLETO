package com.vitor.teste.composicao;

import com.vitor.dao.DAO;
import com.vitor.modelo.composicao.Endereco;
import com.vitor.modelo.composicao.Funcionario;

public class InserirEndereco {
    public static void main(String[] args) {
        
        DAO<Funcionario> dao = new DAO<>();
        Funcionario f = new Funcionario();
        f.setEndereco(new Endereco("Rua Joao Ravache 374", "Casa"));
        dao.abrirTransicao().inserir(f).fecharTransacao().fechar();
    }
}
