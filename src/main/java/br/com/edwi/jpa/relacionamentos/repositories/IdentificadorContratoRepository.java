package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.IdentificadorContratoEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface IdentificadorContratoRepository extends JpaRepository<IdentificadorContratoEntity, SolicitacaoKey> {

    @Query("SELECT i FROM IdentificadorContratoEntity i WHERE i.id = :id")
    Optional<IdentificadorContratoEntity> findById(@Param("id") Integer id);
}
