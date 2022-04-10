package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.PropostaEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PropostaRepository extends JpaRepository<PropostaEntity, SolicitacaoKey> {

    @Query("SELECT p FROM PropostaEntity p WHERE p.id = :id")
    Optional<PropostaEntity> findById(@Param("id") Integer id);
}
