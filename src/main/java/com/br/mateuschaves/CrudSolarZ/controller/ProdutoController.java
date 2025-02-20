package com.br.mateuschaves.CrudSolarZ.controller;


import com.br.mateuschaves.CrudSolarZ.dto.ProdutoDTO;
import com.br.mateuschaves.CrudSolarZ.model.Produto;
import com.br.mateuschaves.CrudSolarZ.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    public ProdutoController(ProdutoService service){
        this.service = service;
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto>atualizar(@PathVariable Long id, @Valid @RequestBody Produto produto){
        Produto atualizado = service.atualizar(id, produto);
        return ResponseEntity.ok(atualizado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO>getProduto(@PathVariable Long id){
        ProdutoDTO produtoDTO = service.getProdutoById(id);
        return ResponseEntity.ok(produtoDTO);
    }

    @GetMapping("/buscar")
    public List<Produto> listarPorNome(String nome){
        return service.buscarPorNome(nome);

    }




}









