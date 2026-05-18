package com.vitor.teste;

import java.util.Scanner;

import com.vitor.dao.DAO;
import com.vitor.modelo.CPF;
import com.vitor.modelo.Pessoa;

public class InserirPessoaDAO {
    public static void main(String[] args) {
        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do novo usuario:");
        String nome = sc.nextLine();

        System.out.println("Digite o cpf do usuario:");
        String cpfPessoa = sc.nextLine();

      
        CPF cpf = new CPF(cpfPessoa);
        Pessoa pessoa = new Pessoa(nome,cpf);

        dao.abrirTransicao().inserir(pessoa).fecharTransicao();

        dao.fechar();
        

        sc.close();
    }
}
