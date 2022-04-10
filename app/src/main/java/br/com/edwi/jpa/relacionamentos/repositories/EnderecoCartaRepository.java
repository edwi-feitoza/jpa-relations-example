package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.EnderecoCartaEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface EnderecoCartaRepository extends JpaRepository<EnderecoCartaEntity, SolicitacaoKey> {

    @Query("SELECT e FROM EnderecoCartaEntity e WHERE e.id = :id")
    Optional<EnderecoCartaEntity> findById(@Param("id") Integer id);
}