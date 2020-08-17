CREATE TABLE produto_custodia (
    id_produto INT IDENTITY(1,1) NOT NULL,
    campo_produto_um VARCHAR(100) NOT NULL,
    campo_produto_dois VARCHAR(100) NOT NULL,
    campo_produto_tres VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_produto)
);