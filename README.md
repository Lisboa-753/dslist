# API de Coleção de Jogos

Este projeto é um Backend de uma coleção de jogos feito com linguagem Java. Este projeto permite que uma API processe as requisições fornecidas por uma ferramenta (nesse projeto foi usado o Postman) e devolva o resultado em formato JSON.
Foi usado o spring Initializr para poder configurar o projeto com JDK 17, Maven, Java, Spring Boot.

## Estrutura do Projeto

O projeto foi desenvolvido usando as seguintes tecnlogias:

- **Java**
- **Spring Boot**
- **Maven**
- **Hibernate**
- **JPA**
- **SQL**

## Pré-requisitos para o projeto 

- **Java**: Foi necesário ter o Java instalado na máquina.
- **JDK** : Foi necessário instalar o JDK 17.
- **Banco Relacional H2**: Para homologar a aplicação foi usando o banco de dados H2.
- **Postman**:  O postman foi a ferramenta utilizado para testar as endpoints da API.
  

## UML

![UML](https://raw.githubusercontent.com/Lisboa-753/dslist/refs/heads/main/UML.png)

## Endpoint da API no Postman

- **Games**: Reponsável por retonar a lista de Games.
- **Games by id** : Retorna os games por ID.
- **Game lists**: Retorna as listas de games da aplicação.
- **Games by lists**: Exibe apenas os games de determinada lista.
- **List replacement**: Responsável por alterar a posição do game na lista a qual pertence.

![ENDPOINT](https://raw.githubusercontent.com/Lisboa-753/dslist/refs/heads/main/EndPoint.png)


