package com.example.exercicios_sb.models.entities.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.exercicios_sb.models.entities.Produto;

public interface ProdutoRepository extends  JpaRepository <Produto, Integer>{
    
    public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);

    public Iterable<Produto> findByPrecoGreaterThan(Double preco);

    public Iterable<Produto> findByDescontoGreaterThan(double desconto);

    public Iterable<Produto> findByPrecoBetween(double preco1, double preco2);

    public Iterable<Produto> findByNomeContainingIgnoreCaseAndPrecoGreaterThan(String nome, double preco);
}
 
