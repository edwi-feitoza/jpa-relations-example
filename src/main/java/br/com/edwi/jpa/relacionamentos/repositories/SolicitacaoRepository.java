package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, SolicitacaoKey> {

    @Query("SELECT s FROM SolicitacaoEntity s WHERE s.id = :id")
    Optional<SolicitacaoEntity> findById(@Param("id") Integer id);
}
