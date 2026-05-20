package com.vitor.modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY) //LAZY(valor padrao de fecth | (...toMany -> LAZY)) é utilizados para carregar os dados
    //somentos quando necesario! 
    private List<ItemPedido> itens;


    public Pedido(){
        this(new Date());
    }

    public Pedido(Date data){
        super();
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }


    
    
}
