package com.vitor.teste.composicao;


import com.vitor.dao.DAO;
import com.vitor.modelo.composicao.Endereco;
import com.vitor.modelo.composicao.Fornecedor;

public class InserirEndereco2 {
    public static void main(String[] args) {
        DAO<Fornecedor> dao = new DAO<>();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setEndereco(new Endereco("Rua lixo do lixo", "Barraco"));
        dao.abrirTransicao().inserir(fornecedor).fecharTransacao().fechar();

        
            
      
    }
}
