package br.com.edwi.jpa.relacionamentos.repository;

import br.com.edwi.jpa.relacionamentos.entities.ProdutoCustodiaEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProdutoCustodiaRepository extends CrudRepository<ProdutoCustodiaEntity, Integer> {

    List<ProdutoCustodiaEntity> findAll();

    @Modifying
    @Query("UPDATE ProdutoCustodiaEntity p SET p.campoProdutoUm = 'QUALQUER COISA PARA TESTAR' WHERE p.id IN :ids")
    Integer atualizaProdutos(@Param("ids")Collection<Integer> ids);

    @Modifying
    @Query("UPDATE ProdutoCustodiaEntity p SET p.campoProdutoUm = 'QUALQUER MERDA PARA TESTAR' WHERE p.id = :id")
    Integer atualizaProdutosUmPorUm(@Param("id") Integer id);
}