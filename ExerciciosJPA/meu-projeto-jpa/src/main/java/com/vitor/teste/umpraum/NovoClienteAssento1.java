package com.vitor.modelo.teste.umpraum;

import com.vitor.modelo.infra.DAO;
import com.vitor.modelo.umpraum.Assento;
import com.vitor.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        
        Assento assento = new Assento("8F");
        
        Cliente cliente = new Cliente("Vitor", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluirT(cliente).incluirT(assento).fecharT().fechar();

    }
}
