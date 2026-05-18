package com.vitor.teste;

import java.util.List;

import com.vitor.modelo.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SelecionarTodos {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    String jpql = "select p from Pessoa p ";

    TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
    List<Pessoa> pessoas = query.getResultList();

    
    pessoas.stream()
           .filter(p -> p.getId() > 3L)
           .forEach(System.out::println);
           
    //for(Pessoa p: pessoas){
   //     System.out.println("Nome: " + p.getNome() );
   //     System.out.println("CPF: " + p.getCpf().getNumero());
    //}
    

    }
}
