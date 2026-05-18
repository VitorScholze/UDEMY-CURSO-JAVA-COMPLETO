package com.vitor.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;

@Entity
@Table(name = "Pessoas")
public class Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;



    @JoinColumn(name = "cpf_id", unique = true)
    @OneToOne(cascade = CascadeType.PERSIST)
    CPF cpf;

    public Pessoa(){

    }

    public Pessoa(String nome , CPF cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public CPF getCpf() {
        return cpf;
    }


    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + nome ;
    }
}