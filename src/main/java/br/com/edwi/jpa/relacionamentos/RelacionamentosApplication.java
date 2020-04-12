package br.com.edwi.jpa.relacionamentos;

import br.com.edwi.jpa.relacionamentos.entities.*;
import br.com.edwi.jpa.relacionamentos.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.util.Optional;

@SpringBootApplication
@EnableTransactionManagement
@AllArgsConstructor
public class RelacionamentosApplication implements CommandLineRunner {

	private PropostaRepository propostaRepository;
	private ClienteRepository clienteRepository;
	private EnderecoCartaRepository enderecoCartaRepository;
	private IdentificadorContratoRepository identificadorContratoRepository;
	private SolicitacaoRepository solicitacaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelacionamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Long start = System.nanoTime();

		Pageable limit = PageRequest.of(0, 1000);

		Optional<PropostaEntity> propostaEntity = this.propostaRepository.findById(53);
		Page<PropostaEntity> propostas = this.propostaRepository.findAll(limit);

		Optional<ClienteEntity> clienteEntity = this.clienteRepository.findById(53);
		Page<ClienteEntity> clientes = this.clienteRepository.findAll(limit);

		Optional<EnderecoCartaEntity> enderecoCartaEntity = this.enderecoCartaRepository.findById(53);
		Page<EnderecoCartaEntity> enderecos = this.enderecoCartaRepository.findAll(limit);

		Optional<IdentificadorContratoEntity> identificadorContratoEntity = this.identificadorContratoRepository.findById(53);
		Page<IdentificadorContratoEntity> contratos = this.identificadorContratoRepository.findAll(limit);

		Optional<SolicitacaoEntity> solicitacaoEntity = this.solicitacaoRepository.findById(53);
		Page<SolicitacaoEntity> solicitacoes = this.solicitacaoRepository.findAll(limit);

		Long end = System.nanoTime();
		Long elapsed = end - start;
		System.out.println("Tempo de execução em milisegundos: [" + elapsed / 1000000 + "].");
	}
}