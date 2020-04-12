package br.com.edwi.jpa.relacionamentos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RelacionamentosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RelacionamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {}
}