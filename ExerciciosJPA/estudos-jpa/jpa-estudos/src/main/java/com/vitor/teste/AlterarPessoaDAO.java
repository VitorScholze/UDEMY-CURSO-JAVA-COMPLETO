package com.vitor.teste;

import java.util.Scanner;

import com.vitor.dao.DAO;
import com.vitor.modelo.Pessoa;

public class AlterarPessoaDAO {
    public static void main(String[] args) {
        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite o ID do usuario que voce deseja alterar:");
        Long id = sc.nextLong();

        Pessoa p = dao.find(id);

        if(p != null){
            System.out.println("Digite o novo nome da pessoa:");
            String novoNome = sc.nextLine();
            
            p.setNome(novoNome);

        }else{
            System.out.println("Pessoa nao encontrada!");
        }

        dao.fechar();
        sc.close();
    }
}

