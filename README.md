# Projeto CRUD de Produtos - DIO

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) desenvolvida utilizando o framework Spring Boot, com a funcionalidade de gerenciamento de produtos para um sistema de vendas. O objetivo é fornecer uma API simples para realizar operações básicas em um banco de dados de produtos.

## Funcionalidades

- **Listar todos os produtos**
- **Salvar um novo produto**
- **Deletar um produto por ID**
- **Atualizar os detalhes de um produto existente**
- **Buscar produtos por nome**

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL** 

## Endpoints da API

- **GET** `/produtos` - Lista todos os produtos.
- **POST** `/produtos` - Cria um novo produto.
- **DELETE** `/produtos/{id}` - Deleta um produto pelo ID.
- **PUT** `/produtos/{id}` - Atualiza um produto existente pelo ID.
- **GET** `/produtos/{id}` - Obtém um produto pelo ID.
- **GET** `/produtos/buscar/{nome}` - Busca produtos por nome (case insensitive).

## Exemplo de Uso

## Criar um novo produto
POST /produtos

Content-Type: application/json

Body: {

  "nome": "Produto A",
  
  "preco": 100.0
  
}

##Atualizar um produto existente

PUT /produtos/{id}
Content-Type: application/json
Body: {
  "nome": "Produto A Atualizado",
  "preco": 150.0
}

