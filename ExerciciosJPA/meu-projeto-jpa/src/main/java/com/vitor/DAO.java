package com.vitor.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class DAO<E>{
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static{
        try{
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        }catch(Exception e){

        }
    }
    
    public DAO(){
        this(null);
    }

    public DAO(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirT(){
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluirT(E entidade){
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluirT(entidade).fecharT();
    }

    public List<E>  obterTodos(){
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int qtdRegistros, int deslocamento){
        if(classe == null){
            throw new UnsupportedOperationException("Classe nula.");
        }

        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtdRegistros);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    public void fechar(){
        em.close();
    }




}