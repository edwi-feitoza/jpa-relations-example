package br.com.edwi.jpa.relacionamentos.repositories;

import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoEntity;
import br.com.edwi.jpa.relacionamentos.entities.SolicitacaoKey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, SolicitacaoKey> {

    @Query("SELECT s FROM SolicitacaoEntity s WHERE s.id = :id")
    Optional<SolicitacaoEntity> findById(@Param("id") Integer id);

    @Query("SELECT s FROM SolicitacaoEntity s JOIN FETCH s.cliente WHERE s.id = :id")
    Optional<SolicitacaoEntity> findWithCliente(@Param("id") Integer id);

    @Query(value = "SELECT s FROM SolicitacaoEntity s JOIN FETCH s.cliente",
    countQuery = "SELECT COUNT(s) FROM SolicitacaoEntity s JOIN s.cliente")
    Page<SolicitacaoEntity> findAllWithCliente(Pageable pageable);

    @Query(value = "SELECT s FROM SolicitacaoEntity s JOIN FETCH s.cliente c JOIN FETCH c.enderecoCarta e",
            countQuery = "SELECT COUNT(s) FROM SolicitacaoEntity s JOIN s.cliente c JOIN c.enderecoCarta e")
    Page<SolicitacaoEntity> findAllWithClienteAndEnderecoCarta(Pageable pageable);
}