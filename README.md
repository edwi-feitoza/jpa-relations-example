# jpa-relations-example

Este é um projeto minimalista que tem como objetivo demonstrar como fazer relacionamentos de tabelas em bases SQL usando a especificação JPA, em especial com a implementação Hibernate.

Este projeto foi feito com [Spring Framework](https://spring.io/), usando a ferramenta [Spring Boot](https://start.spring.io/).

Para rodar o projeto localmente em seu computador, são necessários os seguintes recursos:

- [Java 11+](https://openjdk.java.net/projects/jdk/11/)
- [Apache Maven](https://maven.apache.org/download.cgi) 3.6 ou superior
- [MS-SQL Server 2017](https://www.microsoft.com/en-us/sql-server/sql-server-2017)
- IDE de sua preferência para inspecionar o código

Na sua instalação do MS-SQL Server, basta criar um banco de dados chamado **relacionamentos** no default schema. Certifique-se de modificar o arquivo **application.yml** para conectar na sua base. Não é necessário se preocupar com a criação das tabelas. Essa tarefa foi automatizada com o uso do [Flyway](https://flywaydb.org/). Os scripts SQL estão em */src/main/resources/db.migration*. Basta iniciar a aplicação que o Flyway se encarrega de criar e popular as tabelas;

Para tornar a aplicação a mais simples possível, toda a lógica foi feita na classe principal **RelacionamentosApplication**, usando o recurso **CommandLineRunner** do Spring.

O relacionamento proposto nesta primeira versão é entre duas tabelas. Ambas tem chave primária composta por 3 colunas, sendo uma destas colunas preenchida automaticamente por *sequence* do PostgreSql.

O relacionamento foi mapeado na aplicação como **@OneToOne** na aplicação.

Foi aplicado no código um exemplo de como realizar este relacionamento de forma unidirecional, de modo que a implementação JPA faça a menor quantidade possível de acessos ao banco de dados, além de evitar problemas como [N+1](https://blog.algaworks.com/o-problema-do-n-mais-um/);

A tabela **contrato_custodia** é a principal da relação, onde o sequence foi atribuído. A tabela **cliente_custodia** possui os mesmos 3 campos de chave primária composta da tabela anterior, com a diferença que nenhum deles é auto-increment, ou seja, para que seja possível inserir um registro em **cliente_custodia** sem violar *constraint*, é mandatório que exista um registro em **contrato_custodia**.

Note que foi usado a annotation **@MapsId**. Desta forma buscou-se estabelecer um relacionamento da forma mais eficiente possível, não sendo necessário um relacionamento bi-direcional, fazendo com que os campos que fazem parte da chave primária composta (id_contrato, id_qualquer_bosta e data_insercao) sirvam tanto como chave primária como chave estrangeira, facilitando a construção de queries planejadas e antecipando melhor o comportamento do Hibernate (o parâmetro show-sql está ativado, permitindo ver as queries disparadas contra o banco de dados).
