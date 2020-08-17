CREATE TABLE bulk_insert (
  id INT IDENTITY(1,1) NOT NULL,
  numero_portabilidade DECIMAL(21) NOT NULL,
  data_insercao DATETIME2(6) NOT NULL,
  identificador_participante_administrado INT NOT NULL,
  identificador_if_proponente INT NOT NULL,
  PRIMARY KEY (id, numero_portabilidade, data_insercao)
);