CREATE TABLE solicitacao (
    id INT IDENTITY(1,1) NOT NULL,
    numero_portabilidade DECIMAL(21) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    identificador_participante_administrado INT NOT NULL,
    identificador_if_proponente INT NOT NULL,
    PRIMARY KEY (id, numero_portabilidade, data_insercao),
    CONSTRAINT identificador_participante_administrado_valido CHECK (identificador_participante_administrado <= 99999999),
    CONSTRAINT identificador_if_proponente_valido CHECK (identificador_if_proponente <= 99999999)
);

CREATE TABLE identificador_contrato (
    id INT NOT NULL,
    numero_portabilidade DECIMAL(21) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    codigo_contrato_original CHAR(40) NOT NULL,
    cnpj_base_if_credora_original INT NOT NULL,
    tipo_contrato CHAR(4) NOT NULL,
    tipo_ente_consignante SMALLINT NOT NULL,
    cnpj_correspondente_bancario BIGINT NOT NULL,
    PRIMARY KEY (id, numero_portabilidade, data_insercao),
    FOREIGN KEY (id, numero_portabilidade, data_insercao) REFERENCES solicitacao (id, numero_portabilidade, data_insercao),
    CONSTRAINT cnpj_base_if_credora_original_valido CHECK (cnpj_base_if_credora_original <= 99999999)
);


CREATE TABLE cliente (
    id INT NOT NULL,
    numero_portabilidade DECIMAL(21) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    tipo CHAR(1) NOT NULL,
    cnpj_cpf VARCHAR(14) NOT NULL,
    nome VARCHAR(80) NOT NULL,
    telefone VARCHAR(13) NOT NULL,
    email VARCHAR(80),
    PRIMARY KEY (id, numero_portabilidade, data_insercao),
    FOREIGN KEY (id, numero_portabilidade, data_insercao) REFERENCES solicitacao (id, numero_portabilidade, data_insercao),
    CONSTRAINT email_minimo_caracteres CHECK (LEN(email) >= 5)
);

CREATE TABLE proposta (
    id INT NOT NULL,
    numero_portabilidade DECIMAL(21) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    data_referencia_saldo_devedor_contabil DATE NOT NULL,
    valor_saldo_devedor_contabil DECIMAL(21,2),
    taxa_juros_nominal DECIMAL(5,2) NOT NULL,
    taxa_juros_efetivo DECIMAL(5,2) NOT NULL,
    taxa_cet DECIMAL(5,2) NOT NULL,
    codigo_moeda SMALLINT NOT NULL,
    indice_remuneracao SMALLINT,
    regime_amortizacao SMALLINT NOT NULL,
    data_contratacao DATE NOT NULL,
    quantidade_total_parcelas INT NOT NULL,
    valor_face_parcelas DECIMAL(21,2) NOT NULL,
    data_vencimento_primeira_parcela DATE NOT NULL,
    data_vencimento_ultima_parcela DATE NOT NULL,
    PRIMARY KEY (id, numero_portabilidade, data_insercao),
    FOREIGN KEY (id, numero_portabilidade, data_insercao) REFERENCES identificador_contrato (id, numero_portabilidade, data_insercao),
    CONSTRAINT codigo_moeda_valido CHECK (codigo_moeda <= 99),
    CONSTRAINT indice_remuneracao_valido CHECK (indice_remuneracao <= 99),
    CONSTRAINT regime_amortizacao_valido CHECK (regime_amortizacao <= 99),
    CONSTRAINT quantidade_total_parcelas_valido CHECK (quantidade_total_parcelas <= 999999999)
);

CREATE TABLE endereco_carta_portabilidade (
    id INT NOT NULL,
    numero_portabilidade DECIMAL(21) NOT NULL,
    data_insercao DATETIME2(6) NOT NULL,
    logradouro VARCHAR(200) NOT NULL,
    complemento VARCHAR(200),
    numero VARCHAR(9) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    uf CHAR(2) NOT NULL,
    cep VARCHAR(8) NOT NULL,
    PRIMARY KEY (id, numero_portabilidade, data_insercao),
    FOREIGN KEY (id, numero_portabilidade, data_insercao) REFERENCES cliente (id, numero_portabilidade, data_insercao),
    CONSTRAINT cidade_valido CHECK (LEN(cidade) >= 1)
);