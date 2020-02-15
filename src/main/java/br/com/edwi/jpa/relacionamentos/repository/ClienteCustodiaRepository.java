package br.com.edwi.jpa.relacionamentos.repository;

import br.com.edwi.jpa.relacionamentos.entities.ClienteCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteCustodiaRepository  extends CrudRepository<ClienteCustodiaEntity, ContratoCustodiaKey> { }
