package com.vitor.teste;

import java.util.Scanner;

import com.vitor.dao.DAO;
import com.vitor.modelo.Pessoa;

public class DeletarPessoaDAO {
    public static void main(String[] args) {
        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o id da pessoa que voce deseja excluir:");
        Long id = sc.nextLong();

        Pessoa p = dao.find(id);

        if(p != null){
            dao.abrirTransicao().remover(p);
            dao.fecharTransicao();
            System.out.println("Pessoa Excluida!");
            
            
        }else{
            System.out.println("Pessoa nao encontrada!");
        }

        dao.fechar();

        


        sc.close();
    }
}
