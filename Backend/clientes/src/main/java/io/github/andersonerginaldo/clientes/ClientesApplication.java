package io.github.andersonerginaldo.clientes;

import io.github.andersonerginaldo.clientes.model.entity.Cliente;
import io.github.andersonerginaldo.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository){
		return args ->{
			Cliente cliente = Cliente.builder().cpf("97511404391").nome("Fulano").build();
			repository.save(cliente);
			cliente = Cliente.builder().cpf("65082869353").nome("Beltrano").build();
			repository.save(cliente);
		};
	}

	public static void main(String[] args) {

		SpringApplication.run(ClientesApplication.class, args);
	}

}
