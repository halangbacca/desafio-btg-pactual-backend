# Desafio Engenheiro de software - BTG Pactual

## Escopo
Processar pedidos e gerar relatório.

## Atividades
1. Aplicação em Java
2. Banco de dados MongoDB
3. Microsserviço que consome dados de uma fila RabbitMQ e grava os dados para conseguir listar as informações:
   - Valor total do pedido
   - Quantidade de Pedidos por Cliente
   - Lista de pedidos realizados por cliente

Exemplo da mensagem que deve ser consumida:

```
   {
       "codigoPedido": 1001,
       "codigoCliente":1,
       "itens": [
           {
               "produto": "lápis",
               "quantidade": 100,
               "preco": 1.10
           },
           {
               "produto": "caderno",
               "quantidade": 10,
               "preco": 1.00
           }
       ]
   }
```

4. API REST, que permite consultar as seguintes informações:
   - Valor total do pedido
   - Quantidade de Pedidos por Cliente
   - Lista de pedidos realizados por cliente

## **Ferramentas Utilizadas para Desenvolvimento**

```
IntelliJ IDEA
DBeaver
Postman
Spring Boot   
Java
MongoDB
RabbitMQ
Docker
```

## **Dependências**

O desenvolvimento de código em Java, em geral, usufrui de um significativo conjunto de bibliotecas e _frameworks_. Esta
reutilização é incorporada em um projeto por meio de dependências. Para gerenciar foi utilizado o _Maven_.

```
Spring Web
Spring Data MongoDB
Spring for RabbitMQ
```

## **Métodos**

Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

## **Respostas**

| Status | Descrição                                                          |
|--------|--------------------------------------------------------------------|
| `200`  | Requisição executada com sucesso (success).                        |
| `201`  | Requisição executada com sucesso (success).                        |
| `400`  | Erros de validação ou os campos informados não existem no sistema. |
| `409`  | Conflito.                                                          |
| `405`  | Método não implementado.                                           |

# **Recursos da API**

| Método     | Endpoint                                             |
|------------|---------------------------------------------------|
| `GET`      | /customers/{customerId}/orders                    |
