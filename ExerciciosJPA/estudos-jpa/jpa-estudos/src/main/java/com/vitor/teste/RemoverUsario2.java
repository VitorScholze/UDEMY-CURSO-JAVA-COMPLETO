package com.vitor.teste;

import com.vitor.modelo.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RemoverUsario2 {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
    EntityManager em = emf.createEntityManager();

    Pessoa pessoa = em.find(Pessoa.class, 2L);

    em.getTransaction().begin();
    em.remove(pessoa);
    em.getTransaction().commit();

    em.close();
    emf.close();
    }

    

}
