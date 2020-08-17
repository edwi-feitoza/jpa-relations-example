package br.com.edwi.jpa.relacionamentos;

import br.com.edwi.jpa.relacionamentos.entities.ClienteEntity;
import br.com.edwi.jpa.relacionamentos.enums.TipoPessoaEnum;
import br.com.edwi.jpa.relacionamentos.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableTransactionManagement
@RequiredArgsConstructor
public class RelacionamentosApplication implements CommandLineRunner {

	private final ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelacionamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<ClienteEntity> clientes = this.clienteRepository.testStoredProcedure("68228758162", "F")
				.orElseThrow(RuntimeException::new)
				.stream()
				.map(result -> new ClienteEntity(
						(Integer) result[0],
						null,
						null,
						TipoPessoaEnum.valueOf(((Character) result[1]).toString()),
						null,
						(String) result[2],
						(String) result[3],
						null,
						null,
						null)
				).collect(Collectors.toList());
		System.out.println(clientes);
		System.out.println(clientes.size() + " Eeeeeeeitaaaaaaaaaaaaaaaaaa");
	}
}