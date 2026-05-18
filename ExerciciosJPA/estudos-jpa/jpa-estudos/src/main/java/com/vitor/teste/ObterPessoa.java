package com.vitor.teste;

import java.util.Scanner;

import com.vitor.modelo.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ObterPessoa {
    public static void main(String[] args) {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
    EntityManager em = emf.createEntityManager();

    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id da pessoa:");
        int idPessoa = sc.nextInt();

        String jpql = "select p from Pessoa p where p.id =:idPessoa";
    
        TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class); 
        query.setParameter("idPessoa", idPessoa);

        try{
            Pessoa pessoa = query.getSingleResult();
            System.out.println("NomeL " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf().getNumero());
        }catch(Exception e){
            System.out.println("Pessoa nao encontrada!");
        }

        em.close();
        emf.close();
        sc.close();
    }

    
}
