package com.vitor.modelo.teste.umpraum;



import com.vitor.modelo.infra.DAO;
import com.vitor.modelo.umpraum.Assento;
import com.vitor.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {
        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rodrigo" , assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}
