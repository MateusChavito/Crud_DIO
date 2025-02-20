package com.br.mateuschaves.CrudSolarZ.service;

import com.br.mateuschaves.CrudSolarZ.dto.ProdutoDTO;
import com.br.mateuschaves.CrudSolarZ.exceptions.ResourceNotFoundException;
import com.br.mateuschaves.CrudSolarZ.model.Produto;
import com.br.mateuschaves.CrudSolarZ.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado){
        Produto produto = repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Produto não encontrado"));

        produto.setNome(produtoAtualizado.getNome());
        produto.setPreco(produtoAtualizado.getPreco());

        return repository.save(produto);

    }

    public ProdutoDTO getProdutoById(Long id){
        Produto produto = repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Produto não encontrado"));
        return new ProdutoDTO(produto.getNome());

    }

    public List<Produto> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }




}
