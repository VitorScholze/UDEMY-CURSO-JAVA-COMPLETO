package com.vitor.teste;

import com.vitor.modelo.CPF;
import com.vitor.modelo.Pessoa;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovaPessoa{

public static void main(String[] args) {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
    EntityManager em = emf.createEntityManager();

    CPF cpf = new CPF("46830215600");

    Pessoa pessoa = new Pessoa("Beatriz Moreira", cpf);

    em.getTransaction().begin();

    em.persist(cpf);
    em.persist(pessoa);
    
    em.getTransaction().commit();
    em.close();

    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getCpf().getNumero());


}
}