package com.example.exercicios_sb.praticando;

import com.example.exercicios_sb.models.entities.repositories.ProdutoRepository;

import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicios_sb.models.entities.Produto;

@RestController
@RequestMapping("/pesquisa/produtos")
public class ProdutoControllerExercicios {
    
    

    private final ProdutoRepository produtoRepository;

    ProdutoControllerExercicios(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    //Pesquisar Produto por nome
    @GetMapping(path = "/buscar/{nome}")
    public Iterable<Produto> obterProdutoporNome(@PathVariable String nome){
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }

    //Procurar Produtos com preco maior que ...

    @GetMapping(path = "/buscarPreco/{preco}")
    public Iterable<Produto> obterProdutoPrecoMaiorQ(@PathVariable double preco){
        return produtoRepository.findByPrecoGreaterThan(preco);
    }


    //Procurar Produtos com preco entre x e y

    @GetMapping(path = "/buscarPrecoEntre/{preco1}/{preco2}")
    public Iterable<Produto> obterProdutoComPrecoEntre(@PathVariable double preco1, @PathVariable double preco2){
        return produtoRepository.findByPrecoBetween(preco1, preco2);
    }

    //Procurar Produtos com desconto maior que

    @GetMapping(path = "/desconto/{desconto}")
    public Iterable<Produto> obterProdutoDescontoMaiorQue(@PathVariable double desconto){
        return produtoRepository.findByDescontoGreaterThan(desconto);
            
    }

    @GetMapping(path = "/ordenarProdutos")
    public Iterable<Produto> obterProdutosOrdenados(){
        return produtoRepository.findAll(Sort.by("preco"));
    }

    @GetMapping(path = "nome/preco/{nome}/{preco}")
    public Iterable<Produto> obterProdutosNomeEPreco(@PathVariable String nome, @PathVariable double preco){
        return produtoRepository.findByNomeContainingIgnoreCaseAndPrecoGreaterThan(nome, preco);
    }

    @PostMapping(path = "/comprarProduto/{id}/{quantidade}")
    public Produto comprarProduto(@PathVariable int id, @PathVariable int quantidade){
        Optional<Produto> produtoOptional = produtoRepository.findById(id);

        if(!produtoOptional.isPresent()){
           System.out.println("Produto nao encontrado");
            return new Produto();
        }

        Produto p = produtoOptional.get();

        if(p.getEstoque() < quantidade){
            System.out.println("Quantidade indisponivel no estoque");
            return p;
        }else{
            int novoEstoque = p.getEstoque() - quantidade;
            p.setEstoque(novoEstoque);
            System.out.println("STATUS DO ESTOQUE ATUALIZADO COM SUCESSO!");
            return produtoRepository.save(p);
        }
    }


}
