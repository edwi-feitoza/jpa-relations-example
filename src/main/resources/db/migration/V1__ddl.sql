CREATE TABLE contrato_custodia (
    id_contrato INT IDENTITY(1,1) NOT NULL,
    id_qualquer_bosta VARCHAR(20) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    campo_contrato_um VARCHAR(100) NOT NULL,
    campo_contrato_dois VARCHAR(100) NOT NULL,
    campo_contrato_tres VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_contrato, id_qualquer_bosta, data_insercao)
);

CREATE TABLE cliente_custodia (
    id_contrato INT NOT NULL,
    id_qualquer_bosta VARCHAR(20) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    campo_cliente_um VARCHAR(100) NOT NULL,
    campo_cliente_dois VARCHAR(100) NOT NULL,
    campo_cliente_tres VARCHAR(100) NOT NULL,
    PRIMARY KEY (id_contrato, id_qualquer_bosta, data_insercao),
    FOREIGN KEY (id_contrato, id_qualquer_bosta, data_insercao) REFERENCES contrato_custodia (id_contrato, id_qualquer_bosta, data_insercao)
);