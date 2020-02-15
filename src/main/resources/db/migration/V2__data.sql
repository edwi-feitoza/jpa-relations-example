INSERT INTO contrato_custodia (id_qualquer_bosta, data_insercao, campo_contrato_um, campo_contrato_dois, campo_contrato_tres) VALUES
('1111111110', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111111', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111112', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111113', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111114', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111115', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111116', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111117', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111118', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111119', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111120', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111121', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111122', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111123', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111124', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111125', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111126', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111127', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111128', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111129', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111130', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111131', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111132', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111133', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111134', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111135', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111136', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111137', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111138', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA'),
('1111111139', NOW(), 'BLA BLA BLA', 'BLA BLA BLA', 'BLA BLA BLA');

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