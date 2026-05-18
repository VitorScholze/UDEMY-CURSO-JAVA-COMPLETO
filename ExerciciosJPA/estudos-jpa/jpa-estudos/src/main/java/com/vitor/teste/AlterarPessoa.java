package com.vitor.teste;

import com.vitor.modelo.CPF;
import com.vitor.modelo.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlterarPessoa {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    Pessoa pessoa = em.find(Pessoa.class, 3L);
    CPF cpf = new CPF("10747264996");

    if(pessoa != null){
        pessoa.setNome("Vitor Scholze");
        pessoa.setCpf(cpf);
        System.out.println("Informacoes alteradas com sucesso!");
    }else{
        System.out.println("Pessoa nao encontrada!");
    }

    em.getTransaction().commit();
    em.close();
    emf.close();
    
    }
}
