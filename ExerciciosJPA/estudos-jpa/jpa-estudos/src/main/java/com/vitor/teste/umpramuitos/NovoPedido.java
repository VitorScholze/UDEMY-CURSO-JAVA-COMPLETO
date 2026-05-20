package com.vitor.teste.umpramuitos;

import com.vitor.dao.DAO;
import com.vitor.modelo.Produto;
import com.vitor.modelo.umpramuitos.ItemPedido;
import com.vitor.modelo.umpramuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirTransicao().inserir(produto).inserir(pedido).inserir(item).fecharTransacao().fechar();
       
    }
}
