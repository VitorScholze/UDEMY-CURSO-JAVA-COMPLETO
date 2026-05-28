package com.example.exercicios_sb.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicios_sb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @GetMapping(path = "/clientes/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "CR7", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Joao Augusto", "111.222.333-44");
    }


    
   
    @GetMapping("/listar/clientes")
    List<Cliente> obterClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(2, "Vitor", "12344535"));
        clientes.add(new Cliente(3, "Neymar", "12344345362"));
        clientes.add(new Cliente(4, "Artur", "1234453532453"));
        return clientes;

        }

    
    @GetMapping("/filtrar")
    public List<Cliente> filtrar(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(2, "Vitor", "12344535"));
        clientes.add(new Cliente(3, "Neymar", "12344345362"));
        clientes.add(new Cliente(4, "Artur", "1234453532453"));
        return clientes.stream().filter(c -> c.getId() > 1).toList();
    }
    }


    