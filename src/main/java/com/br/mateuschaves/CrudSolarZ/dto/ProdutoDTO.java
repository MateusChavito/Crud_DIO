
package com.br.mateuschaves.CrudSolarZ.dto;

public class ProdutoDTO {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProdutoDTO(String nome) {
        this.nome = nome;
    }
}
