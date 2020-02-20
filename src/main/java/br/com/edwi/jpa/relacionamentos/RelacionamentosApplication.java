package br.com.edwi.jpa.relacionamentos;

import br.com.edwi.jpa.relacionamentos.entities.ClienteCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ContratoCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.entities.ProdutoCustodiaEntity;
import br.com.edwi.jpa.relacionamentos.repository.ClienteCustodiaRepository;
import br.com.edwi.jpa.relacionamentos.repository.ContratoCustodiaRepository;
import br.com.edwi.jpa.relacionamentos.repository.ProdutoCustodiaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableTransactionManagement
public class RelacionamentosApplication implements CommandLineRunner {

	private ContratoCustodiaRepository contratoCustodiaRepository;
	private ClienteCustodiaRepository clienteCustodiaRepository;
	private ProdutoCustodiaRepository produtoCustodiaRepository;

	public RelacionamentosApplication(ContratoCustodiaRepository contratoCustodiaRepository,
									  ClienteCustodiaRepository clienteCustodiaRepository,
									  ProdutoCustodiaRepository produtoCustodiaRepository) {
		this.contratoCustodiaRepository = contratoCustodiaRepository;
		this.clienteCustodiaRepository = clienteCustodiaRepository;
		this.produtoCustodiaRepository = produtoCustodiaRepository;
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

		List<ProdutoCustodiaEntity> produtos = this.produtoCustodiaRepository.findAll();

		if(produtos.size() > 0) {
			/*produtos.forEach(p -> {
				this.produtoCustodiaRepository.atualizaProdutosUmPorUm(p.getId());
			});*/

			List<Integer> ids = produtos.stream().map(p -> p.getId()).collect(Collectors.toList());
			this.produtoCustodiaRepository.atualizaProdutos(ids);
		}
	}
}
