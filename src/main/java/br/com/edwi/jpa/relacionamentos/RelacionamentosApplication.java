package br.com.edwi.jpa.relacionamentos;

import br.com.edwi.jpa.relacionamentos.entities.ClienteCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaKey;
import br.com.edwi.jpa.relacionamentos.repository.ClienteCustodiaRepository;
import br.com.edwi.jpa.relacionamentos.repository.ContratoCustodiaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootApplication
@EnableTransactionManagement
public class RelacionamentosApplication implements CommandLineRunner {

	private ContratoCustodiaRepository contratoCustodiaRepository;
	private ClienteCustodiaRepository clienteCustodiaRepository;

	public RelacionamentosApplication(ContratoCustodiaRepository contratoCustodiaRepository, ClienteCustodiaRepository clienteCustodiaRepository) {
		this.contratoCustodiaRepository = contratoCustodiaRepository;
		this.clienteCustodiaRepository = clienteCustodiaRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RelacionamentosApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		LocalDateTime dateTime = LocalDateTime.now();
		String qualquerBosta = "beeeeeeeeeeeee";

		ContratoCustodiaEntity contratoCustodiaEntity = new ContratoCustodiaEntity();

		contratoCustodiaEntity.setDataInsercao(dateTime);
		contratoCustodiaEntity.setIdQualquerBosta(qualquerBosta);

		contratoCustodiaEntity.setCampoContratoUm("bla bla bla");
		contratoCustodiaEntity.setCampoContratoDois("ble ble ble");
		contratoCustodiaEntity.setCampoContratoTres("bli bli bli");

		ContratoCustodiaEntity savedContratoCustodia = this.contratoCustodiaRepository.save(contratoCustodiaEntity);

		ClienteCustodiaEntity clienteCustodiaEntity = new ClienteCustodiaEntity(
				savedContratoCustodia.getIdContrato(),
				savedContratoCustodia.getIdQualquerBosta(),
				savedContratoCustodia.getDataInsercao(),
				"Jao",
				"Zeh",
				"Soh doido",
				savedContratoCustodia);
		this.clienteCustodiaRepository.save(clienteCustodiaEntity);

		ContratoCustodiaKey key = new ContratoCustodiaKey();
		key.setIdContrato(savedContratoCustodia.getIdContrato());
		key.setIdQualquerBosta(qualquerBosta);
		key.setDataInsercao(dateTime);
	}
}
