CREATE TABLE produto_custodia (
    id_produto SERIAL NOT NULL,
    campo_produto_um varchar(100) NOT NULL,
    campo_produto_dois varchar(100) NOT NULL,
    campo_produto_tres varchar(100) NOT NULL,
    PRIMARY KEY (id_produto)
);