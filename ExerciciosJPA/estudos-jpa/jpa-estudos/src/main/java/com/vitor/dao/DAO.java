package com.vitor.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DAO<E>{


    private static EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("estudos-jpa");

    private EntityManager em;
    private Class<E> classe;

    public DAO(Class<E> classe){
        this.em = emf.createEntityManager();
        this.classe = classe;
    }

    public DAO<E> abrirTransicao(){
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransicao(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> inserir(E entidade){
        em.persist(entidade);
        return this;
    }

    public E find(Object id){
        return em.find(classe, id);
    }

    public DAO<E> fechar(){
        em.close();
        return this;
    }

    public DAO<E> remover(E entidade){
        em.remove(entidade);
        return this;
    }

    

    



}