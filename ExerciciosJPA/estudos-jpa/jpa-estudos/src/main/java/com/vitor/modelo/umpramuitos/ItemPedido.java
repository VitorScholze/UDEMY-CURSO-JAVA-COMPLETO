package com.vitor.modelo.umpramuitos;

import com.vitor.modelo.Produto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //Muitos itens pra apenas um pedido. Many = ItemPedido ,  One = Pedido
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)// o EAGER(valor padrao | (...toOne -> EAGER)) faz carregar os relacionamentos imediatamente,
    //por exemplo, se eu procurar uma pessoa por ID e ela tiver relacao com o CPF, ja vai carregar a Pessoa e o CPF junto.
    private Produto produto;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private Double preco;

    public ItemPedido(){

    }

    public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
        super();
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null){
            this.setPreco(produto.getPreco());
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    



}
