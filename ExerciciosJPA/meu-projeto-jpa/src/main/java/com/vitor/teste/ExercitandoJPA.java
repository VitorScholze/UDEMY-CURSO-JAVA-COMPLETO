package com.vitor.modelo.teste;

import java.util.Scanner;

import com.vitor.modelo.basico.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ExercitandoJPA {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas voce deseja cadastrar? --> ");
        int qtd = sc.nextInt();
        sc.nextLine();
        
        em.getTransaction().begin();
        int i = 1;
        while( i <= qtd){
        System.out.println("Digite o nome da " + i + " pessoa a ser cadastrada: ");
        String nome = sc.nextLine();

        System.out.println("Digite o email da "+ i + " pessoa: ");
        String email = sc.nextLine();

        if(nome.isEmpty() || email.isEmpty() || nome.isEmpty() && email.isEmpty()){
            System.out.println("Informacoes invalidas!");
        }else{
            Usuario usuario = new Usuario(nome, email);
            em.persist(usuario);
          

            System.out.println("Informacoes do usuario Cadastradas com sucesso!");
        }

        em.getTransaction().commit();
        i++;
        }
    
        em.close();
        emf.close();
        sc.close();
    }
}
