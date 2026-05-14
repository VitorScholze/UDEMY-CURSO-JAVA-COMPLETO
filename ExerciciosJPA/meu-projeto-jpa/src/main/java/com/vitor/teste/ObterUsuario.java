package com.vitor.modelo.teste;

import com.vitor.modelo.basico.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = em.find(Usuario.class, 3L);
        System.out.println(novoUsuario.getNome());

        System.out.println("O id gerado foi: " + novoUsuario.getId());



        em.close();
        emf.close();
    }
}
