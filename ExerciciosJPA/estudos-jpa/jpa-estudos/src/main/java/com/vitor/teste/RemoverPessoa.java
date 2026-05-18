package com.vitor.teste;


import java.util.Scanner;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class RemoverPessoa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("estudos-jpa");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id do usuario que voce deseja remover:");
        int idPessoa = sc.nextInt();

        em.getTransaction().begin();
        try{
            String jpql = "delete from Pessoa p where p.id =:idPessoa";
            int delete = em.createQuery(jpql).setParameter("idPessoa", idPessoa).executeUpdate();
            
            em.getTransaction().commit();
            if(delete > 0){
                System.out.println("Pessoa deletada.");
            }
            

        }catch(Exception e){
            System.out.println("Pessoa nao encontrada!");
        }

        em.close();
        emf.close();
        sc.close();
    }
}
