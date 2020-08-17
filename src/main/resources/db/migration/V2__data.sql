INSERT INTO contrato_custodia (id_qualquer_bosta, data_insercao, campo_contrato_um, campo_contrato_dois, campo_contrato_tres) VALUES
('1111111110', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111111', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111112', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111113', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111114', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111115', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111116', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111117', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111118', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111119', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111120', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111121', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111122', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111123', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111124', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111125', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111126', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111127', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111128', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111129', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111130', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111131', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111132', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111133', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111134', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111135', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111136', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111137', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111138', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111139', GETDATE(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA');

INSERT INTO cliente_custodia
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111110' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111111' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111112' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111113' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111114' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111115' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111116' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111117' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111118' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111119' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111120' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111121' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111122' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111123' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111124' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111125' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111126' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111127' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111128' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111129' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111130' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111131' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111132' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111133' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111134' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111135' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111136' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111137' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111138' UNION ALL
SELECT id_contrato, id_qualquer_bosta, data_insercao, 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA' FROM contrato_custodia WHERE id_qualquer_bosta = '1111111139';