CREATE TABLE contrato_custodia (
    id_contrato SERIAL NOT NULL,
    id_qualquer_bosta VARCHAR(20) NOT NULL,
    data_insercao TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    campo_contrato_um varchar(100) NOT NULL,
    campo_contrato_dois varchar(100) NOT NULL,
    campo_contrato_tres varchar(100) NOT NULL,
    PRIMARY KEY (id_contrato, id_qualquer_bosta, data_insercao)
);

CREATE TABLE cliente_custodia (
    id_contrato INTEGER NOT NULL,
    id_qualquer_bosta VARCHAR(20) NOT NULL,
    data_insercao TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    campo_cliente_um varchar(100) NOT NULL,
    campo_cliente_dois varchar(100) NOT NULL,
    campo_cliente_tres varchar(100) NOT NULL,
    PRIMARY KEY (id_contrato, id_qualquer_bosta, data_insercao),
    FOREIGN KEY (id_contrato, id_qualquer_bosta, data_insercao) REFERENCES contrato_custodia (id_contrato, id_qualquer_bosta, data_insercao)
);