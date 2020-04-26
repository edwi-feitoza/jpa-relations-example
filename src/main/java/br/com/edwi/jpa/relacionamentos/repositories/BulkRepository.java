package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.BulkEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulkRepository extends JpaRepository<BulkEntity, SolicitacaoKey> {
}