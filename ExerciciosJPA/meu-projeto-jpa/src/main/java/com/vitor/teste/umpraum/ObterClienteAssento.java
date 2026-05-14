package com.vitor.modelo.teste.umpraum;

import com.vitor.modelo.infra.DAO;
import com.vitor.modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());
       
        dao.fechar();
    }
}
