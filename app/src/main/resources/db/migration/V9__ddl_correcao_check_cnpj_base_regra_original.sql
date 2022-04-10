ALTER TABLE solicitacao DROP CONSTRAINT identificador_participante_administrado_valido;
ALTER TABLE solicitacao DROP CONSTRAINT identificador_if_proponente_valido;
ALTER TABLE solicitacao ADD CONSTRAINT identificador_participante_administrado_valido CHECK (identificador_participante_administrado <= 99999999);
ALTER TABLE solicitacao ADD CONSTRAINT identificador_if_proponente_valido CHECK (identificador_if_proponente <= 99999999);

ALTER TABLE identificador_contrato DROP CONSTRAINT cnpj_base_if_credora_original_valido;
ALTER TABLE identificador_contrato ADD CONSTRAINT cnpj_base_if_credora_original_valido CHECK ( cnpj_base_if_credora_original <= 99999999);