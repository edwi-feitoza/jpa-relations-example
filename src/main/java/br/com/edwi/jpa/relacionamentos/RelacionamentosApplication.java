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

		Optional<SolicitacaoEntity> solicitacaoOptSemCliente = this.solicitacaoRepository.findById(53);
		SolicitacaoEntity solicitacaoEntitySemCliente = solicitacaoOptSemCliente.get();

		Optional<SolicitacaoEntity> solicitacaoOptComCliente = this.solicitacaoRepository.findWithCliente(53);
		SolicitacaoEntity solicitacaoEntityComCliente = solicitacaoOptComCliente.get();

		Page<SolicitacaoEntity> solicitacoes = this.solicitacaoRepository.findAll(limit);

		Page<SolicitacaoEntity> solicitacoesComClientes = this.solicitacaoRepository.findAllWithCliente(limit);

		Page<SolicitacaoEntity> solicitacoesComClientesEEnderecos = this.solicitacaoRepository.findAllWithClienteAndEnderecoCarta(limit);

		Page<ClienteEntity> clienteEntities = this.clienteRepository.findAll(limit);

		System.out.println("Tempo de execução em milisegundos: [" + (System.nanoTime() - start) / 1000000 + "].");
	}
}