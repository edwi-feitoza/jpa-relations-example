USE relacionamentos;
GO
CREATE PROCEDURE getClientes
    @cnpjCpf VARCHAR(14),
    @tipo CHAR(1)
AS
SELECT id, tipo, nome, telefone FROM cliente WHERE cnpj_cpf = @cnpjCpf AND tipo = @tipo;
GO