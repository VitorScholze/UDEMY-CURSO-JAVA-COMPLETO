package com.vitor.modelo.teste;

import java.util.List;

import com.vitor.modelo.basico.Produto;
import com.vitor.modelo.infra.DAO;

public class ObterProdutos {
    
    public static void main(String[] args) {
    DAO<Produto> dao = new DAO<>(Produto.class);
    List<Produto> produtos = dao.obterTodos();

    for(Produto p : produtos){
        System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome());
    }

    double precoTotal = produtos.stream()
                                .map(p -> p.getPreco())
                                .reduce(0.0, (t, p) -> t + p)
                                .doubleValue();
    System.out.println("O valor total é R$: " + precoTotal);


    }
    
}
