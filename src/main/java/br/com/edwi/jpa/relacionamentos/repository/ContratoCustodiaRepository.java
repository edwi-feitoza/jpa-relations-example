package br.com.edwi.jpa.relacionamentos.repository;

import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoCustodiaRepository extends CrudRepository<ContratoCustodiaEntity, ContratoCustodiaKey> { }