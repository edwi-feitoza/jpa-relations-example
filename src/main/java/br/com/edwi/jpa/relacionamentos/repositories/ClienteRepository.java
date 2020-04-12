package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.ClienteEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, SolicitacaoKey> {

    @Query("SELECT c FROM ClienteEntity c WHERE c.id = :id")
    Optional<ClienteEntity> findById(@Param("id") Integer id);
}
