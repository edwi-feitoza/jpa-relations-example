CREATE TABLE IF NOT EXISTS bulk_insert (
  id SERIAL NOT NULL,
  numero_portabilidade DECIMAL(21) NOT NULL,
  data_insercao TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  identificador_participante_administrado INTEGER NOT NULL,
  identificador_if_proponente INTEGER NOT NULL,
  PRIMARY KEY (id, numero_portabilidade, data_insercao)
);