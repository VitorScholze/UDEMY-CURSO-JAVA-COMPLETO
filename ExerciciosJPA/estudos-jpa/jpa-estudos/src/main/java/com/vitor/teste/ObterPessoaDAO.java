package com.vitor.teste;

import java.util.Scanner;

import com.vitor.dao.DAO;
import com.vitor.modelo.Pessoa;

public class ObterPessoaDAO {
    public static void main(String[] args) {
        
        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ID da pessoa que voce deseja consultar:");
        Long id = sc.nextLong();

        Pessoa p = dao.find(id);

        if(p != null){
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("--------");
        }else{
            System.out.println("Pessoa nao encontrada!");
        }

        dao.fechar();

        sc.close();


        
    }
}
