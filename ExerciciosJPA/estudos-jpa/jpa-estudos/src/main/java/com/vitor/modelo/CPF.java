package com.vitor.modelo;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;




@Entity
public class CPF {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    String numero;

    @OneToOne(mappedBy = "cpf")
    Pessoa pessoa;

    public CPF(){

    }

    public CPF(String numero){
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}