# jpa-relations-example

Este é um projeto minimalista que tem como objetivo demonstrar como fazer relacionamentos de tabelas em bases SQL usando a especificação JPA, em especial com a implementação Hibernate.

Este projeto foi feito com [Spring Framework](https://spring.io/), usando a ferramenta [Spring Boot](https://start.spring.io/).

Para rodar o projeto localmente em seu computador, são necessários os seguintes recursos:

- [Java 17+](https://openjdk.java.net/projects/jdk/17)
- [Apache Maven](https://maven.apache.org/download.cgi) 3.6 ou superior
- [PostgreSql](https://www.postgresql.org/download/) 12.10 ou superior
- IDE de sua preferência para inspecionar o código

Na sua instalação do PostgreSQL, basta criar um banco de dados chamado **relacionamentos** no default schema. Certifique-se de modificar o arquivo **application.yml** para conectar na sua base. Não é necessário se preocupar com a criação das tabelas. Essa tarefa foi automatizada com o uso do [Flyway](https://flywaydb.org/). Os scripts SQL estão em */src/main/resources/db.migration*. Basta iniciar a aplicação que o Flyway se encarrega de criar e popular as tabelas.

Foi adicionado um [docker-compose](https://docs.docker.com/compose/) no diretorio "infra". Basta executar o docker-compose que tanto a aplicação quanto o banco de dados serão automaticamente provisionados e configurados.

Antes de executar o docker-compose, execute o build do projeto usando "maven install". Isso vai gerar o jar necessário para criar a imagem docker do app.
