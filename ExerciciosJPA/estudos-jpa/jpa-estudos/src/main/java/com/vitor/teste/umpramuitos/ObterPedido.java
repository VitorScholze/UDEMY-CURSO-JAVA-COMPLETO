package com.vitor.teste.umpramuitos;

import com.vitor.dao.DAO;
import com.vitor.modelo.umpramuitos.ItemPedido;
import com.vitor.modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.find(1L);

        for(ItemPedido i : pedido.getItens()){ //EXEMPLO de LAZY, utlizamos os gets, para carregar as informacoes do banco.
            System.out.println(i.getQuantidade());
            System.out.println(i.getProduto().getNome());
        }

        dao.fechar();
    }
}
