package com.vitor.modelo.teste;

import java.util.List;
import java.util.Scanner;

import com.vitor.modelo.basico.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class MenuInteracaoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n---- MENU ----");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar Todos");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Buscar por email");
            System.out.println("5 - Listar ordenado por nome");
            System.out.println("6 - Limitar Resultados");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            String resp = sc.nextLine();

            switch (resp) {

                // 🟢 CADASTRAR
                case "1":
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o email: ");
                    String email = sc.nextLine();

                    if (nome.isEmpty() || email.isEmpty()) {
                        System.out.println("Dados inválidos!");
                        break;
                    }

                    Usuario usuario = new Usuario(nome, email);

                    em.getTransaction().begin();
                    em.persist(usuario);
                    em.getTransaction().commit();

                    System.out.println("Usuário cadastrado!");
                    break;

                // 🔵 LISTAR TODOS
                case "2":
                    String jpql = "SELECT e FROM Usuario e";

                    TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
                    List<Usuario> usuarios = query.getResultList();

                    for (Usuario u : usuarios) {
                        System.out.println("ID: " + u.getId() +
                                " | Nome: " + u.getNome() +
                                " | Email: " + u.getEmail());
                    }
                    break;

                // 🟡 BUSCAR POR NOME
                case "3":
                    System.out.print("Digite o nome: ");
                    String nomeBusca = sc.nextLine();

                    String jpql2 = "SELECT e FROM Usuario e WHERE e.nome LIKE :nome";

                    TypedQuery<Usuario> query2 = em.createQuery(jpql2, Usuario.class);
                    query2.setParameter("nome", "%" + nomeBusca + "%");

                    List<Usuario> resultado = query2.getResultList();

                    for (Usuario u : resultado) {
                        System.out.println(u.getNome() + " | " + u.getEmail());
                    }
                    break;

                // 🔴 BUSCAR POR EMAIL
                case "4":
                    System.out.print("Digite o email: ");
                    String emailBusca = sc.nextLine();

                    String jpql3 = "SELECT e FROM Usuario e WHERE e.email = :email";

                    TypedQuery<Usuario> query3 = em.createQuery(jpql3, Usuario.class);
                    query3.setParameter("email", emailBusca);

                    List<Usuario> resultado2 = query3.getResultList();

                    for (Usuario u : resultado2) {
                        System.out.println(u.getNome() + " | " + u.getEmail());
                    }
                    break;

                // 🟣 ORDENADO
                case "5":
                    String jpql4 = "SELECT u FROM Usuario u ORDER BY u.nome";

                    TypedQuery<Usuario> query4 = em.createQuery(jpql4, Usuario.class);
                    List<Usuario> usuarios2 = query4.getResultList();

                    for (Usuario u : usuarios2) {
                        System.out.println(u.getNome());
                    }
                    break;

                // ⚫ LIMITAR
                case "6":
                    String jpql5 = "SELECT e FROM Usuario e";

                    TypedQuery<Usuario> query5 = em.createQuery(jpql5, Usuario.class);

                    query5.setMaxResults(5); // limita
                    query5.setFirstResult(0); // começa do primeiro

                    List<Usuario> usuarios3 = query5.getResultList();

                    for (Usuario u : usuarios3) {
                        System.out.println(u.getNome());
                    }
                    break;

                // 🔚 SAIR
                case "0":
                    em.close();
                    emf.close();
                    sc.close();
                    System.out.println("Encerrado!");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}